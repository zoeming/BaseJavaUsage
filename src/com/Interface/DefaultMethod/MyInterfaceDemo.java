package com.Interface.DefaultMethod;

/*
以多态的方式创建对象并使用
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        //以第一种实现类创建对象
        MyInterface m1 = new MyInterfaceImp1();
        m1.show1();
        m1.show2();
        m1.show3();

        //以第二种实现类创建对象
        MyInterface m2 = new MyInterfaceImp2();
        m2.show1();
        m2.show2();
    }
}
