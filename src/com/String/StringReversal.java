package com.String;

import java.util.Scanner;

/*
    思路：
        1:键盘录入一个字符串，用 Scanner 实现
        2:定义一个方法，实现字符串反转。返回值类型 String，参数 String s
        3:在方法中把字符串倒着遍历，然后把每一个得到的字符拼接成一个字符串并返回
        4:调用方法，用一个变量接收结果
        5:输出结果
 */
public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个字符串：");
        String s = sc.nextLine();

        // 定义反转字符串
        String s1 = new String();

        for(int i=s.length()-1; i>=0; i--)
            s1 += s.charAt(i);

        System.out.println("输出反转字符串：");
        System.out.println(s1);
    }
}
