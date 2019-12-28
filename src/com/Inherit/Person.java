package com.Inherit;

public class Person {
    private int age;
    String name;
    String sexual = "男";

    public void Person(){}

    public void Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if(age<0)
            System.out.println("there have some error on the age you printed");
        else
            // this表示引用本类对象
            this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name+","+getAge());
    }

}
