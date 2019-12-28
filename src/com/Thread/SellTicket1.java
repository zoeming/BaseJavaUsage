package com.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来实例化
void lock():获得锁
void unlock():释放锁
一般使用try/finally来实现获得锁和释放锁
 */
public class SellTicket1 implements Runnable{
    private int ticketnum = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticketnum > 0) {
//            ticketnum--;
                    //避免出现多个线程同时执行
                    System.out.println("该票由" + Thread.currentThread().getName() + "出票，还剩" + ticketnum-- + "张票");
                    //每张票卖出停100ms
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (ticketnum == 0) {
                        System.out.println("没票了");
                    }
                }
            } finally {
                lock.unlock();
            }

        }
    }
}
