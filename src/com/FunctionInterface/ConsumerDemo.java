package com.FunctionInterface;

import java.util.function.Consumer;

/*
void  accept(T t):对给定的参数执行此操作
default Consumer<T>  andThen(Consumer after):
返回一个组合的Consumer，依次执行此操作，然后执行 after操作
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("mary",s-> System.out.println(s));

        operatorString("jack",s-> System.out.println(s),s-> System.out.println(s));

    }

    //定义一个方法，用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> c1, Consumer<String> c2){
        c1.andThen(c2).accept(name);
    }

    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> c){
        c.accept(name);
    }
}
