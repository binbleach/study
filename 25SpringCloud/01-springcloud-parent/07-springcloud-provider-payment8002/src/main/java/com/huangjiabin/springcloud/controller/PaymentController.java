package com.huangjiabin.springcloud.controller;

import com.huangjiabin.springcloud.entities.CommonResult;
import com.huangjiabin.springcloud.entities.Payment;
import com.huangjiabin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    //@RequestBody能将接收的json对象转成自定义对象，再加这里表单提交就不行了
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果"+result);
        if(result>0){
            return new CommonResult(200,"插入数据库成功,serverPort"+serverPort,result);

        }else {
            return new CommonResult(444,"插入数据库失败,serverPort:"+serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果"+payment+"\t"+"哈哈哈哈哈哈哈哈哈");
        if(payment != null){
            return new CommonResult(200,"查询成功,serverPort:"+serverPort,payment);

        }else {
            return new CommonResult(444,"查询失败,serverPort:"+serverPort,null);
        }
    }
}
