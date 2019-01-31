package com.godme.proto;

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
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: Message.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.godme.proto.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Student> getSearchStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchStudent",
      requestType = com.godme.proto.Message.Request.class,
      responseType = com.godme.proto.Message.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Student> getSearchStudentMethod() {
    io.grpc.MethodDescriptor<com.godme.proto.Message.Request, com.godme.proto.Message.Student> getSearchStudentMethod;
    if ((getSearchStudentMethod = StudentServiceGrpc.getSearchStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getSearchStudentMethod = StudentServiceGrpc.getSearchStudentMethod) == null) {
          StudentServiceGrpc.getSearchStudentMethod = getSearchStudentMethod = 
              io.grpc.MethodDescriptor.<com.godme.proto.Message.Request, com.godme.proto.Message.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.godme.proto.StudentService", "searchStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("searchStudent"))
                  .build();
          }
        }
     }
     return getSearchStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Student> getAddStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addStudent",
      requestType = com.godme.proto.Message.Request.class,
      responseType = com.godme.proto.Message.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Student> getAddStudentMethod() {
    io.grpc.MethodDescriptor<com.godme.proto.Message.Request, com.godme.proto.Message.Student> getAddStudentMethod;
    if ((getAddStudentMethod = StudentServiceGrpc.getAddStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getAddStudentMethod = StudentServiceGrpc.getAddStudentMethod) == null) {
          StudentServiceGrpc.getAddStudentMethod = getAddStudentMethod = 
              io.grpc.MethodDescriptor.<com.godme.proto.Message.Request, com.godme.proto.Message.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.godme.proto.StudentService", "addStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("addStudent"))
                  .build();
          }
        }
     }
     return getAddStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Request> getCountStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countStudent",
      requestType = com.godme.proto.Message.Request.class,
      responseType = com.godme.proto.Message.Request.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Request> getCountStudentMethod() {
    io.grpc.MethodDescriptor<com.godme.proto.Message.Request, com.godme.proto.Message.Request> getCountStudentMethod;
    if ((getCountStudentMethod = StudentServiceGrpc.getCountStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getCountStudentMethod = StudentServiceGrpc.getCountStudentMethod) == null) {
          StudentServiceGrpc.getCountStudentMethod = getCountStudentMethod = 
              io.grpc.MethodDescriptor.<com.godme.proto.Message.Request, com.godme.proto.Message.Request>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.godme.proto.StudentService", "countStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Request.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("countStudent"))
                  .build();
          }
        }
     }
     return getCountStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Student> getBatchSearchStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batchSearchStudent",
      requestType = com.godme.proto.Message.Request.class,
      responseType = com.godme.proto.Message.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.godme.proto.Message.Request,
      com.godme.proto.Message.Student> getBatchSearchStudentMethod() {
    io.grpc.MethodDescriptor<com.godme.proto.Message.Request, com.godme.proto.Message.Student> getBatchSearchStudentMethod;
    if ((getBatchSearchStudentMethod = StudentServiceGrpc.getBatchSearchStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getBatchSearchStudentMethod = StudentServiceGrpc.getBatchSearchStudentMethod) == null) {
          StudentServiceGrpc.getBatchSearchStudentMethod = getBatchSearchStudentMethod = 
              io.grpc.MethodDescriptor.<com.godme.proto.Message.Request, com.godme.proto.Message.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.godme.proto.StudentService", "batchSearchStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.godme.proto.Message.Student.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("batchSearchStudent"))
                  .build();
          }
        }
     }
     return getBatchSearchStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchStudent(com.godme.proto.Message.Request request,
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchStudentMethod(), responseObserver);
    }

    /**
     */
    public void addStudent(com.godme.proto.Message.Request request,
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Student> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStudentMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.godme.proto.Message.Request> countStudent(
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Request> responseObserver) {
      return asyncUnimplementedStreamingCall(getCountStudentMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.godme.proto.Message.Request> batchSearchStudent(
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Student> responseObserver) {
      return asyncUnimplementedStreamingCall(getBatchSearchStudentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.godme.proto.Message.Request,
                com.godme.proto.Message.Student>(
                  this, METHODID_SEARCH_STUDENT)))
          .addMethod(
            getAddStudentMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.godme.proto.Message.Request,
                com.godme.proto.Message.Student>(
                  this, METHODID_ADD_STUDENT)))
          .addMethod(
            getCountStudentMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.godme.proto.Message.Request,
                com.godme.proto.Message.Request>(
                  this, METHODID_COUNT_STUDENT)))
          .addMethod(
            getBatchSearchStudentMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.godme.proto.Message.Request,
                com.godme.proto.Message.Student>(
                  this, METHODID_BATCH_SEARCH_STUDENT)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchStudent(com.godme.proto.Message.Request request,
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Student> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStudent(com.godme.proto.Message.Request request,
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Student> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.godme.proto.Message.Request> countStudent(
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Request> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCountStudentMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.godme.proto.Message.Request> batchSearchStudent(
        io.grpc.stub.StreamObserver<com.godme.proto.Message.Student> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBatchSearchStudentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.godme.proto.Message.Student searchStudent(com.godme.proto.Message.Request request) {
      return blockingUnaryCall(
          getChannel(), getSearchStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.godme.proto.Message.Student> addStudent(
        com.godme.proto.Message.Request request) {
      return blockingServerStreamingCall(
          getChannel(), getAddStudentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.godme.proto.Message.Student> searchStudent(
        com.godme.proto.Message.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_STUDENT = 0;
  private static final int METHODID_ADD_STUDENT = 1;
  private static final int METHODID_COUNT_STUDENT = 2;
  private static final int METHODID_BATCH_SEARCH_STUDENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_STUDENT:
          serviceImpl.searchStudent((com.godme.proto.Message.Request) request,
              (io.grpc.stub.StreamObserver<com.godme.proto.Message.Student>) responseObserver);
          break;
        case METHODID_ADD_STUDENT:
          serviceImpl.addStudent((com.godme.proto.Message.Request) request,
              (io.grpc.stub.StreamObserver<com.godme.proto.Message.Student>) responseObserver);
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
        case METHODID_COUNT_STUDENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.countStudent(
              (io.grpc.stub.StreamObserver<com.godme.proto.Message.Request>) responseObserver);
        case METHODID_BATCH_SEARCH_STUDENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.batchSearchStudent(
              (io.grpc.stub.StreamObserver<com.godme.proto.Message.Student>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.godme.proto.Message.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getSearchStudentMethod())
              .addMethod(getAddStudentMethod())
              .addMethod(getCountStudentMethod())
              .addMethod(getBatchSearchStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
