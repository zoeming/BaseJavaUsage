package com.InnerClass;
/*
局部内部类的调用需要在方法中先实例化对象，然后再调用类方法
 */
public class Outer1 {
    private int num = 0;

    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
