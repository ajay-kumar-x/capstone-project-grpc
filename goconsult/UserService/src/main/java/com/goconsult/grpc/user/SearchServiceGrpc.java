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
 *from Search service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: User.proto")
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.Empty,
      com.goconsult.grpc.user.User.searchResponse> getAllAvailableSlotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "allAvailableSlots",
      requestType = com.goconsult.grpc.user.User.Empty.class,
      responseType = com.goconsult.grpc.user.User.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.Empty,
      com.goconsult.grpc.user.User.searchResponse> getAllAvailableSlotsMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.Empty, com.goconsult.grpc.user.User.searchResponse> getAllAvailableSlotsMethod;
    if ((getAllAvailableSlotsMethod = SearchServiceGrpc.getAllAvailableSlotsMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getAllAvailableSlotsMethod = SearchServiceGrpc.getAllAvailableSlotsMethod) == null) {
          SearchServiceGrpc.getAllAvailableSlotsMethod = getAllAvailableSlotsMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.user.User.Empty, com.goconsult.grpc.user.User.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SearchService", "allAvailableSlots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("allAvailableSlots"))
                  .build();
          }
        }
     }
     return getAllAvailableSlotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.searchRequest,
      com.goconsult.grpc.user.User.searchResponse> getSlotsBySpecificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "slotsBySpecification",
      requestType = com.goconsult.grpc.user.User.searchRequest.class,
      responseType = com.goconsult.grpc.user.User.searchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.searchRequest,
      com.goconsult.grpc.user.User.searchResponse> getSlotsBySpecificationMethod() {
    io.grpc.MethodDescriptor<com.goconsult.grpc.user.User.searchRequest, com.goconsult.grpc.user.User.searchResponse> getSlotsBySpecificationMethod;
    if ((getSlotsBySpecificationMethod = SearchServiceGrpc.getSlotsBySpecificationMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSlotsBySpecificationMethod = SearchServiceGrpc.getSlotsBySpecificationMethod) == null) {
          SearchServiceGrpc.getSlotsBySpecificationMethod = getSlotsBySpecificationMethod = 
              io.grpc.MethodDescriptor.<com.goconsult.grpc.user.User.searchRequest, com.goconsult.grpc.user.User.searchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SearchService", "slotsBySpecification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.searchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.goconsult.grpc.user.User.searchResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("slotsBySpecification"))
                  .build();
          }
        }
     }
     return getSlotsBySpecificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    return new SearchServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchServiceFutureStub(channel);
  }

  /**
   * <pre>
   *from Search service
   * </pre>
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void allAvailableSlots(com.goconsult.grpc.user.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAllAvailableSlotsMethod(), responseObserver);
    }

    /**
     */
    public void slotsBySpecification(com.goconsult.grpc.user.User.searchRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.searchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSlotsBySpecificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAllAvailableSlotsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.user.User.Empty,
                com.goconsult.grpc.user.User.searchResponse>(
                  this, METHODID_ALL_AVAILABLE_SLOTS)))
          .addMethod(
            getSlotsBySpecificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.goconsult.grpc.user.User.searchRequest,
                com.goconsult.grpc.user.User.searchResponse>(
                  this, METHODID_SLOTS_BY_SPECIFICATION)))
          .build();
    }
  }

  /**
   * <pre>
   *from Search service
   * </pre>
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractStub<SearchServiceStub> {
    private SearchServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void allAvailableSlots(com.goconsult.grpc.user.User.Empty request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAllAvailableSlotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void slotsBySpecification(com.goconsult.grpc.user.User.searchRequest request,
        io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.searchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSlotsBySpecificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *from Search service
   * </pre>
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.goconsult.grpc.user.User.searchResponse allAvailableSlots(com.goconsult.grpc.user.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getAllAvailableSlotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.goconsult.grpc.user.User.searchResponse slotsBySpecification(com.goconsult.grpc.user.User.searchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSlotsBySpecificationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *from Search service
   * </pre>
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.user.User.searchResponse> allAvailableSlots(
        com.goconsult.grpc.user.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getAllAvailableSlotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.goconsult.grpc.user.User.searchResponse> slotsBySpecification(
        com.goconsult.grpc.user.User.searchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSlotsBySpecificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALL_AVAILABLE_SLOTS = 0;
  private static final int METHODID_SLOTS_BY_SPECIFICATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALL_AVAILABLE_SLOTS:
          serviceImpl.allAvailableSlots((com.goconsult.grpc.user.User.Empty) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.searchResponse>) responseObserver);
          break;
        case METHODID_SLOTS_BY_SPECIFICATION:
          serviceImpl.slotsBySpecification((com.goconsult.grpc.user.User.searchRequest) request,
              (io.grpc.stub.StreamObserver<com.goconsult.grpc.user.User.searchResponse>) responseObserver);
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

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.goconsult.grpc.user.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getAllAvailableSlotsMethod())
              .addMethod(getSlotsBySpecificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
