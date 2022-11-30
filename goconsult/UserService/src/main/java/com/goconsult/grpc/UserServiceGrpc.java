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
    comments = "Source: User.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.user,
      com.goconsult.grpc.User.responseMessage> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = com.goconsult.grpc.User.user.class,
      responseType = com.goconsult.grpc.User.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.user,
      com.goconsult.grpc.User.responseMessage> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.user, com.goconsult.grpc.User.responseMessage> getRegisterMethod;
    if ((getRegisterMethod = UserServiceGrpc.getRegisterMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterMethod = UserServiceGrpc.getRegisterMethod) == null) {
          UserServiceGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.user, com.goconsult.grpc.User.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.user.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty,
      com.goconsult.grpc.User.user> getViewProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewProfile",
      requestType = com.goconsult.grpc.User.Empty.class,
      responseType = com.goconsult.grpc.User.user.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty,
      com.goconsult.grpc.User.user> getViewProfileMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty, com.goconsult.grpc.User.user> getViewProfileMethod;
    if ((getViewProfileMethod = UserServiceGrpc.getViewProfileMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getViewProfileMethod = UserServiceGrpc.getViewProfileMethod) == null) {
          UserServiceGrpc.getViewProfileMethod = getViewProfileMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.Empty, com.goconsult.grpc.User.user>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "viewProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.user.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("viewProfile"))
                  .build();
          }
        }
     }
     return getViewProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.user,
      com.goconsult.grpc.User.responseMessage> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProfile",
      requestType = com.goconsult.grpc.User.user.class,
      responseType = com.goconsult.grpc.User.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.user,
      com.goconsult.grpc.User.responseMessage> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.user, com.goconsult.grpc.User.responseMessage> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = UserServiceGrpc.getUpdateProfileMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateProfileMethod = UserServiceGrpc.getUpdateProfileMethod) == null) {
          UserServiceGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.user, com.goconsult.grpc.User.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "updateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.user.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.updatePasswordDetail,
      com.goconsult.grpc.User.responseMessage> getUpdatePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePassword",
      requestType = com.goconsult.grpc.User.updatePasswordDetail.class,
      responseType = com.goconsult.grpc.User.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.updatePasswordDetail,
      com.goconsult.grpc.User.responseMessage> getUpdatePasswordMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.updatePasswordDetail, com.goconsult.grpc.User.responseMessage> getUpdatePasswordMethod;
    if ((getUpdatePasswordMethod = UserServiceGrpc.getUpdatePasswordMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdatePasswordMethod = UserServiceGrpc.getUpdatePasswordMethod) == null) {
          UserServiceGrpc.getUpdatePasswordMethod = getUpdatePasswordMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.updatePasswordDetail, com.goconsult.grpc.User.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "updatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.updatePasswordDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("updatePassword"))
                  .build();
          }
        }
     }
     return getUpdatePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty,
      com.goconsult.grpc.User.searchResponse> getAllAvailableSlotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allAvailableSlots",
      requestType = com.goconsult.grpc.User.Empty.class,
      responseType = com.goconsult.grpc.User.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty,
      com.goconsult.grpc.User.searchResponse> getAllAvailableSlotsMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty, com.goconsult.grpc.User.searchResponse> getAllAvailableSlotsMethod;
    if ((getAllAvailableSlotsMethod = UserServiceGrpc.getAllAvailableSlotsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAllAvailableSlotsMethod = UserServiceGrpc.getAllAvailableSlotsMethod) == null) {
          UserServiceGrpc.getAllAvailableSlotsMethod = getAllAvailableSlotsMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.Empty, com.goconsult.grpc.User.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "allAvailableSlots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("allAvailableSlots"))
                  .build();
          }
        }
     }
     return getAllAvailableSlotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.searchRequest,
      com.goconsult.grpc.User.searchResponse> getSlotsBySpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "slotsBySpecification",
      requestType = com.goconsult.grpc.User.searchRequest.class,
      responseType = com.goconsult.grpc.User.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.searchRequest,
      com.goconsult.grpc.User.searchResponse> getSlotsBySpecificationMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.searchRequest, com.goconsult.grpc.User.searchResponse> getSlotsBySpecificationMethod;
    if ((getSlotsBySpecificationMethod = UserServiceGrpc.getSlotsBySpecificationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSlotsBySpecificationMethod = UserServiceGrpc.getSlotsBySpecificationMethod) == null) {
          UserServiceGrpc.getSlotsBySpecificationMethod = getSlotsBySpecificationMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.searchRequest, com.goconsult.grpc.User.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "slotsBySpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.searchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("slotsBySpecification"))
                  .build();
          }
        }
     }
     return getSlotsBySpecificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.slotId,
      com.goconsult.grpc.User.responseMessage> getBookSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookSlot",
      requestType = com.goconsult.grpc.User.slotId.class,
      responseType = com.goconsult.grpc.User.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.slotId,
      com.goconsult.grpc.User.responseMessage> getBookSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.slotId, com.goconsult.grpc.User.responseMessage> getBookSlotMethod;
    if ((getBookSlotMethod = UserServiceGrpc.getBookSlotMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getBookSlotMethod = UserServiceGrpc.getBookSlotMethod) == null) {
          UserServiceGrpc.getBookSlotMethod = getBookSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.slotId, com.goconsult.grpc.User.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "bookSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.slotId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("bookSlot"))
                  .build();
          }
        }
     }
     return getBookSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty,
      com.goconsult.grpc.User.counselorSlotArr> getViewBookedSlotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewBookedSlots",
      requestType = com.goconsult.grpc.User.Empty.class,
      responseType = com.goconsult.grpc.User.counselorSlotArr.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty,
      com.goconsult.grpc.User.counselorSlotArr> getViewBookedSlotsMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.User.Empty, com.goconsult.grpc.User.counselorSlotArr> getViewBookedSlotsMethod;
    if ((getViewBookedSlotsMethod = UserServiceGrpc.getViewBookedSlotsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getViewBookedSlotsMethod = UserServiceGrpc.getViewBookedSlotsMethod) == null) {
          UserServiceGrpc.getViewBookedSlotsMethod = getViewBookedSlotsMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.User.Empty, com.goconsult.grpc.User.counselorSlotArr>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "viewBookedSlots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.User.counselorSlotArr.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("viewBookedSlots"))
                  .build();
          }
        }
     }
     return getViewBookedSlotsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.goconsult.grpc.User.user request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void viewProfile(com.goconsult.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.user> responseObserver) {
      asyncUnimplementedUnaryCall(getViewProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(com.goconsult.grpc.User.user request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updatePassword(com.goconsult.grpc.User.updatePasswordDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     *from Search service
     * </pre>
     */
    public void allAvailableSlots(com.goconsult.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllAvailableSlotsMethod(), responseObserver);
    }

    /**
     */
    public void slotsBySpecification(com.goconsult.grpc.User.searchRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSlotsBySpecificationMethod(), responseObserver);
    }

    /**
     * <pre>
     *from booking service
     * </pre>
     */
    public void bookSlot(com.goconsult.grpc.User.slotId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getBookSlotMethod(), responseObserver);
    }

    /**
     */
    public void viewBookedSlots(com.goconsult.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.counselorSlotArr> responseObserver) {
      asyncUnimplementedUnaryCall(getViewBookedSlotsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.user,
                com.goconsult.grpc.User.responseMessage>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getViewProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.Empty,
                com.goconsult.grpc.User.user>(
                  this, METHODID_VIEW_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.user,
                com.goconsult.grpc.User.responseMessage>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getUpdatePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.updatePasswordDetail,
                com.goconsult.grpc.User.responseMessage>(
                  this, METHODID_UPDATE_PASSWORD)))
          .addMethod(
            getAllAvailableSlotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.Empty,
                com.goconsult.grpc.User.searchResponse>(
                  this, METHODID_ALL_AVAILABLE_SLOTS)))
          .addMethod(
            getSlotsBySpecificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.searchRequest,
                com.goconsult.grpc.User.searchResponse>(
                  this, METHODID_SLOTS_BY_SPECIFICATION)))
          .addMethod(
            getBookSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.slotId,
                com.goconsult.grpc.User.responseMessage>(
                  this, METHODID_BOOK_SLOT)))
          .addMethod(
            getViewBookedSlotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.User.Empty,
                com.goconsult.grpc.User.counselorSlotArr>(
                  this, METHODID_VIEW_BOOKED_SLOTS)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(com.goconsult.grpc.User.user request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewProfile(com.goconsult.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.user> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(com.goconsult.grpc.User.user request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassword(com.goconsult.grpc.User.updatePasswordDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *from Search service
     * </pre>
     */
    public void allAvailableSlots(com.goconsult.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllAvailableSlotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void slotsBySpecification(com.goconsult.grpc.User.searchRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSlotsBySpecificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *from booking service
     * </pre>
     */
    public void bookSlot(com.goconsult.grpc.User.slotId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewBookedSlots(com.goconsult.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.User.counselorSlotArr> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewBookedSlotsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.User.responseMessage register(com.goconsult.grpc.User.user request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.User.user viewProfile(com.goconsult.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.User.responseMessage updateProfile(com.goconsult.grpc.User.user request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.User.responseMessage updatePassword(com.goconsult.grpc.User.updatePasswordDetail request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *from Search service
     * </pre>
     */
    public com.goconsult.grpc.User.searchResponse allAvailableSlots(com.goconsult.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllAvailableSlotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.User.searchResponse slotsBySpecification(com.goconsult.grpc.User.searchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSlotsBySpecificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *from booking service
     * </pre>
     */
    public com.goconsult.grpc.User.responseMessage bookSlot(com.goconsult.grpc.User.slotId request) {
      return blockingUnaryCall(
          getChannel(), getBookSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.User.counselorSlotArr viewBookedSlots(com.goconsult.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewBookedSlotsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.responseMessage> register(
        com.goconsult.grpc.User.user request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.user> viewProfile(
        com.goconsult.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.responseMessage> updateProfile(
        com.goconsult.grpc.User.user request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.responseMessage> updatePassword(
        com.goconsult.grpc.User.updatePasswordDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *from Search service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.searchResponse> allAvailableSlots(
        com.goconsult.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllAvailableSlotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.searchResponse> slotsBySpecification(
        com.goconsult.grpc.User.searchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSlotsBySpecificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *from booking service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.responseMessage> bookSlot(
        com.goconsult.grpc.User.slotId request) {
      return futureUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.User.counselorSlotArr> viewBookedSlots(
        com.goconsult.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewBookedSlotsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_VIEW_PROFILE = 1;
  private static final int METHODID_UPDATE_PROFILE = 2;
  private static final int METHODID_UPDATE_PASSWORD = 3;
  private static final int METHODID_ALL_AVAILABLE_SLOTS = 4;
  private static final int METHODID_SLOTS_BY_SPECIFICATION = 5;
  private static final int METHODID_BOOK_SLOT = 6;
  private static final int METHODID_VIEW_BOOKED_SLOTS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.goconsult.grpc.User.user) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage>) responseObserver);
          break;
        case METHODID_VIEW_PROFILE:
          serviceImpl.viewProfile((com.goconsult.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.user>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((com.goconsult.grpc.User.user) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((com.goconsult.grpc.User.updatePasswordDetail) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage>) responseObserver);
          break;
        case METHODID_ALL_AVAILABLE_SLOTS:
          serviceImpl.allAvailableSlots((com.goconsult.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.searchResponse>) responseObserver);
          break;
        case METHODID_SLOTS_BY_SPECIFICATION:
          serviceImpl.slotsBySpecification((com.goconsult.grpc.User.searchRequest) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.searchResponse>) responseObserver);
          break;
        case METHODID_BOOK_SLOT:
          serviceImpl.bookSlot((com.goconsult.grpc.User.slotId) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.responseMessage>) responseObserver);
          break;
        case METHODID_VIEW_BOOKED_SLOTS:
          serviceImpl.viewBookedSlots((com.goconsult.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.User.counselorSlotArr>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getViewProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getUpdatePasswordMethod())
              .addMethod(getAllAvailableSlotsMethod())
              .addMethod(getSlotsBySpecificationMethod())
              .addMethod(getBookSlotMethod())
              .addMethod(getViewBookedSlotsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
