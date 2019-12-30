package com.FunctionInterface;

import java.util.function.Supplier;

/*
Supplier接口
Supplier<T>接口也被称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据供我们使用。

T get():按照某种实现逻辑(由Lambda表达式实现)返回一个数据
 */
public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> "Rose");
        System.out.println(s);

        Integer i = getInteger(()->9);
        System.out.println(i);
    }

    public static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    public static String getString(Supplier<String> sup){
        return sup.get();
    }
}
