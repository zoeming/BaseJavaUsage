package com.Abstract;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age) {
        super(age);
    }

    public void eat(){
        System.out.println("dog eat meet.");
    }

}
