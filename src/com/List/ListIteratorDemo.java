package com.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
ListIterator介绍
- 通过List集合的listIterator()方法得到，所以说它是List集合特有的迭代器
- 用于允许程序员沿任一方向遍历的列表迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //列表迭代器添加元素
        ListIterator<String> l = list.listIterator();
        while(l.hasNext()){
            String s = l.next();
            if(s.equals("java"))
                l.add("javaee");
        }

        System.out.println(list); //[hello, world, java, javaee]

        //逆向遍历
        while(l.hasPrevious()){
            String s = l.previous();
            System.out.println(s); //javaee java world hello
        }


    }
}
