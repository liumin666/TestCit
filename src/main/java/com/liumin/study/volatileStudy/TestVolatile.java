//package com.liumin.study.volatileStudy;
//
///**
// * @Author:lm
// * @Despriction: 测试volatile 可见性
// * @Date:2019/3/29 10:27
// */
//public class TestVolatile {
//    /**
//     * 不加 volatile 线程会进入死循环
//     * 加上 volatile 当STOP为true时 死循环会结束
//     */
//    private static volatile boolean STOP = false;
//
//    public static void main(String[] args) {
//
//        //十个线程 同时访问stop变量
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable() {
//                public void run() {
//                    //当stop == false 时进入死循环
//                    while (!STOP) {
//                        //死循环
//                    }
//                    System.out.println("循环结束");
//                }
//            }).start();
//        }
//
//        try {
//            //线程等待5秒
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        //改变变量stop的值
//        System.out.println("开始改变");
//        STOP = true;
//
//    }
//}
