package com.Modifier.StateModifier;

public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        z.show();

        // final修饰引用变量，变量的值可以修改,地址值不能修改
        final Fu f = new Fu();
        System.out.println(f.age);
        f.age=10;
        System.out.println(f.age);


    }
}
