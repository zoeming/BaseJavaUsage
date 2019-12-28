package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> c = new ArrayList<Student>();

        //把学生添加到集合
        c.add(new Student(12,"zz"));
        c.add(new Student(19,"ll"));
        c.add(new Student(18,"xx"));

        //遍历集合(迭代器方式)
        Iterator<Student> i = c.iterator();
        while (i.hasNext()){
            Student o = i.next();
            System.out.println(o.getAge()+","+o.getName());
        }

    }
}
