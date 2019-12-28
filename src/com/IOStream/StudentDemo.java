package com.IOStream;

import java.io.*;
import java.util.ArrayList;

/*
- 案例需求
  把ArrayList集合中的学生数据写入到文本文件。要求：每一个学生对象的数据作为文件中的一行数据
        格式：学号,姓名,年龄,居住地	举例：itheima001,林青霞,30,西安
- 实现步骤
  - 定义学生类
  - 创建ArrayList集合
  - 创建学生对象
  - 把学生对象添加到集合中
  - 创建字符缓冲输出流对象
  - 遍历集合，得到每一个学生对象
  - 把学生对象的数据拼接成指定格式的字符串
  - 调用字符缓冲输出流对象的方法写数据
  - 释放资源
 */
public class StudentDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));

        //创建ArrayList对象
        ArrayList<Student> al = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("itheima001", "林青霞", 30, "西安");
        Student s2 = new Student("itheima002", "张曼玉", 35, "武汉");
        Student s3 = new Student("itheima003", "王祖贤", 33, "郑州");

        //将学生对象写入ArrayList
        al.add(s1);
        al.add(s2);
        al.add(s3);

        //将每个学生对象拼接为一个字符串并写入字符缓冲输出流中
        for(Student s:al){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        //释放资源
        bw.close();
    }
}
