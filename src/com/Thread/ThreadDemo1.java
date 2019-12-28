package com.Thread;

/*
- 定义一个类MyThread继承Thread类
- 在MyThread类中重写run()方法
- 创建MyThread类的对象
- 启动线程
void run():在线程开启后，此方法将被调用执行
void start():使此线程开始执行，Java虚拟机会调用run方法()
final int getPriority():返回此线程的优先级
final void setPriority(int newPriority):更改此线程的优先级 线程默认优先级是5；线程优先级的范围是：1-10
 */
public class ThreadDemo1 extends Thread{
    public ThreadDemo1() {
    }

    public ThreadDemo1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++)
            //String  getName():返回此线程的名称
            System.out.println(i+":"+getName());
    }

    public static void main(String[] args) {

        //创建线程（无参构造方法）
//        ThreadDemo1 t1 = new ThreadDemo1();
//        ThreadDemo1 t2 = new ThreadDemo1();
//
//        //void  setName(String name):将此线程的名称更改为等于参数name
//        t1.setName("Thread1");
//        t2.setName("Thread2");

        //创建线程（带参构造方法）
        ThreadDemo1 t1 = new ThreadDemo1("Thread1");
        ThreadDemo1 t2 = new ThreadDemo1("Thread2");

        //final int getPriority():返回此线程的优先级
        System.out.println(t1.getPriority()); //5
        System.out.println(t2.getPriority()); //5

        //final void setPriority(int newPriority):更改此线程的优先级
        //线程默认优先级是5，线程优先级的范围是：1-10,数字越大优先级越高
        t1.setPriority(4);

//        t1.run();
//        t2.run();

        //Thread  currentThread():返回对当前正在执行的线程对象的引用
        System.out.println(currentThread().getName()); //main

        //执行线程
        t1.start();
        t2.start();
    }
}
/*
- 为什么要重写run()方法？
  因为run()是用来封装被线程执行的代码
- run()方法和start()方法的区别？
  run()：封装线程执行的代码，直接调用，相当于普通方法的调用
  start()：启动线程；然后由JVM调用此线程的run()方法
 */