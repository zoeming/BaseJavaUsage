package com.FileClass;

import java.util.Scanner;

/*
实现菲波拉切级数
 */
public class RecursionDemo {
    public static void main(String[] args) {
        //输入第n个级数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        System.out.println("第"+n+"个菲波拉切级数是："+fab(n));
    }

    public static int fab(int n){
        if(n==1 || n==2)
            return 1;
        else
            return fab(n-2)+fab(n-1);
    }
}
