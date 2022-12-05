package com.goconsult.service;


import com.goconsult.grpc.Booking;
import com.goconsult.grpc.counselor.Counselor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class BookingService extends com.goconsult.grpc.counselor.BookingServiceGrpc.BookingServiceImplBase {

    //functionality  in Booking service:8085
    @Override
    public void viewBookedSlots(Counselor.Empty request, StreamObserver<Counselor.userSlotArr> responseObserver) {

        Counselor.userSlotArr.Builder response=Counselor.userSlotArr.newBuilder();

        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();
        com.goconsult.grpc.BookingServiceGrpc.BookingServiceBlockingStub bookingStub= com.goconsult.grpc.BookingServiceGrpc.newBlockingStub(channel);

        Booking.counselorId counselorId= Booking.counselorId.newBuilder().setCounselorId(DbHelper.UID).build();
        Booking.userSlotArr responseListFromBooking=bookingStub.viewBookedSlotForCounselor(counselorId);

        //parsing Booking.userSlot to Counselor.userSlot
        List<Counselor.UserSlot> list=new ArrayList<>();
        for(Booking.UserSlot s:responseListFromBooking.getSlotArrList()){
            Counselor.UserSlot.Builder data=Counselor.UserSlot.newBuilder();
            data.setBookingId(s.getBookingId()).setSlotId(s.getSlotId()).setUserName(s.getUserName())
                    .setContact(s.getContact()).setDate(s.getDate()).setFromTime(s.getFromTime()).setToTime(s.getToTime());
            list.add(data.build());
        }

        if(list.isEmpty()){
            System.out.println("No Bookings");
        }else
            response.addAllSlotArr(list);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

}
