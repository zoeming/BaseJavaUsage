package com.FunctionInterface;

import java.util.function.Function;

/*
Function接口
Function<T,R>接口通常用于对参数进行处理，转换(处理逻辑由Lambda表达式实现)，然后返回一个新的值
T-函数输入的类型
R-函数结果的类型

R  apply(T t):将此函数应用于给定的参数
default <V> Function andThen(Function after):返回一个组合函数，首先将该函数应用于输入，然后将after函数应用于结果
 */
public class FunctionDemo {
    public static void main(String[] args) {

        String s = "9842";
        convert(s, s1 -> Integer.parseInt(s)+1);

        add(s, s1->Integer.parseInt(s1), s2->String.valueOf(s2+9));


    }

    //定义一个方法，把一个int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void convert(String s, Function<String, Integer> fun){
        int i = fun.apply(s);
        System.out.println(i);
    }

    //定义一个方法，把一个字符串转换int类型，在控制台输出
    private static void add(String s, Function<String,Integer> fun1, Function<Integer,String> fun2){
        String i = fun1.andThen(fun2).apply(s);
        System.out.println(i);
    }
}
