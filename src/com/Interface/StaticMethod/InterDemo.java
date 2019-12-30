package com.Interface.StaticMethod;

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImp();
        i.show();
        i.method();

        //接口中的静态方法只能用接口调用
        Inter.test();
    }
}
