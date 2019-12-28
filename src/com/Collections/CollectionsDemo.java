package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<Integer>();

        //添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        //public static <T extends Comparable<? super T>> void sort(List<T> list)：将指定的列表按升序排序
//        Collections.sort(list); //[30, 20, 50, 10, 40]

        //public static void reverse(List<?> list)：反转指定列表中元素的顺序
//        Collections.reverse(list); //[40, 10, 50, 20, 30]

        //public static void shuffle(List<?> list)：使用默认的随机源随机排列指定的列表
        Collections.shuffle(list); //[50, 40, 30, 10, 20]

        System.out.println(list);
    }
}
