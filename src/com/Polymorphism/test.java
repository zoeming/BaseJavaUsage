package com.Polymorphism;

public class test {
    public static void main(String[] args) {
        Animal1 c = new Cat1();
        c.setAge(8);
        c.setName("bulecat");
        System.out.println(c.getName()+","+c.getAge());

        c.eat();
    }
}
