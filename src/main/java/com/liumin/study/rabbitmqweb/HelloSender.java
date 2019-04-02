//package com.liumin.study.rabbitmqweb;
//
//import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
///**
// * Author:lm
// * Despriction: 发送者
// * Date:2018/9/8 19:15
// */
//@Component
//public class HelloSender {
//
//    @Autowired
//    private AmqpTemplate rabbitTemplate;
//
//    public void send() {
//        for (int i = 0; i <1000000 ; i++) {
//            String context = "hello " + "凯子别 操你大爷"+"  "+i;
//            this.rabbitTemplate.convertAndSend("hello", context);
//        }
//        System.err.println("----------------发送结束");
//    }
//
//}
