package com.cd.delicate.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DelicateEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DelicateEurekaApplication.class, args);
    }

}
