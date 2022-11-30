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
    comments = "Source: Booking.proto")
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final String SERVICE_NAME = "BookingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.bookingRequest,
      com.goconsult.grpc.Booking.bookingResponse> getBookSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookSlot",
      requestType = com.goconsult.grpc.Booking.bookingRequest.class,
      responseType = com.goconsult.grpc.Booking.bookingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.bookingRequest,
      com.goconsult.grpc.Booking.bookingResponse> getBookSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.bookingRequest, com.goconsult.grpc.Booking.bookingResponse> getBookSlotMethod;
    if ((getBookSlotMethod = BookingServiceGrpc.getBookSlotMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getBookSlotMethod = BookingServiceGrpc.getBookSlotMethod) == null) {
          BookingServiceGrpc.getBookSlotMethod = getBookSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Booking.bookingRequest, com.goconsult.grpc.Booking.bookingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingService", "bookSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Booking.bookingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Booking.bookingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("bookSlot"))
                  .build();
          }
        }
     }
     return getBookSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.userId,
      com.goconsult.grpc.Booking.counselorSlotArr> getViewBookedSlotForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewBookedSlotForUser",
      requestType = com.goconsult.grpc.Booking.userId.class,
      responseType = com.goconsult.grpc.Booking.counselorSlotArr.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.userId,
      com.goconsult.grpc.Booking.counselorSlotArr> getViewBookedSlotForUserMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.userId, com.goconsult.grpc.Booking.counselorSlotArr> getViewBookedSlotForUserMethod;
    if ((getViewBookedSlotForUserMethod = BookingServiceGrpc.getViewBookedSlotForUserMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getViewBookedSlotForUserMethod = BookingServiceGrpc.getViewBookedSlotForUserMethod) == null) {
          BookingServiceGrpc.getViewBookedSlotForUserMethod = getViewBookedSlotForUserMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Booking.userId, com.goconsult.grpc.Booking.counselorSlotArr>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingService", "viewBookedSlotForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Booking.userId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Booking.counselorSlotArr.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("viewBookedSlotForUser"))
                  .build();
          }
        }
     }
     return getViewBookedSlotForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.counselorId,
      com.goconsult.grpc.Booking.userSlotArr> getViewBookedSlotForCounselorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewBookedSlotForCounselor",
      requestType = com.goconsult.grpc.Booking.counselorId.class,
      responseType = com.goconsult.grpc.Booking.userSlotArr.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.counselorId,
      com.goconsult.grpc.Booking.userSlotArr> getViewBookedSlotForCounselorMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.Booking.counselorId, com.goconsult.grpc.Booking.userSlotArr> getViewBookedSlotForCounselorMethod;
    if ((getViewBookedSlotForCounselorMethod = BookingServiceGrpc.getViewBookedSlotForCounselorMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getViewBookedSlotForCounselorMethod = BookingServiceGrpc.getViewBookedSlotForCounselorMethod) == null) {
          BookingServiceGrpc.getViewBookedSlotForCounselorMethod = getViewBookedSlotForCounselorMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.Booking.counselorId, com.goconsult.grpc.Booking.userSlotArr>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingService", "viewBookedSlotForCounselor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Booking.counselorId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.Booking.userSlotArr.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("viewBookedSlotForCounselor"))
                  .build();
          }
        }
     }
     return getViewBookedSlotForCounselorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingServiceStub newStub(io.grpc.Channel channel) {
    return new BookingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BookingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BookingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BookingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *a user can book the slot by giving the available slot_id and his user_id(which will be automatically detected in userService)
     * </pre>
     */
    public void bookSlot(com.goconsult.grpc.Booking.bookingRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.bookingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookSlotMethod(), responseObserver);
    }

    /**
     * <pre>
     *A user can see all the bookings made by him
     * </pre>
     */
    public void viewBookedSlotForUser(com.goconsult.grpc.Booking.userId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.counselorSlotArr> responseObserver) {
      asyncUnimplementedUnaryCall(getViewBookedSlotForUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * A counselor can see all details of his booked slots
     * </pre>
     */
    public void viewBookedSlotForCounselor(com.goconsult.grpc.Booking.counselorId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.userSlotArr> responseObserver) {
      asyncUnimplementedUnaryCall(getViewBookedSlotForCounselorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Booking.bookingRequest,
                com.goconsult.grpc.Booking.bookingResponse>(
                  this, METHODID_BOOK_SLOT)))
          .addMethod(
            getViewBookedSlotForUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Booking.userId,
                com.goconsult.grpc.Booking.counselorSlotArr>(
                  this, METHODID_VIEW_BOOKED_SLOT_FOR_USER)))
          .addMethod(
            getViewBookedSlotForCounselorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.Booking.counselorId,
                com.goconsult.grpc.Booking.userSlotArr>(
                  this, METHODID_VIEW_BOOKED_SLOT_FOR_COUNSELOR)))
          .build();
    }
  }

  /**
   */
  public static final class BookingServiceStub extends io.grpc.stub.AbstractStub<BookingServiceStub> {
    private BookingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *a user can book the slot by giving the available slot_id and his user_id(which will be automatically detected in userService)
     * </pre>
     */
    public void bookSlot(com.goconsult.grpc.Booking.bookingRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.bookingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *A user can see all the bookings made by him
     * </pre>
     */
    public void viewBookedSlotForUser(com.goconsult.grpc.Booking.userId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.counselorSlotArr> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewBookedSlotForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A counselor can see all details of his booked slots
     * </pre>
     */
    public void viewBookedSlotForCounselor(com.goconsult.grpc.Booking.counselorId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.userSlotArr> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewBookedSlotForCounselorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BookingServiceBlockingStub extends io.grpc.stub.AbstractStub<BookingServiceBlockingStub> {
    private BookingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *a user can book the slot by giving the available slot_id and his user_id(which will be automatically detected in userService)
     * </pre>
     */
    public com.goconsult.grpc.Booking.bookingResponse bookSlot(com.goconsult.grpc.Booking.bookingRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookSlotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *A user can see all the bookings made by him
     * </pre>
     */
    public com.goconsult.grpc.Booking.counselorSlotArr viewBookedSlotForUser(com.goconsult.grpc.Booking.userId request) {
      return blockingUnaryCall(
          getChannel(), getViewBookedSlotForUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A counselor can see all details of his booked slots
     * </pre>
     */
    public com.goconsult.grpc.Booking.userSlotArr viewBookedSlotForCounselor(com.goconsult.grpc.Booking.counselorId request) {
      return blockingUnaryCall(
          getChannel(), getViewBookedSlotForCounselorMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BookingServiceFutureStub extends io.grpc.stub.AbstractStub<BookingServiceFutureStub> {
    private BookingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BookingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BookingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *a user can book the slot by giving the available slot_id and his user_id(which will be automatically detected in userService)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Booking.bookingResponse> bookSlot(
        com.goconsult.grpc.Booking.bookingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *A user can see all the bookings made by him
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Booking.counselorSlotArr> viewBookedSlotForUser(
        com.goconsult.grpc.Booking.userId request) {
      return futureUnaryCall(
          getChannel().newCall(getViewBookedSlotForUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * A counselor can see all details of his booked slots
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.Booking.userSlotArr> viewBookedSlotForCounselor(
        com.goconsult.grpc.Booking.counselorId request) {
      return futureUnaryCall(
          getChannel().newCall(getViewBookedSlotForCounselorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_SLOT = 0;
  private static final int METHODID_VIEW_BOOKED_SLOT_FOR_USER = 1;
  private static final int METHODID_VIEW_BOOKED_SLOT_FOR_COUNSELOR = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BookingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BookingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_SLOT:
          serviceImpl.bookSlot((com.goconsult.grpc.Booking.bookingRequest) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.bookingResponse>) responseObserver);
          break;
        case METHODID_VIEW_BOOKED_SLOT_FOR_USER:
          serviceImpl.viewBookedSlotForUser((com.goconsult.grpc.Booking.userId) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.counselorSlotArr>) responseObserver);
          break;
        case METHODID_VIEW_BOOKED_SLOT_FOR_COUNSELOR:
          serviceImpl.viewBookedSlotForCounselor((com.goconsult.grpc.Booking.counselorId) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.Booking.userSlotArr>) responseObserver);
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

  private static abstract class BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.Booking.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingService");
    }
  }

  private static final class BookingServiceFileDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier {
    BookingServiceFileDescriptorSupplier() {}
  }

  private static final class BookingServiceMethodDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BookingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BookingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingServiceFileDescriptorSupplier())
              .addMethod(getBookSlotMethod())
              .addMethod(getViewBookedSlotForUserMethod())
              .addMethod(getViewBookedSlotForCounselorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
