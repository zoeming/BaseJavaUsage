package com.Inherit;

public class Student extends Person{
    public String sexual = "女";
    public static void main(String[] args) {
        Student s = new Student();
        // 子类可以继承使用父类中的方法
        s.setAge(10);
        s.name = "xiaohuang";
        s.sexual = "女";
        s.show();
        s.study();
        System.out.println(s.sexual);
        s.sex();


    }
    public void study(){
        System.out.println("student should study!");
    }

    public void sex(){
        // 用super调用父类中的成员变量,super不能在static中使用
        System.out.println(super.sexual);
    }
}
