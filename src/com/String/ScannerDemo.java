package com.String;

import java.util.Scanner;

/*
Scanner: 获取键盘录入数据
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);

        // 接收数据
        System.out.println("please input a string:");
        String line = sc.nextLine();

        // 输出结果
        System.out.println("what you just input is: "+line);

    }
}
