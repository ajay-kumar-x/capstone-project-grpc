package com.goconsult.service;

import com.goconsult.grpc.*;
import com.goconsult.grpc.user.ProfileServiceGrpc;
import com.goconsult.grpc.user.User;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class ProfileService extends ProfileServiceGrpc.ProfileServiceImplBase {



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



}
