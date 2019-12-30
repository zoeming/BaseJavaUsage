package com.Lambda.MethodReference;

/*
定义一个类(Student)，里面有两个成员变量(name,age)
并提供无参构造方法和带参构造方法，以及成员变量对应的get和set方法
 */
public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
