package com.goconsult.service;

import com.goconsult.grpc.SearchAvailableSlotsGrpc;
import com.goconsult.grpc.Slots;
import com.goconsult.grpc.User;
import com.goconsult.grpc.UserServiceGrpc;
import com.goconsult.grpc.Booking;
import com.goconsult.grpc.BookingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class UserService extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void register(User.user request, StreamObserver<User.responseMessage> responseObserver) {
        String result = DbHelper.insertIntoUserDB(request);

        User.responseMessage.Builder response = User.responseMessage.newBuilder();

        if (result .equals("1")) {
            response.setMessage("User Details saved successfully");
            response.setResponseCode(200);
            System.out.println("User Detail saved to database");

        } else {
            response.setMessage(result).setResponseCode(400);
            System.out.println(result);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


    @Override
    public void viewProfile(User.Empty request, StreamObserver<User.user> responseObserver) {

        User.user.Builder response= User.user.newBuilder();

        User.user.Builder temp =DbHelper.viewProfileHelper();
        if(temp==null)
        {
            response.clear();
        }
        else {
            response=temp;
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }


    @Override
    public void updateProfile(User.user request, StreamObserver<User.responseMessage> responseObserver) {
        User.responseMessage.Builder response=User.responseMessage.newBuilder();

        String message=DbHelper.updateProfileHelper(request);

        if(message.contains("success")){
            response.setMessage("Details updated for Id: "+DbHelper.UID);
            response.setResponseCode(200);
        }
        else if(message.equals("1")){
            response.setMessage("User Details saved successfully");
            response.setResponseCode(200);
        }
        else{
            response.setMessage(message);
            response.setResponseCode(400);
        }


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }


    @Override
    public void updatePassword(User.updatePasswordDetail request, StreamObserver<User.responseMessage> responseObserver) {

        User.responseMessage.Builder response=User.responseMessage.newBuilder();

        String message=DbHelper.updatePasswordHelper(request);
        if(message.equals("success")){
            response.setMessage("Password Updated").setResponseCode(200);
        }
        else{
            response.setMessage(message).setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }




    //functionality  in Search service:8084
    @Override
    public void allAvailableSlots(User.Empty request, StreamObserver<User.searchResponse> responseObserver) {

        User.searchResponse.Builder response=User.searchResponse.newBuilder();

        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8084).usePlaintext().build();
        SearchAvailableSlotsGrpc.SearchAvailableSlotsBlockingStub searchStub=SearchAvailableSlotsGrpc.newBlockingStub(channel);

        Slots.Empty empty=Slots.Empty.newBuilder().build();
        Slots.searchResponse resultFromSearch=searchStub.searchAll(empty);

        //parsing from Slots.Slot to User.Slot
        List<User.Slot> list=new ArrayList<>();
        for(Slots.Slot s:resultFromSearch.getSlotArrList()){
            User.Slot.Builder data=User.Slot.newBuilder();
           data.setSlotId(s.getSlotId()).setCounselorName(s.getCounselorName()).setCounselorContact(s.getCounselorContact())
                           .setFees(s.getFees()).setSpecialization(s.getSpecialization())
                           .setDate(s.getDate()).setFromTime(s.getFromTime()).setToTime(s.getToTime()).build();
           list.add(data.build());
        }
        if(list.isEmpty()){
            System.out.println("No Slot Available");
        }
        else
           response.addAllSlotArr(list);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    //functionality  in Search service:8084
    @Override
    public void slotsBySpecification(User.searchRequest request, StreamObserver<User.searchResponse> responseObserver) {

        User.searchResponse.Builder response=User.searchResponse.newBuilder();

        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8084).usePlaintext().build();
        SearchAvailableSlotsGrpc.SearchAvailableSlotsBlockingStub searchStub=SearchAvailableSlotsGrpc.newBlockingStub(channel);

        Slots.searchRequest.Builder inputToSearch=Slots.searchRequest.newBuilder();
        inputToSearch.setSearchBy(request.getSearchBy()).setValue(request.getValue()).setLowerLimit(request.getLowerLimit()).setUpperLimit(request.getUpperLimit());
        Slots.searchResponse resultFromSearch=searchStub.searchBySpecification(inputToSearch.build());

        //parsing from Slots.Slot to User.Slot
        List<User.Slot> list=new ArrayList<>();
        for(Slots.Slot s:resultFromSearch.getSlotArrList()){
            User.Slot.Builder data=User.Slot.newBuilder();
            data.setSlotId(s.getSlotId()).setCounselorName(s.getCounselorName()).setCounselorContact(s.getCounselorContact())
                    .setFees(s.getFees()).setSpecialization(s.getSpecialization())
                    .setDate(s.getDate()).setFromTime(s.getFromTime()).setToTime(s.getToTime()).build();
            list.add(data.build());
        }
        if(list.isEmpty()){
            System.out.println("No Slot Available");
        }
        else
            response.addAllSlotArr(list);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }






    //functionality  in Booking service:8085
    @Override
    public void bookSlot(User.slotId request, StreamObserver<User.responseMessage> responseObserver) {

        User.responseMessage.Builder response=User.responseMessage.newBuilder();

        ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();
        BookingServiceGrpc.BookingServiceBlockingStub bookingStub=BookingServiceGrpc.newBlockingStub(channel);

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

        ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost",8085).usePlaintext().build();
        BookingServiceGrpc.BookingServiceBlockingStub bookingStub=BookingServiceGrpc.newBlockingStub(channel);

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
}
