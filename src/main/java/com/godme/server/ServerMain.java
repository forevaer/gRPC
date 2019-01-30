package com.godme.server;

import com.godme.service.StudentServiceHandler;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ServerMain {
    private Server server = null;
    private void start() throws IOException {
        server = ServerBuilder.forPort(8989).addService(new StudentServiceHandler()).build().start();
    }
    private void stop(){
        if(server != null){
            this.server.shutdown();
        }
    }
    private void awaitTermintaion() throws InterruptedException {
        if(server != null){
            server.awaitTermination();
        }
    }
    public static void main(String[] args) throws Exception{
        ServerMain server = new ServerMain();
        server.start();
        server.awaitTermintaion();
    }
}
