//package com.liumin.study.rabbitmq;
//
//import com.rabbitmq.client.*;
//
//import java.io.IOException;
//import java.util.concurrent.TimeoutException;
//
///**
// * @Author:lm
// * @Despriction: rebbitmq 消费者
// * @Date:2019/3/29 13:51
// */
//public class RabbitmqCousumerMain {
//    public static void main(String[] args) throws IOException, TimeoutException {
//        //创建连接工厂
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        connectionFactory.setHost("127.0.0.1");
//        connectionFactory.setPort(5672);
//        connectionFactory.setUsername("guest");
//        connectionFactory.setPassword("guest");
//        connectionFactory.setVirtualHost("/");
//        //得到连接
//        Connection connection = connectionFactory.newConnection();
//
//        Channel channel = connection.createChannel();
//        String queueName = "queueOne";
//
//        channel.queueDeclare(queueName,false,false,false,null);
//
//        //每次取5条
//        channel.basicQos(5);
//
//        Consumer consumer = new DefaultConsumer(channel){
//            @Override
//            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
//                //消费
//                String msg = new String(body,"utf-8");
//                System.out.println("consume msg : " + msg);
//                //手动确认消息
//                getChannel().basicAck(envelope.getDeliveryTag(),false);
//            }
//        };
//
//        //调用消费消息
//        channel.basicConsume(queueName,false,queueName,consumer);
//    }
//}
