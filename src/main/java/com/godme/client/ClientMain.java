package com.godme.client;

import com.godme.proto.Message;
import com.godme.service.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientMain {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost",8989)
                .usePlaintext()
                .build();
        StudentServiceGrpc.StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(managedChannel);
        Message.Student student = stub.searchStudent(Message.Request.newBuilder().setParam("godme").build());
        System.out.println(student.toString());
    }
}
