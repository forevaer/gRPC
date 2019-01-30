package com.godme.client;

import com.godme.proto.Message;
import com.godme.service.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;

public class ClientMain {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost",8989)
                .usePlaintext()
                .build();
        StudentServiceGrpc.StudentServiceBlockingStub stub = StudentServiceGrpc.newBlockingStub(managedChannel);
        System.out.println("=====================single = single ======================================");
        Message.Student student = stub.searchStudent(Message.Request.newBuilder().setParam("godme").build());
        System.out.println(student.toString());
        System.out.println("====================single = stream ===============================");
        Iterator<Message.Student> it = stub.addStudent(Message.Request.newBuilder().setParam("9").build());
        while(it.hasNext()){
            System.out.println(it.next().toString()+ "*****************************");
        }
        System.out.println("=====================stream = single==================================================");
        StudentServiceGrpc.StudentServiceStub stub2 = StudentServiceGrpc.newStub(managedChannel);
        StreamObserver<Message.Request> handlerStreamObserver= new StreamObserver<Message.Request>(){
            @Override
            public void onNext(Message.Request value) {
                System.out.println("result : " + value.getParam());
            }
            @Override
            public void onCompleted() {
                System.out.println("stream - single run over");
            }
            @Override
            public void onError(Throwable t) {

            }
        };
        StreamObserver<Message.Request>  requestStreamObserver= stub2.countStudent(handlerStreamObserver);
        int count = 8;
        while(count-->0){
            requestStreamObserver.onNext(Message.Request.newBuilder().setParam(String.valueOf(count)).build());
        }
        requestStreamObserver.onCompleted();
        Thread.sleep(3000);
        System.out.println("===============stream = stream==========================");
        StreamObserver<Message.Student> streamStreamObserver = new StreamObserver<Message.Student>() {
            @Override
            public void onNext(Message.Student student) {
                System.out.println(student.toString() + "===stream===");
            }
            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }
            @Override
            public void onCompleted() {
                System.out.println("stream over");
            }
        };
        StreamObserver<Message.Request> streamObserver = stub2.batchSearchStudent(streamStreamObserver);
        while(count++ < 4){
            streamObserver.onNext(Message.Request.newBuilder().setParam(String.valueOf(count)).build());
        }
        Thread.sleep(5000);
    }
}
