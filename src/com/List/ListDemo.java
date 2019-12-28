package com.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("hello");
        l.add("world");
        l.add("java");
        l.add("java");

        System.out.println(l);//[hello,world,java,java]

        Iterator<String> i = l.iterator();
        while(i.hasNext()){
            String s = i.next();
            System.out.println(s);
        }

        //在此集合中的指定位置插入指定的元素
        l.add(1,"oo");
        System.out.println(l); //[hello, oo, world, java, java]

        //删除指定索引处的元素，返回被删除的元素
        l.remove(2);
        System.out.println(l); //[hello, oo, java, java]

        //修改指定索引处的元素，返回被修改的元素
        l.set(1,"world");
        System.out.println(l); //[hello, world, java, java]

        //返回指定索引处的元素
        System.out.println(l.get(2)); //java

        //遍历索引取集合元素
        for(int n=0; n<l.size(); n++){
            System.out.println(l.get(n));
        }
    }
}
