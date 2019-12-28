package com.List;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //增强for循环,内部原理是Iterator迭代器
        for(String i : list){
            System.out.println(i);
        }

        String[] str = {"aa", "bb", "cc"};
        for(String i : str){
            System.out.println(i);
        }
    }
}
