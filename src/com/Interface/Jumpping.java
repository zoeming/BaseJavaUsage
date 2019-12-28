package com.Interface;
/*
定义了一个Jumpping接口
接口中的类只能是抽象类
接口中的成员变量的默认修饰符是public final static
接口中不能有构造方法
 */
public interface Jumpping {
    public int high = 10;
    public final int t = 3;
    public final static int s = 4;
    int p = 10;


    public abstract void jump();

    void method();
}
