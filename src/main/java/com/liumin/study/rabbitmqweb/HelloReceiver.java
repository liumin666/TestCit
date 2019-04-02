//package com.liumin.study.rabbitmqweb;
//
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * Author:lm
// * Despriction: 接收者
// * Date:2018/9/8 19:16
// */
//@Component
//@RabbitListener(queues = "hello")
//public class HelloReceiver {
//
//    @RabbitHandler
//    public void process(String hello) {
//        System.err.println("收到-------- "+hello);
//    }
//
//}
