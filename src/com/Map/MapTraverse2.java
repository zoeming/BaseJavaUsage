package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
案例需求
    - 创建一个HashMap集合，键是学生对象(Student)，值是居住地 (String)。存储多个元素，并遍历。
    - 要求保证键的唯一性：如果学生对象的成员变量值相同，我们就认为是同一个对象
思路：
    定义学生类
    创建集合对象
    创建学生对象
    把学生添加到集合中
    遍历集合
    学生类中重写equals()和hashcode()方法
 */
public class MapTraverse2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<Student, String> mp = new HashMap<>();

        //创建学生对象
        Student s1 = new Student(30,"林青霞");
        Student s2 = new Student(35,"张曼玉");
        Student s3 = new Student(33,"王祖贤");
        Student s4 = new Student(33,"王祖贤");

        //把学生添加到集合
        mp.put(s1, "西安");
        mp.put(s2, "武汉");
        mp.put(s3, "郑州");
        mp.put(s4, "北京");

        //遍历集合
        Set<Student> keySet = mp.keySet();
        for (Student key : keySet) {
            String value = mp.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
