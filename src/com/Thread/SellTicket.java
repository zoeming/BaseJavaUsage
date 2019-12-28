package com.Thread;

/*
- 共有100张票，而它有3个窗口卖票，请设计一个程序模拟火车票卖票
- 实现步骤
  - 定义一个类SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
  - 在SellTicket类中重写run()方法实现卖票，代码步骤如下
  - 判断票数大于0，就卖票，并告知是哪个窗口卖的
  - 卖了票之后，总票数要减1
  - 票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
  - 定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
  - 创建SellTicket类的对象
  - 创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
  - 启动线程
 */
public class SellTicket implements Runnable{
    private int ticketnum = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while(true) {
            synchronized (obj) {
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
            }
        }
    }

    //同步方法
    //同步方法的锁对象是this
    private synchronized void sellticket() {
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
    }

}
/*
安全问题出现的条件
- 是多线程环境
- 有共享数据
- 有多条语句操作共享数据
解决方法
- 把多条语句操作共享数据的代码给锁起来，让任意时刻只能有一个线程执行即可
- Java提供了同步代码块的方式来解决

- 同步代码块格式：
      synchronized(任意对象) {
      	多条语句操作共享数据的代码
      }
  synchronized(任意对象)：就相当于给代码加锁了，任意对象就可以看成是一把锁
- 同步的好处和弊端
  - 好处：解决了多线程的数据安全问题
  - 弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率
 */