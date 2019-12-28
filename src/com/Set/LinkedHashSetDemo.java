package com.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
/*
linkedHashSet中存储的元素不重复，且存储和取出元素的顺序一致
前者由HashSet保证，后者由链表保证
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> hs = new LinkedHashSet();

        //添加元素
        hs.add("hello");
        hs.add("java");
        hs.add("javaee");
        hs.add("java");

        //遍历集合
        for(String s:hs){
            System.out.println(s); //hello java javaee
        }

    }
}
