//package com.liumin.study.rabbitmq;
//
//import com.rabbitmq.client.Channel;
//import com.rabbitmq.client.Connection;
//import com.rabbitmq.client.ConnectionFactory;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeoutException;
//
///**
// * @Author:lm
// * @Despriction: Rabbitmq 生产者
// * Rabbitmq windows 安装
// * 1.安装 erlang
// * 2.erlang 配置环境变量
// * 2.安装 Rabbitmq server
// * <p>
// * https://blog.csdn.net/zxl646801924/article/details/80435231
// * @Date:2019/3/29 12:46
// */
//public class RabbitmqProducermain {
//    public static void main(String[] args) throws IOException, TimeoutException, InterruptedException {
//        //创建连接工厂
//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        connectionFactory.setHost("127.0.0.1");
//        connectionFactory.setPort(5672);
//        connectionFactory.setUsername("admin");
//        connectionFactory.setPassword("admin");
//        connectionFactory.setVirtualHost("/vhostOne");
//        //得到连接
//        Connection connection = connectionFactory.newConnection();
//        //创建一个渠道
//        Channel channel = connection.createChannel();
//        String queueName = "queueOne";
//        String exchangeName = "exchangerOne";
//        String routingKey = "queueOne";
//
//        channel.exchangeDeclare(exchangeName, "direct");
//        channel.queueDeclare(queueName, false, false, false, null);
//        channel.queueBind(queueName, exchangeName, routingKey);
//
//        //发送15000条
//        int messageCount = 15000;
//        while (messageCount-- > 0) {
//            TimeUnit.SECONDS.sleep(5);
//            String msg = "msg" + Math.random()*100;
//            channel.basicPublish(exchangeName,routingKey,null,msg.getBytes());
//            System.out.println("produce msg :"+msg);
//        }
//
//        channel.close();
//        connection.close();
//    }
//}
