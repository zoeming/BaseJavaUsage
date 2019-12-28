package com.Interface;

public class Animal {
    private int age;
    private String name;

    // 无参构造方法
    public Animal(){}

    // 带参构造方法
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){}
}
