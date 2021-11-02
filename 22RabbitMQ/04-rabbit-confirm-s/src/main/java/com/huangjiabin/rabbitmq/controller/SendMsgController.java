package com.huangjiabin.rabbitmq.controller;

import com.huangjiabin.rabbitmq.config.ConfirmConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/confirm")
public class SendMsgController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    /*
        发布确认高级：
        1、回调接口：
            通过回调接口,只要发布消息就会调用回调函数，得知交换机是否接收到消息。
        2、退回接口
            回调当交换机宕掉时，可行。可是队列宕调就不行了还得用退回接口。
        3、备份交换机：
            有回退消息走备份交换机为准，没有走退回方法
    */
    @GetMapping("/sendMessage/{message}")
    public void sendMessage(@PathVariable String message){
        //不可路由消息发送
        CorrelationData correlationData = new CorrelationData("1001");//设置回调消息的id
        rabbitTemplate.convertAndSend(ConfirmConfig.EXCHANGE_NAME,ConfirmConfig.ROUTINGKEY_NAME+1,message+"key1",correlationData);
        log.info("发的消息内容为：{}",message+"key1");

        //可以路由消息发送
        CorrelationData correlationData1 = new CorrelationData("1002");
        rabbitTemplate.convertAndSend(ConfirmConfig.EXCHANGE_NAME,ConfirmConfig.ROUTINGKEY_NAME,message+"key2",correlationData1);
        log.info("发的消息内容为：{}",message+"key2");
    }

}
