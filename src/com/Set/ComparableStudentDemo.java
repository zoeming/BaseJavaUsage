package com.Set;

import java.util.Comparator;
import java.util.TreeSet;

/*
要求：
    - 存储学生对象并遍历，创建TreeSet集合使用无参构造方法
    - 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
实现方法：
    - 用TreeSet集合存储自定义对象，无参构造方法使用的是自然排序对元素进行排序的
    - 自然排序，就是让元素所属的类实现Comparable接口，重写compareTo(T o)方法
    - 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
 */
public class ComparableStudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> students = new TreeSet<>();

        //添加元素
        students.add(new Student(23,"xishi"));
        students.add(new Student(28,"yangyuhuan"));
        students.add(new Student(22,"zhaojun"));
        students.add(new Student(24,"diaochan"));
        students.add(new Student(22,"daqiao"));


        //遍历循环
        for(Student s:students){
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("-----------");
        //使用Comparator实现排序
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge()-o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });

        //添加元素
        ts.add(new Student(23,"xishi"));
        ts.add(new Student(28,"yangyuhuan"));
        ts.add(new Student(22,"zhaojun"));
        ts.add(new Student(24,"diaochan"));
        ts.add(new Student(22,"daqiao"));

        //遍历循环
        for(Student s:ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
