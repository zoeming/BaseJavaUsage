package com.Interface;
/*
Object是所有类的超类，如果一个类没有父类，默认继承Object
所以接口的实现类可以有构造方法
Object默认无参构造方法
一个类可以同时实现多个接口
可以在继承类的同时实现接口
 */
//public class Cat extends Object implements Jumpping == public class Cat implements Jumpping
public class Cat extends Animal implements Jumpping,Catch{

    public Cat() {
        super();
    }

    public Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void jump(){
        System.out.println("Cat can jump high.");
    }

    @Override
    public void method(){
        System.out.println("Method");
    }

    @Override
    public void eat(){
        System.out.println("cat eat fish.");
    }

    @Override
    public void catchMouse(){
        System.out.println("cat can catch mouse");
    }

    public void play(){
        System.out.println("cat play ball");
    }

}
