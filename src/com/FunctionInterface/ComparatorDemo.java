package com.FunctionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
需求描述

定义一个类(ComparatorDemo)，在类中提供两个方法
一个方法是：Comparator<String> getComparator()   方法返回值Comparator是一个函数式接口
一个方法是主方法，在主方法中调用getComparator方法
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        //构造使用场景

        //定义集合，存储字符串元素
        ArrayList<String> array = new ArrayList<>();
        array.add("adafa");
        array.add("OOO");
        array.add("SKJL");

        System.out.println(array);

        //对集合排序
        Collections.sort(array);
        System.out.println(array);
        Collections.sort(array,getComparator());
        System.out.println(array);

    }
    public static Comparator<String> getComparator(){
        //匿名内部类的方式实现
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length()-s2.length();
//            }
//        };

        //Lambda方式实现
        //如果方法返回的是一个函数式接口，可以使用lambda表达式作为结果返回
        return (s1,s2) -> s1.length() - s2.length();
    }
}
