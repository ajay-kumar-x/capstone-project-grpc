package com.goconsult.service;

import com.goconsult.grpc.Auth;
import com.goconsult.grpc.AuthServiceGrpc;
import com.goconsult.grpc.Notification;
import com.goconsult.grpc.NotificationServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;


public class AuthService extends AuthServiceGrpc.AuthServiceImplBase {

    static HashMap<String,String > emailOptMap=new HashMap<String,String >();


    @Override
    public void register(Auth.registrationDetail request, StreamObserver<Auth.registerMessage> responseObserver) {

        Auth.registerMessage.Builder response=Auth.registerMessage.newBuilder();

        String result="";
        if(!request.getUserType().equals("")|| !request.getEmail().equals("")|| !request.getPassword().equals("") || !request.getName().equals(""))
        {
           if(request.getUserType().equals("user") || request.getUserType().equals("counselor")){

               if(EmailHelper.isValidEmail(request.getEmail())){

                  result= DbHelper.registerUSer(request);

                   if(result.length()<5 && result.length()>2){
                       response.setUid(Integer.parseInt(result)).setMessage("Registered Successfully.");
                       System.out.println("Registration Success as "+request.getUserType()+" "+result);
                   }else{
                       response.setMessage(result);
                       System.out.println(result);
                   }

               }else{
                   response.setMessage("Invalid Email address");
               }
           }else{
               response.setMessage("please choose user_type as user or counselor");
           }
        }
        else {
            response.setMessage("Please Enter the detail Correctly");
        }




       responseObserver.onNext(response.build());
       responseObserver.onCompleted();
    }





    //validate the credential and generate the JwtToken with  subject(user_type uid) which will be valid for 10 minute
    @Override
    public void login(Auth.credential request, StreamObserver<Auth.loginMessage> responseObserver) {

        Auth.loginMessage.Builder response=Auth.loginMessage.newBuilder();

        if(request.getEmail().trim().equals("") || request.getPassword().equals("")){
            response.setMessage("Please Enter the detail Correctly");
        }
        else
            {
             String result= DbHelper.ifUserValidThenReturnUserTypeID(request).toString();

             if(! result.equals("false")){
                 //Setting subject and then generating the jwt token which will be valid for 10 minute
                  String token=JwtTokenGenerator.jwtToken(result);
                  response.setAuthToken(token);
                  System.out.println(token);
                  response.setMessage("Logged in successfully");
                  System.out.println("Logged in successfully as "+result);
                }
             else{
                   response.setMessage("Invalid Credential");
                   System.out.println("Invalid credentials");
                 }
              }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }



    //this will send otp to the registered email and set email,otp to HashMap emailOtpMap
    //from Notification Service:8083
    @Override
    public void forgotPassword(Auth.userEmail request, StreamObserver<Auth.responseMessage> responseObserver) {

        Auth.responseMessage.Builder response=Auth.responseMessage.newBuilder();

        if(EmailHelper.isValidEmailAndPresentInDb(request.getEmail())){

            ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",8083).usePlaintext().build();
            NotificationServiceGrpc.NotificationServiceBlockingStub notificationStub=NotificationServiceGrpc.newBlockingStub(channel);

            Notification.otpMessage message=Notification.otpMessage.newBuilder().setRecipient(request.getEmail()).build();
            Notification.responseMessage responseFromNotification=notificationStub.sendOtp(message);

            response.setMessage(responseFromNotification.getMessage());
            response.setResponseCode(200);

            //putting email and otp in map so that we can use in resetting password function.
            emailOptMap.put(request.getEmail(),responseFromNotification.getMessage().split(" ")[5]);

        }else {
            response.setMessage("Email Invalid or not Registered!").setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }




    @Override
    public void resetPassword(Auth.resetDetailWithOtp request, StreamObserver<Auth.responseMessage> responseObserver) {

        Auth.responseMessage.Builder response=Auth.responseMessage.newBuilder();
        String email=request.getEmail();

        if(EmailHelper.isValidEmailAndPresentInDb(email)){
            if(emailOptMap.containsKey(email)){
                if(request.getOtp().equals(emailOptMap.get(email))){
                    if(request.getPassword().trim().equals(request.getConfPassword().trim())){
                        if(DbHelper.updatePassword(email,request.getPassword())==1){
                            response.setMessage("Password updated successfully").setResponseCode(200);
                            emailOptMap.remove(email);
                            System.out.println("Password updated for "+email);
                           }
                        else response.setMessage("Something Went Wrong").setResponseCode(400);
                    }else{
                        response.setMessage("Password not matching").setResponseCode(100);
                    }
                }else{
                    response.setMessage("Invalid Otp").setResponseCode(300);
                }
            }else{
                response.setMessage("please generate Otp first").setResponseCode(400);
            }
        }else{
            response.setMessage("Email Invalid or not registered!").setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}
