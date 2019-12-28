package com.List;

import java.util.ArrayList;
import java.util.LinkedList;

/*
    ArrayList底层数据结构是数组，查询快，增删慢
    LinkedList底层数据结构是链表，查询慢，增删快
 */
public class ListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        for(String s:array){
            System.out.println(s);
        }

        LinkedList<String> linked = new LinkedList<>();
        linked.add("hello");
        linked.add("world");
        linked.add("java");

        for(String s:linked){
            System.out.println(s);
        }

    }
}
