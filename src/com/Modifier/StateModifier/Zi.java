package com.Modifier.StateModifier;

public class Zi extends Fu{

//    被final修饰的方法不能被重写
//    @Override
//    public void method(){
//        System.out.println("Zi method");
//    }

    @Override
    public final void method(){
        System.out.println("Zi method");
    }

    public final int age = 19;
    public void show() {
//        age = 30; // final修饰的变量不能被修改
        System.out.println(age);
    }
}
