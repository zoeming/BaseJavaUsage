package com.Interface;

public abstract class Player extends Person{
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    public abstract void study();

    @Override
    public void eat(){
        System.out.println("player eat more");
    }
}
