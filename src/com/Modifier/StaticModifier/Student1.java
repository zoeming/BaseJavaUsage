package com.Modifier.StaticModifier;
/*
非静态成员方法可以调用静态成员方法
静态成员方法不能调用非静态成员方法，可以调用静态成员方法
 */
public class Student1 {
    private String name;
    public static String university="WTU";

    // 非静态成员方法
    public void show1(){}

    // 非静态成员方法
    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
        show4();
    }

    // 静态成员方法
    public static void show3(){}

    // 静态成员方法
    public static void show4(){
        System.out.println(university);
        show3();
        show4();
    }
}
