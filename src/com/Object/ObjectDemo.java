package com.Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        s.setAge(30);
        // 如果toString()没有重写，返回的是地址
        System.out.println(s); // Student{name='林青霞', age=30}
        System.out.println(s.toString()); // Student{name='林青霞', age=30}

        Student s1 = s;
        Student s2 = new Student();
        s2.setName("林青霞");
        s2.setAge(30);
        // 如果equals()没有重写，s2.equals(s)和s1.equals(s)都是false
        System.out.println(s1==s); // true
        System.out.println(s2==s); // false
        System.out.println(s1.equals(s)); // true
        System.out.println(s2.equals(s)); // true


    }
}
