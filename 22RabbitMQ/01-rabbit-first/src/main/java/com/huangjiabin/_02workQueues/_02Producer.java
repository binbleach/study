package com.huangjiabin._02workQueues;

import com.huangjiabin.utils.RabbitMqUtils;
import com.rabbitmq.client.Channel;

import java.util.Scanner;

public class _02Producer {
    private final static String QUEUE_NAME="hello";
    public static void main(String[] args) throws Exception {
        Channel channel=RabbitMqUtils.getChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String message = scanner.next();
            channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
            System.out.println("消息已发送："+message);
        }
    }
}
