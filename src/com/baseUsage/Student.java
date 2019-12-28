package com.baseUsage;

public class Student {
    String name;
    String sexual;
    private int age;

    // 无参构造
    public  Student(){

    }

    // 带参数的构造方法
    public Student(String name, String sexual, int age){
        this.name = name;
        this.sexual = sexual;
        this.age = age;
    }

    // 方法的形参如果与成员变量同名，带this修饰的变量是成员变量,不带this的是实参
    public void setAge(int age){
        if(age < 0)
            System.out.println("there have some error on the age you printed");
        else
            this.age = age;
    }

    public int getAge(){
        return age;
    }

    // 成员方法
    public void study(){
        System.out.println(name + " study");
    }

    public void doHomework(){
        System.out.println("student do homework");
    }

    public void introduce(){
        if(sexual=="男")
            System.out.println("this student is "+name+", he is "+ age +" years old");
        else
            System.out.println("this student is "+name+", she is "+ age +" years old");
    }
}
