package com.Interface.DefaultMethod;

/*
定义一个接口MyInterface，里面有两个抽象方法：
    void show1();
    void show2();
 */
public interface MyInterface {
    void show1();
    void show2();

    //默认方法
    public default void show3(){
        System.out.println("show3");
    };
}
