package com.grpc.client;

import com.grpc.client.stub.Airsell;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SellAsync implements StreamObserver<Airsell.SellResponse> {

    @Override
    public void onNext(Airsell.SellResponse sellResponse) {
        log.info("Received product, {}", sellResponse);
        System.out.println("sell response" + sellResponse.toString());
    }

    @Override
    public void onError(Throwable throwable) {
        log.error("Error occurred, cause {}", throwable.getMessage());
    }

    @Override
    public void onCompleted() {
        log.info("Stream completed");
    }
}
