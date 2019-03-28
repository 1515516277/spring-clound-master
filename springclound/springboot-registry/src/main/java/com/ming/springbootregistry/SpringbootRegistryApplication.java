package com.ming.springbootregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRegistryApplication.class, args);
    }

}
