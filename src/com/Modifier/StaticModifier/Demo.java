package com.Modifier.StaticModifier;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "mary";
        s.age = 19;
        s.university = "Tsinghua";
        s.show();

        // s4的university是Tsinghua
        Student s4 = new Student();
        s4.name = "ann";
        s4.age = 20;
//        s1.university = "Peking";
        s4.show();

        // s1的university是Peking，static修饰的变量可以重复赋值
        Student s1 = new Student();
        s1.name = "rose";
        s1.age = 20;
        s1.university = "Peking";
        s1.show();

        // s2的university是Peking，static修饰的成员变量，以最后一次赋值为准
        Student s2 = new Student();
        s2.name = "jesecca";
        s2.age = 20;
//        s1.university = "Peking";
        s2.show();
    }
}
