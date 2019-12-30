package com.Lambda.MethodReference;

/*
定义一个测试类(MyStringDemo)，在测试类中提供两个方法
- 一个方法是：useMyString(MyString my)
- 一个方法是主方法，在主方法中调用useMyString方法
 */
public class MyStringDemo {
    public static void main(String[] args) {

        //lambda
        useMyString((s,x,y) -> s.substring(x,y));

        //引用对象
        useMyString(String :: substring);
    }
    public static void useMyString(MyString m){
        System.out.println(m.mySubString("hello,java",0,3));
    }
}
