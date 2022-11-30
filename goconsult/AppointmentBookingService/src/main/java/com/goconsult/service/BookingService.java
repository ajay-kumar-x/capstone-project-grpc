package com.goconsult.service;


import com.goconsult.grpc.Booking;
import com.goconsult.grpc.BookingServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.List;

public class BookingService extends BookingServiceGrpc.BookingServiceImplBase {
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
}
