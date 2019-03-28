package com.ming.callback.hystrix;

import com.ming.server.HystrixServer;
import org.springframework.stereotype.Component;

@Component
public class HystrixCallback implements HystrixServer {
    @Override
    public String hystrix(String name) {
        return name+":连接错误";
    }
}
