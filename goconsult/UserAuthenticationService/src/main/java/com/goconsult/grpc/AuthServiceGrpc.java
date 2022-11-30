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
    comments = "Source: Auth.proto")
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final String SERVICE_NAME = "AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.user,
      com.goconsult.grpc.Auth.registerMessage> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = com.goconsult.grpc.Auth.user.class,
      responseType = com.goconsult.grpc.Auth.registerMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.user,
      com.goconsult.grpc.Auth.registerMessage> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.user, com.goconsult.grpc.Auth.registerMessage> getRegisterMethod;
    if ((getRegisterMethod = AuthServiceGrpc.getRegisterMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRegisterMethod = AuthServiceGrpc.getRegisterMethod) == null) {
          AuthServiceGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Auth.user, com.goconsult.grpc.Auth.registerMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.user.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.registerMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.credential,
      com.goconsult.grpc.Auth.loginMessage> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.goconsult.grpc.Auth.credential.class,
      responseType = com.goconsult.grpc.Auth.loginMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.credential,
      com.goconsult.grpc.Auth.loginMessage> getLoginMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.credential, com.goconsult.grpc.Auth.loginMessage> getLoginMethod;
    if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getLoginMethod = AuthServiceGrpc.getLoginMethod) == null) {
          AuthServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Auth.credential, com.goconsult.grpc.Auth.loginMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.credential.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.loginMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.userEmail,
      com.goconsult.grpc.Auth.responseMessage> getForgotPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "forgotPassword",
      requestType = com.goconsult.grpc.Auth.userEmail.class,
      responseType = com.goconsult.grpc.Auth.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.userEmail,
      com.goconsult.grpc.Auth.responseMessage> getForgotPasswordMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.userEmail, com.goconsult.grpc.Auth.responseMessage> getForgotPasswordMethod;
    if ((getForgotPasswordMethod = AuthServiceGrpc.getForgotPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getForgotPasswordMethod = AuthServiceGrpc.getForgotPasswordMethod) == null) {
          AuthServiceGrpc.getForgotPasswordMethod = getForgotPasswordMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Auth.userEmail, com.goconsult.grpc.Auth.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "forgotPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.userEmail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("forgotPassword"))
                  .build();
          }
        }
     }
     return getForgotPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.resetDetailWithOtp,
      com.goconsult.grpc.Auth.responseMessage> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetPassword",
      requestType = com.goconsult.grpc.Auth.resetDetailWithOtp.class,
      responseType = com.goconsult.grpc.Auth.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.resetDetailWithOtp,
      com.goconsult.grpc.Auth.responseMessage> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Auth.resetDetailWithOtp, com.goconsult.grpc.Auth.responseMessage> getResetPasswordMethod;
    if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
          AuthServiceGrpc.getResetPasswordMethod = getResetPasswordMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Auth.resetDetailWithOtp, com.goconsult.grpc.Auth.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AuthService", "resetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.resetDetailWithOtp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Auth.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("resetPassword"))
                  .build();
          }
        }
     }
     return getResetPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    return new AuthServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.goconsult.grpc.Auth.user request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.registerMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void login(com.goconsult.grpc.Auth.credential request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.loginMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     *functionality  of Notification Service
     * </pre>
     */
    public void forgotPassword(com.goconsult.grpc.Auth.userEmail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getForgotPasswordMethod(), responseObserver);
    }

    /**
     */
    public void resetPassword(com.goconsult.grpc.Auth.resetDetailWithOtp request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Auth.user,
                com.goconsult.grpc.Auth.registerMessage>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Auth.credential,
                com.goconsult.grpc.Auth.loginMessage>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getForgotPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Auth.userEmail,
                com.goconsult.grpc.Auth.responseMessage>(
                  this, METHODID_FORGOT_PASSWORD)))
          .addMethod(
            getResetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Auth.resetDetailWithOtp,
                com.goconsult.grpc.Auth.responseMessage>(
                  this, METHODID_RESET_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class AuthServiceStub extends io.grpc.stub.AbstractStub<AuthServiceStub> {
    private AuthServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(com.goconsult.grpc.Auth.user request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.registerMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.goconsult.grpc.Auth.credential request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.loginMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *functionality  of Notification Service
     * </pre>
     */
    public void forgotPassword(com.goconsult.grpc.Auth.userEmail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(com.goconsult.grpc.Auth.resetDetailWithOtp request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthServiceBlockingStub extends io.grpc.stub.AbstractStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.Auth.registerMessage register(com.goconsult.grpc.Auth.user request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Auth.loginMessage login(com.goconsult.grpc.Auth.credential request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *functionality  of Notification Service
     * </pre>
     */
    public com.goconsult.grpc.Auth.responseMessage forgotPassword(com.goconsult.grpc.Auth.userEmail request) {
      return blockingUnaryCall(
          getChannel(), getForgotPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Auth.responseMessage resetPassword(com.goconsult.grpc.Auth.resetDetailWithOtp request) {
      return blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthServiceFutureStub extends io.grpc.stub.AbstractStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Auth.registerMessage> register(
        com.goconsult.grpc.Auth.user request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Auth.loginMessage> login(
        com.goconsult.grpc.Auth.credential request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *functionality  of Notification Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Auth.responseMessage> forgotPassword(
        com.goconsult.grpc.Auth.userEmail request) {
      return futureUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Auth.responseMessage> resetPassword(
        com.goconsult.grpc.Auth.resetDetailWithOtp request) {
      return futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_FORGOT_PASSWORD = 2;
  private static final int METHODID_RESET_PASSWORD = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.goconsult.grpc.Auth.user) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.registerMessage>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.goconsult.grpc.Auth.credential) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.loginMessage>) responseObserver);
          break;
        case METHODID_FORGOT_PASSWORD:
          serviceImpl.forgotPassword((com.goconsult.grpc.Auth.userEmail) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.responseMessage>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.goconsult.grpc.Auth.resetDetailWithOtp) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Auth.responseMessage>) responseObserver);
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

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Auth.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getLoginMethod())
              .addMethod(getForgotPasswordMethod())
              .addMethod(getResetPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
