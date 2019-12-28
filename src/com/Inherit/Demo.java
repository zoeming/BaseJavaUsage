package com.Inherit;
/*
子类对象方法的调用先查找子类方法，如果没有再查找父类方法，不考虑父类的父类

 */
public class Demo {
    public static void main(String[] args) {
        // 子类所有构造方法默认访问父类中的无参构造方法
        // 先访问Fu中的无参构造方法，然后访问Zi中的无参构造方法
        Zi a = new Zi();

        // 先访问Fu中的无参构造方法，然后访问Zi中的有参构造方法
        Zi z = new Zi(20);
    }
}
