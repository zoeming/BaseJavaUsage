package com.Modifier.StaticModifier;

public class Student {

    public String name;
    public int age;
    /*
    static关键字是静态关键字
    static修饰的成员变量被类的所有对象共享
    推荐使用类名调用
    也可以使用对象名调用
     */
    public static String university;

    public void show(){
        System.out.println(name+","+age+","+university);
    }
}
