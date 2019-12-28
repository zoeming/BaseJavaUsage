package com.List;

import com.Collection.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        List<Student> c = new ArrayList<Student>();

        //把学生添加到集合
        c.add(new Student(12,"zz"));
        c.add(new Student(19,"ll"));
        c.add(new Student(18,"xx"));

        //遍历集合(index)，带索引的遍历方式
        for(int n=0; n<c.size(); n++){
            Student o = c.get(n);
            System.out.println(o.getAge()+","+o.getName());
        }

        //增强for遍历，最方便的遍历方式
        for(Student s:c){
            System.out.println(s.getAge()+","+s.getName());
        }

        //Iterator迭代器实现遍历,集合特有的遍历方式
        Iterator<Student> i = c.iterator();
        while(i.hasNext()){
            Student o = i.next();
            System.out.println(o.getAge()+","+o.getName());
        }
    }
}
