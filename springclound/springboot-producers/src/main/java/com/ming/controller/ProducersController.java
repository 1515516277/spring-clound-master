package com.ming.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducersController {
    @RequestMapping("/say")
    public String say(String name){
        return name+"hello world";
    }
}
