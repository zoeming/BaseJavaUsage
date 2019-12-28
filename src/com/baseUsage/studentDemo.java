package com.baseUsage;
/*
    学生测试类
 */
public class studentDemo {
    public static void main(String[] args) {
        // 第一个对象
//        Student s = new Student();
        Student s = new Student("zz","男",11); // 带参数的构造方法
        s.name = "zhangsan";
        s.setAge(22);
        s.sexual = "男";


        s.introduce();
        s.doHomework();
        s.study();

        // 第二个对象
        Student s1 = new Student(); // 无参构造
        s1.name = "xiaohong";
        s1.setAge(22);
        s1.sexual = "女";

        s1.introduce();
        s1.doHomework();
        s1.study();
    }
}
