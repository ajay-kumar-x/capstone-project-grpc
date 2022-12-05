package com.goconsult.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Notification.proto")
public final class NotificationServiceGrpc {

  private NotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "NotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Notification.emailDetail,
      com.goconsult.grpc.Notification.responseMessage> getSendEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEmail",
      requestType = com.goconsult.grpc.Notification.emailDetail.class,
      responseType = com.goconsult.grpc.Notification.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Notification.emailDetail,
      com.goconsult.grpc.Notification.responseMessage> getSendEmailMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Notification.emailDetail, com.goconsult.grpc.Notification.responseMessage> getSendEmailMethod;
    if ((getSendEmailMethod = NotificationServiceGrpc.getSendEmailMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendEmailMethod = NotificationServiceGrpc.getSendEmailMethod) == null) {
          NotificationServiceGrpc.getSendEmailMethod = getSendEmailMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Notification.emailDetail, com.goconsult.grpc.Notification.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NotificationService", "sendEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Notification.emailDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Notification.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("sendEmail"))
                  .build();
          }
        }
     }
     return getSendEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Notification.otpMessage,
      com.goconsult.grpc.Notification.responseMessage> getSendOtpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendOtp",
      requestType = com.goconsult.grpc.Notification.otpMessage.class,
      responseType = com.goconsult.grpc.Notification.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Notification.otpMessage,
      com.goconsult.grpc.Notification.responseMessage> getSendOtpMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Notification.otpMessage, com.goconsult.grpc.Notification.responseMessage> getSendOtpMethod;
    if ((getSendOtpMethod = NotificationServiceGrpc.getSendOtpMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendOtpMethod = NotificationServiceGrpc.getSendOtpMethod) == null) {
          NotificationServiceGrpc.getSendOtpMethod = getSendOtpMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Notification.otpMessage, com.goconsult.grpc.Notification.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NotificationService", "sendOtp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Notification.otpMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Notification.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("sendOtp"))
                  .build();
          }
        }
     }
     return getSendOtpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationServiceStub newStub(io.grpc.Channel channel) {
    return new NotificationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotificationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotificationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NotificationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendEmail(com.goconsult.grpc.Notification.emailDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Notification.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailMethod(), responseObserver);
    }

    /**
     */
    public void sendOtp(com.goconsult.grpc.Notification.otpMessage request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Notification.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSendOtpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Notification.emailDetail,
                com.goconsult.grpc.Notification.responseMessage>(
                  this, METHODID_SEND_EMAIL)))
          .addMethod(
            getSendOtpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Notification.otpMessage,
                com.goconsult.grpc.Notification.responseMessage>(
                  this, METHODID_SEND_OTP)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationServiceStub extends io.grpc.stub.AbstractStub<NotificationServiceStub> {
    private NotificationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendEmail(com.goconsult.grpc.Notification.emailDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Notification.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendOtp(com.goconsult.grpc.Notification.otpMessage request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Notification.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendOtpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationServiceBlockingStub extends io.grpc.stub.AbstractStub<NotificationServiceBlockingStub> {
    private NotificationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.Notification.responseMessage sendEmail(com.goconsult.grpc.Notification.emailDetail request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Notification.responseMessage sendOtp(com.goconsult.grpc.Notification.otpMessage request) {
      return blockingUnaryCall(
          getChannel(), getSendOtpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationServiceFutureStub extends io.grpc.stub.AbstractStub<NotificationServiceFutureStub> {
    private NotificationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Notification.responseMessage> sendEmail(
        com.goconsult.grpc.Notification.emailDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Notification.responseMessage> sendOtp(
        com.goconsult.grpc.Notification.otpMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getSendOtpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL = 0;
  private static final int METHODID_SEND_OTP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL:
          serviceImpl.sendEmail((com.goconsult.grpc.Notification.emailDetail) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Notification.responseMessage>) responseObserver);
          break;
        case METHODID_SEND_OTP:
          serviceImpl.sendOtp((com.goconsult.grpc.Notification.otpMessage) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Notification.responseMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Notification.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationService");
    }
  }

  private static final class NotificationServiceFileDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier {
    NotificationServiceFileDescriptorSupplier() {}
  }

  private static final class NotificationServiceMethodDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationServiceFileDescriptorSupplier())
              .addMethod(getSendEmailMethod())
              .addMethod(getSendOtpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
