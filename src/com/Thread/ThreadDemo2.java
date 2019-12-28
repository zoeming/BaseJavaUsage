package com.Thread;

/*
static void sleep(long millis)：使当前正在执行的线程停留（暂停执行）指定的毫秒数
void join()：等待这个线程死亡
void setDaemon(boolean on)：将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
 */
public class ThreadDemo2 extends Thread{
    public ThreadDemo2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            try {
                //static void sleep(long millis)：使当前正在执行的线程停留（暂停执行）指定的毫秒数
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        //创建线程（带参构造方法）
        ThreadDemo1 t = new ThreadDemo1("无名");
        ThreadDemo1 t1 = new ThreadDemo1("康熙");
        ThreadDemo2 t2 = new ThreadDemo2("四阿哥");
        ThreadDemo2 t3 = new ThreadDemo2("八阿哥");
        ThreadDemo1 t4 = new ThreadDemo1("关羽");
        ThreadDemo1 t5 = new ThreadDemo1("张飞");

        //执行线程
        t.start();
        t1.start();

        //等待t1线程死亡
        t1.join();

        //执行线程
        t2.start();
        t3.start();

        //设置主线程为刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程
        t4.setDaemon(true);
        t5.setDaemon(true);

        //执行进程
        t4.start();
        t5.start();

        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
