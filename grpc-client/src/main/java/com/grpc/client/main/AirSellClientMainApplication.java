package com.grpc.client.main;

import com.grpc.client.SellAsync;
import com.grpc.client.stub.Airsell;
import com.grpc.client.stub.SellGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.grpc.client.*"})
public class AirSellClientMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(AirSellClientMainApplication.class, args);
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000).
                usePlaintext().build();
        //SellGrpc.SellBlockingStub sell = SellGrpc.newBlockingStub(channel);
        SellGrpc.SellStub sell = SellGrpc.newStub(channel);
        Airsell.SellRequest request = Airsell.SellRequest.newBuilder().setId(1).setSellType("DCS").build();
        Airsell.Empty empty = Airsell.Empty.newBuilder().build();
        sell.createSell(request,new SellAsync());
        sell.updateSell(request,new SellAsync());
        sell.getSells(empty,new SellAsync());
/*
        System.out.println("Create sell response" + response1.toString());
        System.out.println("Update Sell response" + response2.toString());
        System.out.println("Get sells response" + response3.toString());*/

    }
}
