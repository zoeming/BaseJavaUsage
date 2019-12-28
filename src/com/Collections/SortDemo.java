package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
案例需求
- ArrayList存储学生对象，使用Collections对ArrayList进行排序
- 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class SortDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        List<Student> c = new ArrayList<Student>();

        //把学生添加到集合
        c.add(new Student(12,"zz"));
        c.add(new Student(19,"ll"));
        c.add(new Student(18,"xx"));

        //重新定义一个比较器来完成排序
        Collections.sort(c, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge()-o2.getAge();
                ////按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
                int num2 = num == 0 ? o2.getName().compareTo(o1.getName()):num;
                return num2;
            }
        });

        //遍历输出
        for(Student s:c){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
