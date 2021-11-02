package com.huangjiabin.springcloud.controller;

import com.huangjiabin.springcloud.entities.CommonResult;
import com.huangjiabin.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    // public static final String PAYMENT_URL="http://localhost:8001";      #单机版

    //集群版，还需还添加注解开启负载均衡@LoadBalanced默认是轮询的
    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    /*
        RestTemplate：提供了许多便捷访问远程Http服务的方法，
        是一种简单便携的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具类
    */
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);
    }
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
