package com.IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
案例需求
    - 键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
    - 格式：姓名,语文成绩,数学成绩,英语成绩  举例：林青霞,98,99,100

分析步骤
    1. 定义学生类
    2. 创建TreeSet集合，通过比较器排序进行排序
    3. 键盘录入学生数据
    4. 创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
    5. 把学生对象添加到TreeSet集合
    6. 创建字符缓冲输出流对象
    7. 遍历集合，得到每一个学生对象
    8. 把学生对象的数据拼接成指定格式的字符串
    9. 调用字符缓冲输出流对象的方法写数据
    10. 释放资源
 */
public class StudentDemo1 {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合
        TreeSet<Student1> ts = new TreeSet<>(new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                int num = o2.Sum() - o1.Sum();

                int num1 = num == 0? o2.getChinese() - o1.getChinese() : num;
                int num2 = num1 == 0? o2.getEnglish() - o1.getEnglish() : num1;
                int num3 = num2 == 0? o2.getName().compareTo(o1.getName()) : num2;

                return num3;
            }
        });

        //键盘录入学生信息并添加到TreeSet中
        for(int i=0; i<5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i + 1) + "个学生信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            Student1 s = new Student1();

            s.setChinese(chinese);
            s.setEnglish(english);
            s.setMath(math);
            s.setName(name);

            ts.add(s);
        }

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("student1.txt"));

        //将treeset中的数据添加到字符缓冲输出流对象中
        for(Student1 s:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(s.Sum());
            bw.write(sb.toString());
            bw.newLine();
        }

        //释放资源
        bw.close();


    }
}
