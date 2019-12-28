package com.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //创建集合对象
        Set<String> set = new HashSet<String>();

        //添加元素
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复元素的集合
        set.add("world");

        //遍历
        for(String s : set) {
            //输出集合元素及哈希值，相同对象的哈希值相同

            System.out.println(s+","+s.hashCode());
        }

        //默认情况下不同对象的哈希值不同，可以通过方法重写实现不同对象的哈希值相同
        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395
        System.out.println("时间".hashCode()); //847550
    }
}
