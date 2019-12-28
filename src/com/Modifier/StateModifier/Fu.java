package com.Modifier.StateModifier;

public class Fu {

    int age = 38;
    // 被final修饰的方法不能被重写
//    public final void method(){
//        System.out.println("Fu method");
//    }

    public void method(){
        System.out.println("Fu method");
    }
}

/*
final类不能被继承
public final class Fu {

    // 被final修饰的方法不能被重写
//    public final void method(){
//        System.out.println("Fu method");
//    }

    public void method(){
        System.out.println("Fu method");
    }
}
*/
