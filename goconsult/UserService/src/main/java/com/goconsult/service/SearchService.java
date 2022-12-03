package com.goconsult.service;

import com.goconsult.grpc.SearchAvailableSlotsGrpc;
import com.goconsult.grpc.Slots;
import com.goconsult.grpc.user.SearchServiceGrpc;
import com.goconsult.grpc.user.User;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class SearchService extends SearchServiceGrpc.SearchServiceImplBase {

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


}
