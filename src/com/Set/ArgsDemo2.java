package com.Set;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ArgsDemo2 {
    public static void main(String[] args) {
        //public static <T> List<T> asList(T... a)：返回由指定数组支持的固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");

        list.add("javaee"); //UnsupportedOperationException
        list.remove("world"); //UnsupportedOperationException
        list.set(1,"javaee");

        System.out.println(list);

        //jdk1.8不支持list.of和set.of
        //由List.of生成的列表不能进行增删改操作
//        //public static <E> List<E> of(E... elements)：返回包含任意数量元素的不可变列表
//        List<String> l = List.of("hello", "world", "java", "world");
//
//        l.add("javaee");//UnsupportedOperationException
//        l.remove("java");//UnsupportedOperationException
//        l.set(1,"javaee");//UnsupportedOperationException
//
//        System.out.println(list);
//
//        //public static <E> Set<E> of(E... elements) ：返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of("hello", "world", "java","world"); //IllegalArgumentException
//        Set<String> set1 = Set.of("hello", "world", "java");
//
//        set.add("javaee");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException
//
//        System.out.println(set);
    }
}
