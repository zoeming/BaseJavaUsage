package com.Polymorphism;

public class Cat1 extends Animal1{

    public Cat1(){}

    public Cat1(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("cat eat fish.");
    }
}
