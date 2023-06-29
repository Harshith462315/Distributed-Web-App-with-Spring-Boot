package com.microservices.demo.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
    //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
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
}