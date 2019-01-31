package com.godme.service;

import com.godme.proto.Message;
import com.godme.proto.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class StudentServiceHandler extends StudentServiceGrpc.StudentServiceImplBase{
    @Override
    public void searchStudent(Message.Request request, StreamObserver<Message.Student> responseObserver) {
        String param = request.getParam();
        Message.Student student = Message.Student.newBuilder().setAddr("localhost").setId(99).setName(param).build();
        responseObserver.onNext(student);
        responseObserver.onCompleted();
    }

    @Override
    public void addStudent(Message.Request request, StreamObserver<Message.Student> responseObserver) {
        Integer count = Integer.valueOf(request.getParam());
        while(count-- > 0){
            responseObserver.onNext(Message.Student.newBuilder()
                    .setAddr("localhost")
                    .setName("godme")
                    .setId(count)
                    .build()
            );
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Message.Request> countStudent(StreamObserver<Message.Request> responseObserver) {
        return new StreamObserver<Message.Request>() {
            private int count = 0;
            @Override
            public void onNext(Message.Request value) {
                System.out.println("receive request : " + value.getParam());
                count += 1;
            }
            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }
            @Override
            public void onCompleted() {
                responseObserver.onNext(Message.Request.newBuilder().setParam(String.valueOf(count)).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<Message.Request> batchSearchStudent(StreamObserver<Message.Student> responseObserver) {
        return new StreamObserver<Message.Request>() {
            @Override
            public void onNext(Message.Request value) {
                responseObserver.onNext(
                        Message.Student.newBuilder()
                                .setId(Integer.valueOf(value.getParam()))
                                .setName("godme")
                                .setAddr("localhost")
                                .build()
                );
            }
            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }
            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
