package com.godme.server;

import com.godme.service.StudentServiceHandler;
import io.grpc.Server;
import io.grpc.ServerBuilder;


public class SimpleServer {
    public static void main(String[] args) throws Exception{
        Server server = ServerBuilder.forPort(8989).addService(new StudentServiceHandler()).build();
        server.start();
        server.awaitTermination();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            server.shutdown();
        }));
    }
}
