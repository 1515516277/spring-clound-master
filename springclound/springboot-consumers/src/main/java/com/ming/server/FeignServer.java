package com.ming.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-cloud-producers")
public interface FeignServer {

    @RequestMapping( "/say")
    String say(@RequestParam("name")  String name);
}
