package com.FunctionInterface;

/*
定义一个类(RunnableDemo)，在类中提供两个方法
一个方法是：startThread(Runnable r)   方法参数Runnable是一个函数式接口
一个方法是主方法，在主方法中调用startThread方法
 */
public class RunnableDemo {
    public static void main(String[] args) {

        //匿名内部类
        StartThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        });

        //lambda
        //如果方法的参数是一个函数式接口，可以使用Lambda表达式来进行参数传递
        StartThread(() -> System.out.println("lambda"));
    }

    public static void StartThread(Runnable r){
        Thread t = new Thread(r);
        t.start();
    }
}
