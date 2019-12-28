package com.Polymorphism;

public class Cat extends Animal{
    public int weight = 20;

    @Override
    public void eat(){
        System.out.println("cat eat fish.");
    }

    public void play(){
        System.out.println("cat play fur ball.");
    }

}
