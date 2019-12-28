package com.Set;

import java.util.HashSet;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> students = new HashSet<>();

        //添加元素
        students.add(new Student(20,"李华"));
        students.add(new Student(21,"王科"));
        students.add(new Student(20,"李华"));
        students.add(new Student(22,"刘芳"));

        //遍历输出学生
        for(Student s:students){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
