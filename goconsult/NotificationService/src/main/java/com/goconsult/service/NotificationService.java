package com.goconsult.service;

import com.goconsult.grpc.Notification;
import com.goconsult.grpc.NotificationServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.util.Random;

public class NotificationService extends NotificationServiceGrpc.NotificationServiceImplBase {

    @Override
    public void sendEmail(Notification.emailDetail request, StreamObserver<Notification.responseMessage> responseObserver) {
        String recipient=request.getRecipient();
        String subject=request.getSubject();
        String message=request.getMessage();

        Notification.responseMessage.Builder response=Notification.responseMessage.newBuilder();
        int result=EmailSendHelper.sendEmail(recipient,subject,message);
        if(result==1){
            response.setMessage("Email sent successfully").setResponseCode(200);
        }
        else response.setMessage("Something went wrong").setResponseCode(400);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void sendOtp(Notification.otpMessage request, StreamObserver<Notification.responseMessage> responseObserver) {
        String recipient=request.getRecipient();

        String otp = String.format("%04d", new Random().nextInt(10000));


        Notification.responseMessage.Builder response=Notification.responseMessage.newBuilder();
        int result=EmailSendHelper.sendEmail(recipient,"OTP for resetting password","Your otp for resetting the password is: "+otp);
        if(result==1){
            response.setMessage("Otp sent successfully to: "+recipient+" "+otp).setResponseCode(200);
            System.out.println(response.getMessage().split(" ")[4]+" " +response.getMessage().split(" ")[5]);
        }
        else response.setMessage("Something went wrong").setResponseCode(400);

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
