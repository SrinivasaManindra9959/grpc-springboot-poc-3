package com.grpc.server.service;

import com.grpc.server.stub.Airsell;
import com.grpc.server.stub.SellGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
@GRpcService
public class SellService extends SellGrpc.SellImplBase {

    @Override
    public void createSell(Airsell.SellRequest request, StreamObserver<Airsell.SellResponse> responseObserver) {

        System.out.println("Inside create sell");
        String sellType = request.getSellType();
        Airsell.SellResponse.Builder response = Airsell.SellResponse.newBuilder();

        if(sellType.equalsIgnoreCase("DCS")){
            System.out.println("DCS Sell created");
            System.out.println("DCS Sell CREATED Successfully");
            response.setResponseStatus("Success");
            response.setSellStatus(200);

        }
        System.out.println("Sell should be in DCS");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void updateSell(Airsell.SellRequest request, StreamObserver<Airsell.SellResponse> responseObserver) {
        System.out.println("Inside update sell");
        String sellType = request.getSellType();
        Airsell.SellResponse.Builder response = Airsell.SellResponse.newBuilder();
        if(sellType.equalsIgnoreCase("DCS")){
            System.out.println("DCS Sell created");
            System.out.println("DCS Sell UPDATED Successfully");
            response.setResponseStatus("Success");
            response.setSellStatus(200);

        }
        System.out.println("Sell should be in DCS");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getSells(Airsell.Empty request, StreamObserver<Airsell.SellResponse> responseObserver) {
        System.out.println("Inside det All sells");
        Airsell.SellResponse.Builder response = Airsell.SellResponse.newBuilder();
        response.setSellStatus(200);
        response.setResponseStatus("Success");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
