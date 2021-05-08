package com.zhang.app.controller;


import lombok.SneakyThrows;

public class test02 {
    public static void main(String[] args) {
        maipiao maipiao = new maipiao();
        new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                try {
                    maipiao.getstick();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                try {
                    maipiao.getstick();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
        new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                try {
                    maipiao.getstick();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"C").start();

    }

}
class maipiao{
    private   int stick=100;
    public  synchronized void getstick() throws InterruptedException {

            Thread.sleep(100);

            if(stick>0){
                System.out.println(Thread.currentThread().getName()+"====卖了第"+stick--+"张票");
            }

    }

}