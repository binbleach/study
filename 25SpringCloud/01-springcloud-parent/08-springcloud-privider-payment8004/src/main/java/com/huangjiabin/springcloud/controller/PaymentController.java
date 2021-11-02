package com.huangjiabin.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String zk(){
        return "我也不知道写什么"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

}
