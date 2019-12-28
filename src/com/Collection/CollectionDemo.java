package com.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
*/
public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素：boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");
        //输出集合对象
        System.out.println(c); //[hello, world, java]
        //判断集合中是否存在指定的元素
        System.out.println(c.contains("java")); //true
        //集合的长度，也就是集合中元素的个数
        System.out.println(c.size()); //3

        //删除指定元素
        c.remove("hello");
        //输出集合对象
        System.out.println(c); //[world, java]

        //清空所有元素
        c.clear();
        //输出集合对象
        System.out.println(c); //[]
        //判断集合是否为空
        System.out.println(c.isEmpty()); //true


    }
}
