package com.Thread;

public class TicketDemo {
    public static void main(String[] args) {
        //创建SellTicket对象
        SellTicket1 s = new SellTicket1();

        //创建Thread对象
        Thread t1 = new Thread(s,"12306");
        Thread t2 = new Thread(s,"智行");
        Thread t3 = new Thread(s,"高铁管家");

        //执行进程
        t1.start();
        t2.start();
        t3.start();
    }
}
