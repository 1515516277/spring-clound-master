package com.ming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *熔断器 Hystrix
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class SpringbootConsumersHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumersHystrixApplication.class, args);
    }

}
