package com.Interface.StaticMethod;

/*
定义一个接口Inter
 */
public interface Inter {
    void show();

    default void method(){
        System.out.println("this is method in Inter");
    }

    static void test(){
        System.out.println("this is static in Inter");
    }


}
