package com.Set;

import java.util.TreeSet;
/*
- TreeSet()：根据其元素的自然排序进行排序
- TreeSet(Comparator comparator) ：根据指定的比较器进行排序
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts = new TreeSet<>();

        //添加元素
        ts.add(4);
        ts.add(33);
        ts.add(99);
        ts.add(12);

        //遍历元素
        for(int s:ts){
            System.out.println(s); //4 12 33 99
        }
    }
}
