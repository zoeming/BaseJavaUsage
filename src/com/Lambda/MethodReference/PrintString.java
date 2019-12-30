package com.Lambda.MethodReference;
/*
定义一个类(PrintString)，里面定义一个方法
public void printUpper(String s)：把字符串参数变成大写的数据，然后在控制台输出
 */
public class PrintString {
    public void printUpper(String s){
        String out = s.toUpperCase();
        System.out.println(out);
    }
}
