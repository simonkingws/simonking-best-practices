package com.simonking.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.simonking"})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.simonking"})
public class SimonkingMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimonkingMicroservicesApplication.class, args);
    }

}
