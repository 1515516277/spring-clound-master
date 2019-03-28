package com.ming.controller;

import com.ming.server.FeignServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignServer feignServer;

    @RequestMapping(value = "/say")
    public String say(String name){

        return feignServer.say(name);
    }
}
