package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIteratorDemo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //Iterator<E> iterator()：返回此集合中元素的迭代器，通过集合的iterator()方法得到
        Iterator<String> i = c.iterator();

        //用while循环改进元素的判断和获取
        /*
        boolean hasNext​() 如果迭代具有更多元素，则返回 true 。
        E next​() 返回迭代中的下一个元素。
         */
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }


    }
}
