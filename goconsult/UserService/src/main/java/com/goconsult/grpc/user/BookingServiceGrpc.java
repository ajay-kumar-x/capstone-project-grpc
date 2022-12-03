package com.goconsult.grpc.user;

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
 * <pre>
 *from booking service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: User.proto")
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final String SERVICE_NAME = "BookingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.slotId,
      com.goconsult.grpc.user.User.responseMessage> getBookSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookSlot",
      requestType = com.goconsult.grpc.user.User.slotId.class,
      responseType = com.goconsult.grpc.user.User.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.slotId,
      com.goconsult.grpc.user.User.responseMessage> getBookSlotMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.slotId, com.goconsult.grpc.user.User.responseMessage> getBookSlotMethod;
    if ((getBookSlotMethod = BookingServiceGrpc.getBookSlotMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getBookSlotMethod = BookingServiceGrpc.getBookSlotMethod) == null) {
          BookingServiceGrpc.getBookSlotMethod = getBookSlotMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.user.User.slotId, com.goconsult.grpc.user.User.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingService", "bookSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.slotId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("bookSlot"))
                  .build();
          }
        }
     }
     return getBookSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.Empty,
      com.goconsult.grpc.user.User.counselorSlotArr> getViewBookedSlotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "viewBookedSlots",
      requestType = com.goconsult.grpc.user.User.Empty.class,
      responseType = com.goconsult.grpc.user.User.counselorSlotArr.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.Empty,
      com.goconsult.grpc.user.User.counselorSlotArr> getViewBookedSlotsMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.Empty, com.goconsult.grpc.user.User.counselorSlotArr> getViewBookedSlotsMethod;
    if ((getViewBookedSlotsMethod = BookingServiceGrpc.getViewBookedSlotsMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getViewBookedSlotsMethod = BookingServiceGrpc.getViewBookedSlotsMethod) == null) {
          BookingServiceGrpc.getViewBookedSlotsMethod = getViewBookedSlotsMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.user.User.Empty, com.goconsult.grpc.user.User.counselorSlotArr>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingService", "viewBookedSlots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.counselorSlotArr.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("viewBookedSlots"))
                  .build();
          }
        }
     }
     return getViewBookedSlotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.rescheduleDetail,
      com.goconsult.grpc.user.User.responseMessage> getRescheduleBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rescheduleBooking",
      requestType = com.goconsult.grpc.user.User.rescheduleDetail.class,
      responseType = com.goconsult.grpc.user.User.responseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.rescheduleDetail,
      com.goconsult.grpc.user.User.responseMessage> getRescheduleBookingMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.rescheduleDetail, com.goconsult.grpc.user.User.responseMessage> getRescheduleBookingMethod;
    if ((getRescheduleBookingMethod = BookingServiceGrpc.getRescheduleBookingMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getRescheduleBookingMethod = BookingServiceGrpc.getRescheduleBookingMethod) == null) {
          BookingServiceGrpc.getRescheduleBookingMethod = getRescheduleBookingMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.user.User.rescheduleDetail, com.goconsult.grpc.user.User.responseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BookingService", "rescheduleBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.rescheduleDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.responseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("rescheduleBooking"))
                  .build();
          }
        }
     }
     return getRescheduleBookingMethod;
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
   * <pre>
   *from booking service
   * </pre>
   */
  public static abstract class BookingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bookSlot(com.goconsult.grpc.user.User.slotId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getBookSlotMethod(), responseObserver);
    }

    /**
     */
    public void viewBookedSlots(com.goconsult.grpc.user.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.counselorSlotArr> responseObserver) {
      asyncUnimplementedUnaryCall(getViewBookedSlotsMethod(), responseObserver);
    }

    /**
     * <pre>
     *A user can reschedule the booking made by him by providing the booking_id and available slot_id
     * </pre>
     */
    public void rescheduleBooking(com.goconsult.grpc.user.User.rescheduleDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.responseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRescheduleBookingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookSlotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.user.User.slotId,
                com.goconsult.grpc.user.User.responseMessage>(
                  this, METHODID_BOOK_SLOT)))
          .addMethod(
            getViewBookedSlotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.user.User.Empty,
                com.goconsult.grpc.user.User.counselorSlotArr>(
                  this, METHODID_VIEW_BOOKED_SLOTS)))
          .addMethod(
            getRescheduleBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.user.User.rescheduleDetail,
                com.goconsult.grpc.user.User.responseMessage>(
                  this, METHODID_RESCHEDULE_BOOKING)))
          .build();
    }
  }

  /**
   * <pre>
   *from booking service
   * </pre>
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
     */
    public void bookSlot(com.goconsult.grpc.user.User.slotId request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewBookedSlots(com.goconsult.grpc.user.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.counselorSlotArr> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewBookedSlotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *A user can reschedule the booking made by him by providing the booking_id and available slot_id
     * </pre>
     */
    public void rescheduleBooking(com.goconsult.grpc.user.User.rescheduleDetail request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.responseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRescheduleBookingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *from booking service
   * </pre>
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
     */
    public com.goconsult.grpc.user.User.responseMessage bookSlot(com.goconsult.grpc.user.User.slotId request) {
      return blockingUnaryCall(
          getChannel(), getBookSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.user.User.counselorSlotArr viewBookedSlots(com.goconsult.grpc.user.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getViewBookedSlotsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *A user can reschedule the booking made by him by providing the booking_id and available slot_id
     * </pre>
     */
    public com.goconsult.grpc.user.User.responseMessage rescheduleBooking(com.goconsult.grpc.user.User.rescheduleDetail request) {
      return blockingUnaryCall(
          getChannel(), getRescheduleBookingMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *from booking service
   * </pre>
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.user.User.responseMessage> bookSlot(
        com.goconsult.grpc.user.User.slotId request) {
      return futureUnaryCall(
          getChannel().newCall(getBookSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.user.User.counselorSlotArr> viewBookedSlots(
        com.goconsult.grpc.user.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getViewBookedSlotsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *A user can reschedule the booking made by him by providing the booking_id and available slot_id
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.user.User.responseMessage> rescheduleBooking(
        com.goconsult.grpc.user.User.rescheduleDetail request) {
      return futureUnaryCall(
          getChannel().newCall(getRescheduleBookingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_SLOT = 0;
  private static final int METHODID_VIEW_BOOKED_SLOTS = 1;
  private static final int METHODID_RESCHEDULE_BOOKING = 2;

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
          serviceImpl.bookSlot((com.goconsult.grpc.user.User.slotId) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.responseMessage>) responseObserver);
          break;
        case METHODID_VIEW_BOOKED_SLOTS:
          serviceImpl.viewBookedSlots((com.goconsult.grpc.user.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.counselorSlotArr>) responseObserver);
          break;
        case METHODID_RESCHEDULE_BOOKING:
          serviceImpl.rescheduleBooking((com.goconsult.grpc.user.User.rescheduleDetail) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.responseMessage>) responseObserver);
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
      return com.goconsult.grpc.user.User.getDescriptor();
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
              .addMethod(getViewBookedSlotsMethod())
              .addMethod(getRescheduleBookingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
