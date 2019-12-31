package com.Reflect;

public class Student {
    //成员变量：一个私有，一个默认，一个公共
    int age;
    private String name;
    public String address;

    //构造方法：一个私有，一个默认，两个公共
    public Student() {
    }

    public Student(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    private Student(String name){
        this.name = name;
    }

    //成员方法：一个私有，四个公共
    private void funciton(){
        System.out.println("funciton");
    }

    public void method1(){
        System.out.println("method1");
    }

    public void method2(String s){
        System.out.println("method2: "+s);
    }

    public String method3(String s, int i){
        return s+","+i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address +'\''
                + "}";
    }
}
