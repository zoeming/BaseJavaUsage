package com.InnerClass;
/*
匿名内部类是一个继承了该类或者实现了该接口的子类匿名对象
格式：
    new 类名或接口名(){
        重写方法
    };
 */
public class Outer2 {

    public void method(){
        Inter i = new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
    }
}
