package com.Polymorphism;

public class Dog1 extends Animal1{

    public Dog1(){}

    public Dog1(String name, int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("Dog eat meet.");
    }
}
