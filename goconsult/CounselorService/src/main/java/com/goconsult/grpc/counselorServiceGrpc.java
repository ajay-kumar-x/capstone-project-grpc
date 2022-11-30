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
    comments = "Source: counselor.proto")
public final class counselorServiceGrpc {

  private counselorServiceGrpc() {}

  public static final String SERVICE_NAME = "counselorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor,
      com.goconsult.grpc.Counselor.responseMessage> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = com.goconsult.grpc.Counselor.counselor.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor,
      com.goconsult.grpc.Counselor.responseMessage> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor, com.goconsult.grpc.Counselor.responseMessage> getRegisterMethod;
    if ((getRegisterMethod = counselorServiceGrpc.getRegisterMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getRegisterMethod = counselorServiceGrpc.getRegisterMethod) == null) {
          counselorServiceGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.counselor, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.counselor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.counselor> getViewProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewProfile",
      requestType = com.goconsult.grpc.Counselor.Empty.class,
      responseType = com.goconsult.grpc.Counselor.counselor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.counselor> getViewProfileMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.counselor> getViewProfileMethod;
    if ((getViewProfileMethod = counselorServiceGrpc.getViewProfileMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getViewProfileMethod = counselorServiceGrpc.getViewProfileMethod) == null) {
          counselorServiceGrpc.getViewProfileMethod = getViewProfileMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.counselor>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "viewProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.counselor.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("viewProfile"))
                  .build();
          }
        }
     }
     return getViewProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProfile",
      requestType = com.goconsult.grpc.Counselor.counselor.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.counselor, com.goconsult.grpc.Counselor.responseMessage> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = counselorServiceGrpc.getUpdateProfileMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getUpdateProfileMethod = counselorServiceGrpc.getUpdateProfileMethod) == null) {
          counselorServiceGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.counselor, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "updateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.counselor.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("updateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.updatePasswordDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdatePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePassword",
      requestType = com.goconsult.grpc.Counselor.updatePasswordDetail.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.updatePasswordDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdatePasswordMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.updatePasswordDetail, com.goconsult.grpc.Counselor.responseMessage> getUpdatePasswordMethod;
    if ((getUpdatePasswordMethod = counselorServiceGrpc.getUpdatePasswordMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getUpdatePasswordMethod = counselorServiceGrpc.getUpdatePasswordMethod) == null) {
          counselorServiceGrpc.getUpdatePasswordMethod = getUpdatePasswordMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.updatePasswordDetail, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "updatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.updatePasswordDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("updatePassword"))
                  .build();
          }
        }
     }
     return getUpdatePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slot,
      com.goconsult.grpc.Counselor.responseMessage> getAddSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addSlot",
      requestType = com.goconsult.grpc.Counselor.slot.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slot,
      com.goconsult.grpc.Counselor.responseMessage> getAddSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slot, com.goconsult.grpc.Counselor.responseMessage> getAddSlotMethod;
    if ((getAddSlotMethod = counselorServiceGrpc.getAddSlotMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getAddSlotMethod = counselorServiceGrpc.getAddSlotMethod) == null) {
          counselorServiceGrpc.getAddSlotMethod = getAddSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.slot, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "addSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.slot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("addSlot"))
                  .build();
          }
        }
     }
     return getAddSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.viewSlotResponse> getViewAllSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewAllSlot",
      requestType = com.goconsult.grpc.Counselor.Empty.class,
      responseType = com.goconsult.grpc.Counselor.viewSlotResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.viewSlotResponse> getViewAllSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.viewSlotResponse> getViewAllSlotMethod;
    if ((getViewAllSlotMethod = counselorServiceGrpc.getViewAllSlotMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getViewAllSlotMethod = counselorServiceGrpc.getViewAllSlotMethod) == null) {
          counselorServiceGrpc.getViewAllSlotMethod = getViewAllSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.viewSlotResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "viewAllSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.viewSlotResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("viewAllSlot"))
                  .build();
          }
        }
     }
     return getViewAllSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotIdToBeDeleted,
      com.goconsult.grpc.Counselor.responseMessage> getDeleteSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSlot",
      requestType = com.goconsult.grpc.Counselor.slotIdToBeDeleted.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotIdToBeDeleted,
      com.goconsult.grpc.Counselor.responseMessage> getDeleteSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotIdToBeDeleted, com.goconsult.grpc.Counselor.responseMessage> getDeleteSlotMethod;
    if ((getDeleteSlotMethod = counselorServiceGrpc.getDeleteSlotMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getDeleteSlotMethod = counselorServiceGrpc.getDeleteSlotMethod) == null) {
          counselorServiceGrpc.getDeleteSlotMethod = getDeleteSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.slotIdToBeDeleted, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "deleteSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.slotIdToBeDeleted.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("deleteSlot"))
                  .build();
          }
        }
     }
     return getDeleteSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSlot",
      requestType = com.goconsult.grpc.Counselor.slotDetail.class,
      responseType = com.goconsult.grpc.Counselor.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotDetail,
      com.goconsult.grpc.Counselor.responseMessage> getUpdateSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.slotDetail, com.goconsult.grpc.Counselor.responseMessage> getUpdateSlotMethod;
    if ((getUpdateSlotMethod = counselorServiceGrpc.getUpdateSlotMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getUpdateSlotMethod = counselorServiceGrpc.getUpdateSlotMethod) == null) {
          counselorServiceGrpc.getUpdateSlotMethod = getUpdateSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.slotDetail, com.goconsult.grpc.Counselor.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "updateSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.slotDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("updateSlot"))
                  .build();
          }
        }
     }
     return getUpdateSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.userSlotArr> getViewBookedSlotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewBookedSlots",
      requestType = com.goconsult.grpc.Counselor.Empty.class,
      responseType = com.goconsult.grpc.Counselor.userSlotArr.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty,
      com.goconsult.grpc.Counselor.userSlotArr> getViewBookedSlotsMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.userSlotArr> getViewBookedSlotsMethod;
    if ((getViewBookedSlotsMethod = counselorServiceGrpc.getViewBookedSlotsMethod) == null) {
      synchronized (counselorServiceGrpc.class) {
        if ((getViewBookedSlotsMethod = counselorServiceGrpc.getViewBookedSlotsMethod) == null) {
          counselorServiceGrpc.getViewBookedSlotsMethod = getViewBookedSlotsMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Counselor.Empty, com.goconsult.grpc.Counselor.userSlotArr>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "counselorService", "viewBookedSlots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Counselor.userSlotArr.getDefaultInstance()))
                  .setSchemaDescriptor(new counselorServiceMethodDescriptorSupplier("viewBookedSlots"))
                  .build();
          }
        }
     }
     return getViewBookedSlotsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static counselorServiceStub newStub(io.grpc.Channel channel) {
    return new counselorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static counselorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new counselorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static counselorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new counselorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class counselorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.goconsult.grpc.Counselor.counselor request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void viewProfile(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.counselor> responseObserver) {
      asyncUnimplementedUnaryCall(getViewProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(com.goconsult.grpc.Counselor.counselor request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    /**
     */
    public void updatePassword(com.goconsult.grpc.Counselor.updatePasswordDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePasswordMethod(), responseObserver);
    }

    /**
     */
    public void addSlot(com.goconsult.grpc.Counselor.slot request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSlotMethod(), responseObserver);
    }

    /**
     */
    public void viewAllSlot(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.viewSlotResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getViewAllSlotMethod(), responseObserver);
    }

    /**
     */
    public void deleteSlot(com.goconsult.grpc.Counselor.slotIdToBeDeleted request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSlotMethod(), responseObserver);
    }

    /**
     */
    public void updateSlot(com.goconsult.grpc.Counselor.slotDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSlotMethod(), responseObserver);
    }

    /**
     * <pre>
     *from Booking Service
     * </pre>
     */
    public void viewBookedSlots(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.userSlotArr> responseObserver) {
      asyncUnimplementedUnaryCall(getViewBookedSlotsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.counselor,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getViewProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.Empty,
                com.goconsult.grpc.Counselor.counselor>(
                  this, METHODID_VIEW_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.counselor,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_UPDATE_PROFILE)))
          .addMethod(
            getUpdatePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.updatePasswordDetail,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_UPDATE_PASSWORD)))
          .addMethod(
            getAddSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.slot,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_ADD_SLOT)))
          .addMethod(
            getViewAllSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.Empty,
                com.goconsult.grpc.Counselor.viewSlotResponse>(
                  this, METHODID_VIEW_ALL_SLOT)))
          .addMethod(
            getDeleteSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.slotIdToBeDeleted,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_DELETE_SLOT)))
          .addMethod(
            getUpdateSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.slotDetail,
                com.goconsult.grpc.Counselor.responseMessage>(
                  this, METHODID_UPDATE_SLOT)))
          .addMethod(
            getViewBookedSlotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Counselor.Empty,
                com.goconsult.grpc.Counselor.userSlotArr>(
                  this, METHODID_VIEW_BOOKED_SLOTS)))
          .build();
    }
  }

  /**
   */
  public static final class counselorServiceStub extends io.grpc.stub.AbstractStub<counselorServiceStub> {
    private counselorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private counselorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected counselorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new counselorServiceStub(channel, callOptions);
    }

    /**
     */
    public void register(com.goconsult.grpc.Counselor.counselor request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewProfile(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.counselor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(com.goconsult.grpc.Counselor.counselor request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassword(com.goconsult.grpc.Counselor.updatePasswordDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSlot(com.goconsult.grpc.Counselor.slot request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewAllSlot(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.viewSlotResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewAllSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSlot(com.goconsult.grpc.Counselor.slotIdToBeDeleted request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSlot(com.goconsult.grpc.Counselor.slotDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *from Booking Service
     * </pre>
     */
    public void viewBookedSlots(com.goconsult.grpc.Counselor.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.userSlotArr> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewBookedSlotsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class counselorServiceBlockingStub extends io.grpc.stub.AbstractStub<counselorServiceBlockingStub> {
    private counselorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private counselorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected counselorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new counselorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage register(com.goconsult.grpc.Counselor.counselor request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.counselor viewProfile(com.goconsult.grpc.Counselor.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage updateProfile(com.goconsult.grpc.Counselor.counselor request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage updatePassword(com.goconsult.grpc.Counselor.updatePasswordDetail request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage addSlot(com.goconsult.grpc.Counselor.slot request) {
      return blockingUnaryCall(
          getChannel(), getAddSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.viewSlotResponse viewAllSlot(com.goconsult.grpc.Counselor.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewAllSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage deleteSlot(com.goconsult.grpc.Counselor.slotIdToBeDeleted request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.Counselor.responseMessage updateSlot(com.goconsult.grpc.Counselor.slotDetail request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSlotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *from Booking Service
     * </pre>
     */
    public com.goconsult.grpc.Counselor.userSlotArr viewBookedSlots(com.goconsult.grpc.Counselor.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewBookedSlotsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class counselorServiceFutureStub extends io.grpc.stub.AbstractStub<counselorServiceFutureStub> {
    private counselorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private counselorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected counselorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new counselorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> register(
        com.goconsult.grpc.Counselor.counselor request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.counselor> viewProfile(
        com.goconsult.grpc.Counselor.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> updateProfile(
        com.goconsult.grpc.Counselor.counselor request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> updatePassword(
        com.goconsult.grpc.Counselor.updatePasswordDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> addSlot(
        com.goconsult.grpc.Counselor.slot request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.viewSlotResponse> viewAllSlot(
        com.goconsult.grpc.Counselor.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewAllSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> deleteSlot(
        com.goconsult.grpc.Counselor.slotIdToBeDeleted request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.responseMessage> updateSlot(
        com.goconsult.grpc.Counselor.slotDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSlotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *from Booking Service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Counselor.userSlotArr> viewBookedSlots(
        com.goconsult.grpc.Counselor.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewBookedSlotsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_VIEW_PROFILE = 1;
  private static final int METHODID_UPDATE_PROFILE = 2;
  private static final int METHODID_UPDATE_PASSWORD = 3;
  private static final int METHODID_ADD_SLOT = 4;
  private static final int METHODID_VIEW_ALL_SLOT = 5;
  private static final int METHODID_DELETE_SLOT = 6;
  private static final int METHODID_UPDATE_SLOT = 7;
  private static final int METHODID_VIEW_BOOKED_SLOTS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final counselorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(counselorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.goconsult.grpc.Counselor.counselor) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_VIEW_PROFILE:
          serviceImpl.viewProfile((com.goconsult.grpc.Counselor.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.counselor>) responseObserver);
          break;
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((com.goconsult.grpc.Counselor.counselor) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((com.goconsult.grpc.Counselor.updatePasswordDetail) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_ADD_SLOT:
          serviceImpl.addSlot((com.goconsult.grpc.Counselor.slot) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_VIEW_ALL_SLOT:
          serviceImpl.viewAllSlot((com.goconsult.grpc.Counselor.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.viewSlotResponse>) responseObserver);
          break;
        case METHODID_DELETE_SLOT:
          serviceImpl.deleteSlot((com.goconsult.grpc.Counselor.slotIdToBeDeleted) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_UPDATE_SLOT:
          serviceImpl.updateSlot((com.goconsult.grpc.Counselor.slotDetail) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.responseMessage>) responseObserver);
          break;
        case METHODID_VIEW_BOOKED_SLOTS:
          serviceImpl.viewBookedSlots((com.goconsult.grpc.Counselor.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Counselor.userSlotArr>) responseObserver);
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

  private static abstract class counselorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    counselorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Counselor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("counselorService");
    }
  }

  private static final class counselorServiceFileDescriptorSupplier
      extends counselorServiceBaseDescriptorSupplier {
    counselorServiceFileDescriptorSupplier() {}
  }

  private static final class counselorServiceMethodDescriptorSupplier
      extends counselorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    counselorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (counselorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new counselorServiceFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getViewProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .addMethod(getUpdatePasswordMethod())
              .addMethod(getAddSlotMethod())
              .addMethod(getViewAllSlotMethod())
              .addMethod(getDeleteSlotMethod())
              .addMethod(getUpdateSlotMethod())
              .addMethod(getViewBookedSlotsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
