package com.godme.service;

import com.godme.proto.Message;
import io.grpc.stub.StreamObserver;

public class StudentServiceHandler extends StudentServiceGrpc.StudentServiceImplBase{
    @Override
    public void searchStudent(Message.Request request, StreamObserver<Message.Student> responseObserver) {
        String param = request.getParam();
        Message.Student student = Message.Student.newBuilder().setAddr("localhost").setId(99).setName(param).build();
        responseObserver.onNext(student);
        responseObserver.onCompleted();
    }
}
