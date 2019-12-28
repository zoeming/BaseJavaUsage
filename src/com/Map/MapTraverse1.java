package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历

    思路：
        1:定义学生类
        2:创建HashMap集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            方式1：键找值
            方式2：键值对对象找键和值
 */
public class MapTraverse1 {
    public static void main(String[] args) {
        //构建集合对象
        Map<String,Student> m = new HashMap<>();

        //添加元素
        m.put("张无忌", new Student(19,"赵敏"));
        m.put("郭靖", new Student(20,"黄蓉"));
        m.put("杨过", new Student(22,"小龙女"));

        //方式1：键找值
        Set<String> h = m.keySet();
        for(String s:h){
            System.out.println(s+","+m.get(s).getName()+","+m.get(s).getAge());
        }

        //方式2：键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = m.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }

    }
}
