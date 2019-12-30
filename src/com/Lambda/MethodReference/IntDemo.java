package com.Lambda.MethodReference;

import com.Lambda.MethodReference.Int;

/*
引用类方法，其实就是引用类的静态方法
类名::静态方法
 */
public class IntDemo {
    public static void main(String[] args) {
        //lambda
        useInt(Integer::parseInt);

    }

    //Lambda表达式被类方法替代的时候，它的形式参数全部传递给静态方法作为参数
    public static void useInt(Int i){
        int n = i.convert("999");
        System.out.println(n);
    }
}
