package com.InnerClass;
/*
内部类可以直接访问外部类的成员变量，包括私有成员变量
外部类如果要访问内部类的成员变量，需要首先创建对象
 */
public class Outer {

    private int num = 9;

    // 公共内部类，可以直接访问
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    // 私有内部类不能直接访问，要借助公共方法访问
    private class Inner1{
        public void show(){
            System.out.println(num);
        }
    }
    public void show(){
        Inner1 i = new Inner1();
        i.show();
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
