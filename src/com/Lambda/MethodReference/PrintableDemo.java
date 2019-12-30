package com.Lambda.MethodReference;

import com.Lambda.MethodReference.Printable;

/*
方法引用
 */
public class PrintableDemo {
    public static void main(String[] args) {
        //使用匿名类
        usePrintable(new Printable() {
            @Override
            public void printString(String s) {
                System.out.println(s);
                System.out.println("hahaha");
            }
        });

        //lambda
        usePrintable(s -> System.out.println(s+",java"));

        //方法引用
        //可推导就是可省略
        //使用方法引用符::
        usePrintable(System.out::println);

    }

    public static void usePrintable(Printable p){
        p.printString("hello");
    }
}
