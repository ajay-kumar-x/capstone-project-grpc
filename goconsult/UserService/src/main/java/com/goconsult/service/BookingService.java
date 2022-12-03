package com.goconsult.service;

import com.goconsult.grpc.Booking;
import com.goconsult.grpc.BookingServiceGrpc;
import com.goconsult.grpc.user.User;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class BookingService extends com.goconsult.grpc.user.BookingServiceGrpc.BookingServiceImplBase {

    //channel to Booking Service
    ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();
    BookingServiceGrpc.BookingServiceBlockingStub bookingStub=BookingServiceGrpc.newBlockingStub(channel);


    //functionality  in Booking service:8085
    @Override
    public void bookSlot(User.slotId request, StreamObserver<User.responseMessage> responseObserver) {

        User.responseMessage.Builder response=User.responseMessage.newBuilder();


        Booking.bookingRequest bookingRequestDetail=Booking.bookingRequest.newBuilder().setSlotId(request.getSlotId()).setUserId(DbHelper.UID).build();
        Booking.bookingResponse responseFromBooking=bookingStub.bookSlot(bookingRequestDetail);


        response.setMessage(responseFromBooking.getMessage()).setResponseCode(responseFromBooking.getResponseCode());


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }



    //functionality  in Booking service:8085
    @Override
    public void viewBookedSlots(User.Empty request, StreamObserver<User.counselorSlotArr> responseObserver) {

        User.counselorSlotArr.Builder response=User.counselorSlotArr.newBuilder();


        Booking.userId userId=Booking.userId.newBuilder().setUserId(DbHelper.UID).build();
        Booking.counselorSlotArr responseListFromBooking=bookingStub.viewBookedSlotForUser(userId);

        //parsing Booking.CounselorSlot to User.CounselorSlot
        List<User.CounselorSlot> list=new ArrayList<>();
        for(Booking.CounselorSlot s:responseListFromBooking.getSlotArrList()){
            User.CounselorSlot.Builder data=User.CounselorSlot.newBuilder();
            data.setBookingId(s.getBookingId()).setSlotId(s.getSlotId()).setCounselorName(s.getCounselorName())
                    .setContact(s.getContact()).setSpecialization(s.getSpecialization())
                    .setDate(s.getDate()).setFromTime(s.getFromTime()).setToTime(s.getToTime()).setTotalAmount(s.getTotalAmount());
            list.add(data.build());
        }
        if(list.isEmpty()){
            System.out.println("No Bookings");
        }else
            response.addAllSlotArr(list);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


    @Override
    public void rescheduleBooking(User.rescheduleDetail request, StreamObserver<User.responseMessage> responseObserver) {

        User.responseMessage.Builder response=User.responseMessage.newBuilder();

        Booking.rescheduleDetail rescheduleDetail=Booking.rescheduleDetail.newBuilder()
                .setUserId(DbHelper.UID).setBookingId(request.getBookingId()).setSlotId(request.getSlotId()).build();
        Booking.bookingResponse responseFromBooking=bookingStub.rescheduleBooking(rescheduleDetail);

        response.setMessage(responseFromBooking.getMessage()).setResponseCode(responseFromBooking.getResponseCode());

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
