package com.Interface;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("Basketball coach teach basketball");
    }

    @Override
    public void eat() {
        System.out.println("Basketball coach eat less");
    }
}
