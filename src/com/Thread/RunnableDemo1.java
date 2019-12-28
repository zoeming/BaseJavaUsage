package com.Thread;

/*
- 定义一个类MyRunnable实现Runnable接口
- 在MyRunnable类中重写run()方法
- 创建MyRunnable类的对象
- 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
- 启动线程
Thread(Runnable target):分配一个新的Thread对象
Thread(Runnable target, String name):分配一个新的Thread对象
 */
public class RunnableDemo1{

    public static void main(String[] args) {
        //创建MyRunable类对象
        MyRunnable r = new MyRunnable();

        //创建Thread类对象
        Thread t1 = new Thread(r,"Thread1");
        Thread t2 = new Thread(r,"Thread2");

        //启动线程
        t1.start();
        t2.start();

    }
}
/*
相比继承Thread类，实现Runnable接口的好处
- 避免了Java单继承的局限性
- 适合多个相同程序的代码去处理同一个资源的情况，把线程和程序的代码、数据有效分离，较好的体现了面向对象的设计思想
 */