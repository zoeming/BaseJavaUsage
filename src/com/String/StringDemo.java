package com.String;
/*
String的构造方法
 */
public class StringDemo {
    public static void main(String[] args) {
        // 创建对象:创建一个空白字符串对象
        String s1 = new String();
        System.out.println("s1:"+s1); // s1:

        // 根据字符数组内容创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:"+s2); // s2:abc

        // 根据字节数组内容创建字符串对象,ASCII码
        byte[] bys = {97,98,99};
        String s3 = new String(bys);
        System.out.println("s3:"+s3); // s3:abc

        // 直接赋值创建字符串对象(推荐！！！）
        String s4 = "abc";
        System.out.println("s4:"+s4); // s4:abc

        // 以""创建的多个字符串对象，如果其内容相同，那么JVM只会建立一个String对象
        // 因此s4和s5本质是同一个对象，地址值相同
        // 但是用其他方法创建的字符串对象，即使内容相同，其地址值也不同
        // 使用==比较基本类型数据比较的是数据值，比较引用类型数据比较的是地址值
        String s5 = "abc";
        String s6 = new String(bys);
        System.out.println(s4==s5); // true
        System.out.println(s3==s5); // false
        System.out.println(s3==s6); // false

        // 用equals()比较两个字符串的值
        System.out.println(s3.equals(s5)); // true
        System.out.println(s3.equals(s6)); // true

    }
}
