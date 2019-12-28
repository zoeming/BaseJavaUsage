package com.Interface;

public class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public void study(){
        System.out.println("study basketball");
    }

}
