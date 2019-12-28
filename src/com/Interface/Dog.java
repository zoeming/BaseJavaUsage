package com.Interface;
/*
抽象类实现接口时不需要重写抽象方法
public abstract class Dog implements Jumpping
 */
public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void jump(){
        System.out.println("dog can jump high");
    }

    @Override
    public void method(){
        System.out.println("METHOD");
    }

    @Override
    public void eat() {
        System.out.println("dog eat meet");
    }
}
