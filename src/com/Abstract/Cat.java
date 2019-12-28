package com.Abstract;
/*
如果一个类继承了抽象类，那么它需要重写抽象类的所有抽象方法
或者该类本身是抽象类
 */
public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age) {
        super(age);
    }

    @Override
    public void eat() {
        System.out.println("cat eat fish.");
    }

    public void sleep(){
        System.out.println("cat sleep.");
    }


}
