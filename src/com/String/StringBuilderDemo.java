package com.String;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // 创建空白可变的字符串对象
        StringBuilder sb = new StringBuilder();

        System.out.println("sb:"+sb); // sb:
        System.out.println("sb.length():"+sb.length()); // sb.length():0

        // 创建可变的字符串变量
        StringBuilder sb1 = new StringBuilder("hello");

        System.out.println("sb1:"+sb1); // sb1:hello
        System.out.println("sb1.length():"+sb1.length()); // sb1.length():5

        // 创建普通字符串常量
        String s = "hello";
        System.out.println("s:"+s); // s:hello
        System.out.println("s.length():"+s.length()); // s.length():5

        // 改变值后s1和s2指向的地址不同
        String s1 = s;
        System.out.println(s1==s); // true
        s1 += "world";
        System.out.println("s1:"+s1); // s1:helloworld
        System.out.println("s:"+s); // s:hello
        System.out.println(s==s1); // false

        // sb1和sb2始终指向同一地址
        StringBuilder sb2 = sb1;
        sb2.append("world");
        System.out.println("sb1:"+sb1); // helloworld
        System.out.println("sb2:"+sb2); // helloworld
        System.out.println(sb1==sb2); // true

        // 链式编程
        sb2.append(",").append("java!");
        System.out.println("sb2:"+sb2); // sb2:helloworld,java!

        // StringBuilder反转
        sb1.reverse();
        System.out.println("sb1:"+sb1); // sb1:!avaj,dlrowolleh
        System.out.println(sb2); // !avaj,dlrowolleh

        // StringBuilder和String的转换
        String s2 = sb1.toString();
        StringBuilder sb3 = new StringBuilder(s2);
        // 返回数据类型
        System.out.println(s2.getClass().toString()); // class java.lang.String
        System.out.println(sb3.getClass().toString()); // class java.lang.StringBuilder
    }

}
