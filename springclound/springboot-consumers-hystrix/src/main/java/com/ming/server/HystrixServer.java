package com.ming.server;

import com.ming.callback.hystrix.HystrixCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-cloud-producers",fallback = HystrixCallback.class)
public interface HystrixServer {

    @RequestMapping("/say")
    String hystrix(@RequestParam("name") String name);
}
