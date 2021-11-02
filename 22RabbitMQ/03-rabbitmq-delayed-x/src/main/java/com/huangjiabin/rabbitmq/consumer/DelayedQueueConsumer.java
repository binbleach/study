package com.huangjiabin.rabbitmq.consumer;

import com.huangjiabin.rabbitmq.config.DelayedQueueConfig;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class DelayedQueueConsumer {
    //接收消息
    @RabbitListener(queues= "delayed.queue")
    public void receiveD(Message message, Channel channel) throws Exception{
        String msg = new String(message.getBody());
        log.info("当前时间：{},收到的死信队列的消息：{}",new Date().toString(),msg);
    }
}
