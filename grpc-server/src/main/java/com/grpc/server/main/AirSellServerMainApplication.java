package com.grpc.server.main;

import com.grpc.server.service.SellService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
@SpringBootApplication
@Slf4j
public class AirSellServerMainApplication {
    public static void main(String[] args) throws InterruptedException, IOException {
        SpringApplication.run(AirSellServerMainApplication.class, args);
        log.debug("Main method starts");
        Server server = ServerBuilder.forPort(9000).addService(new SellService()).build();
        server.start();
        System.out.println("Server port"+server.getPort());
        server.awaitTermination();
    }
}
