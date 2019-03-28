package com.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootProducersBanlanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProducersBanlanceApplication.class, args);
    }

}
