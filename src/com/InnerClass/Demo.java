package com.InnerClass;

public class Demo {
    public static void main(String[] args) {
        // 创建内部类对象
        // 外部类.内部类 对象 = new 外部类().new 内部类()
        Outer.Inner i = new Outer().new Inner();
        i.show();

        Outer o = new Outer();
        o.show();

    }
}
