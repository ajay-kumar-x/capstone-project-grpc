package com.goconsult.service;

import com.goconsult.grpc.Booking;
import com.goconsult.grpc.BookingServiceGrpc;
import com.goconsult.grpc.Counselor;
import com.goconsult.grpc.SlotServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class SlotService extends SlotServiceGrpc.SlotServiceImplBase {

    @Override
    public void addSlot(Counselor.slot request, StreamObserver<Counselor.responseMessage> responseObserver) {

        String result=DbHelper.insertIntoSlotDB(request);

        Counselor.responseMessage.Builder response = Counselor.responseMessage.newBuilder();

        if (result.contains("success")) {
            response.setMessage("Slot added to table");
            response.setResponseCode(200);
            System.out.println("Slot added to table");
        }
        else if(result.contains("slot_counselor_id_fkey")){
            response.setMessage("Please Register or update the Details first");
            response.setResponseCode(200);
        }
        else {
            response.setMessage(result);
            response.setResponseCode(400);
            System.out.println(result);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


    @Override
    public void viewAllSlot(Counselor.Empty request, StreamObserver<Counselor.viewSlotResponse> responseObserver) {

        List<Counselor.slotDetail> result=DbHelper.viewAllSlotHelper();

        Counselor.viewSlotResponse.Builder response=Counselor.viewSlotResponse.newBuilder();

        if(result!=null){
            response.addAllSlotArr(result);
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }


    @Override
    public void deleteSlot(Counselor.slotIdToBeDeleted request, StreamObserver<Counselor.responseMessage> responseObserver) {

        Counselor.responseMessage.Builder response=Counselor.responseMessage.newBuilder();
        int res=DbHelper.deleteSlotBySlotId(request.getSlotId());
        if(res==1){
            response.setMessage("Slot deleted with slotID:"+request.getSlotId()).setResponseCode(200);
        }else {
            response.setMessage("Something Went wrong!").setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void updateSlot(Counselor.slotDetail request, StreamObserver<Counselor.responseMessage> responseObserver) {

        String result=DbHelper.updateSlotHelper(request);

        Counselor.responseMessage.Builder response=Counselor.responseMessage.newBuilder();

        if(result.equals("success"))
            response.setMessage("Slot updated Successfully").setResponseCode(200);
        else if(result.equals("failure"))
            response.setMessage("Slot id doesn't exit or make sure you have completed your registration.").setResponseCode(201);
        else response.setMessage("Something went wrong!").setResponseCode(400);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }




    //functionality  in Booking service:8085
    @Override
    public void viewBookedSlots(Counselor.Empty request, StreamObserver<Counselor.userSlotArr> responseObserver) {

        Counselor.userSlotArr.Builder response=Counselor.userSlotArr.newBuilder();

        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();
        BookingServiceGrpc.BookingServiceBlockingStub bookingStub=BookingServiceGrpc.newBlockingStub(channel);

        Booking.counselorId counselorId=Booking.counselorId.newBuilder().setCounselorId(DbHelper.UID).build();
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
