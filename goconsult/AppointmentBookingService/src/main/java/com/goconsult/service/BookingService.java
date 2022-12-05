package com.goconsult.service;


import com.goconsult.grpc.Booking;
import com.goconsult.grpc.BookingServiceGrpc;
import com.goconsult.grpc.SearchAvailableSlotsGrpc;
import com.goconsult.grpc.Slots;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class BookingService extends BookingServiceGrpc.BookingServiceImplBase {

    //A user can book the slot by giving slot_id and his user_id(which will later automatically fetched in userService)
    @Override
    public void bookSlot(Booking.bookingRequest request, StreamObserver<Booking.bookingResponse> responseObserver) {

       Booking.bookingResponse.Builder response=Booking.bookingResponse.newBuilder();

       String message=DbHelper.bookSlotHelper(request);

       if(message.equals("success")){
       response.setMessage("Slot booked Successfully!").setResponseCode(200);
       }
       else response.setMessage(message).setResponseCode(400);

       responseObserver.onNext(response.build());
       responseObserver.onCompleted();
    }


    //A user can see all the bookings made by him
    @Override
    public void viewBookedSlotForUser(Booking.userId request, StreamObserver<Booking.counselorSlotArr> responseObserver) {

        Booking.counselorSlotArr.Builder response= Booking.counselorSlotArr.newBuilder();

        List<Booking.CounselorSlot> result=DbHelper.viewBookedSlotForUserHelper(request.getUserId());

        if(result.isEmpty()){
            System.out.println("No Bookings");
        }
        else
            response.addAllSlotArr(result);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }


    // A counselor can see all details of his booked slots
    @Override
    public void viewBookedSlotForCounselor(Booking.counselorId request, StreamObserver<Booking.userSlotArr> responseObserver) {

        Booking.userSlotArr.Builder response=Booking.userSlotArr.newBuilder();

        List<Booking.UserSlot> result=DbHelper.viewBookedSlotForCounselorHelper(request.getCounselorId());

        if(result.isEmpty()){
            System.out.println("No Bookings");
        }
        else
            response.addAllSlotArr(result);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }



    //user SearchService :8084
    @Override
    public void rescheduleBooking(Booking.rescheduleDetail request, StreamObserver<Booking.bookingResponse> responseObserver) {

        Booking.bookingResponse.Builder response=Booking.bookingResponse.newBuilder();

        //getting the list of booked slot by user so that we can verify the booking_id
        List<Booking.CounselorSlot> listOfBookings=DbHelper.viewBookedSlotForUserHelper(request.getUserId());

        boolean bookingIdValid=listOfBookings.stream().anyMatch(e->e.getBookingId()==request.getBookingId());
        if(bookingIdValid){

            //checking for available slots and checking if the provided slot_id *is available or not
            ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8084).usePlaintext().build();
            SearchAvailableSlotsGrpc.SearchAvailableSlotsBlockingStub searchStub=SearchAvailableSlotsGrpc.newBlockingStub(channel);

            Slots.Empty empty=Slots.Empty.newBuilder().build();
            Slots.searchResponse resultFromSearch=searchStub.searchAll(empty);

            int fees=0;
            boolean isSlotIdAvailable=false;
            for(Slots.Slot s:resultFromSearch.getSlotArrList()){
                if(s.getSlotId()==request.getSlotId()){
                    fees=s.getFees();
                    isSlotIdAvailable=true;
                    break;
                }
            }

            if(isSlotIdAvailable){
                int isupdated=DbHelper.rescheduleBookingDetailHelper(request,fees);
                if(isupdated==1){
                response.setMessage("Rescheduled successfully").setResponseCode(200);
                }else{
                    response.setMessage("Something went wrong").setResponseCode(400);
                }
            }else {

                response.setMessage("SlotId not available").setResponseCode(400);
            }


        }else{
            response.setMessage("Invalid BookingId").setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


}
