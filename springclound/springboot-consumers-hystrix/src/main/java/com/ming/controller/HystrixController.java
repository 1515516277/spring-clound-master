package com.ming.controller;

import com.ming.server.HystrixServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {


    @Autowired
    private HystrixServer hystrixServer;

    @RequestMapping("/say")
    public String hystrix(String name){

        return hystrixServer.hystrix(name);
    }
}
