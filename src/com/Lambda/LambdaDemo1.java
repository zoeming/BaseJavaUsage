package com.Lambda;

/*
启动一个线程，在控制台输出一句话：多线程程序启动了
- 实现方式一
  - 实现步骤
    - 定义一个类MyRunnable实现Runnable接口，重写run()方法
    - 创建MyRunnable类的对象
    - 创建Thread类的对象，把MyRunnable的对象作为构造参数传递
    - 启动线程
- 实现方式二
  - 匿名内部类的方式改进
- 实现方式三
  - Lambda表达式的方式改进
- 代码演示

 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        //实现类方式
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();

        //匿名内部类
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        });
        t1.start();

        //Lambda表达式实现
        /*
        - 格式：
            (形式参数) -> {代码块}
        - 形式参数：如果有多个参数，参数之间用逗号隔开；如果没有参数，留空即可
        - ->：由英文中画线和大于符号组成，固定写法。代表指向动作
        - 代码块：是我们具体要做的事情，也就是以前我们写的方法体内容
        - 组成Lambda表达式的三要素：
          - 形式参数，箭头，代码块

        Lambda表达式的使用前提
         - 有一个接口
         - 接口中有且仅有一个抽象方法
        lambda对应的是接口
         */
//        new Thread(()->{
//            System.out.println("多线程程序启动了");
//        }).start();
        Runnable r = ()->{
            System.out.println("多线程程序启动了");
        };
        new Thread(r);

    }
}
