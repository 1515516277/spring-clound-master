package com.ming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BanlanceController {

    @RequestMapping("/say")
    public String say(String name){

        return name+"负载均衡服务";
    }
}
