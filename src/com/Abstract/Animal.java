package com.Abstract;
/*
一个类中如果有抽象方法，那么它一定是抽象类
但是抽象类中不一定有抽象方法
抽象类中可以有非抽象方法
抽象类不能直接实例化，但可以通过多态的方式，用子类对象来实例化，因此抽象类中可以用构造方法
 */
public abstract class Animal {
    private int age = 20;
    private final String city = "北京";

    public Animal() {}

    public Animal(int age) {
        this.age = age;
    }

    public void show() {
        age = 40;
        System.out.println(age);
//        city = "上海"; // final修饰的变量不能更改
        System.out.println(city);
    }

    public abstract void eat();
}
