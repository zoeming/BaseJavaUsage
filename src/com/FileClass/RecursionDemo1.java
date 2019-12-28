package com.FileClass;

import java.util.Scanner;

/*
求n的阶乘
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
        //输入第n
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        System.out.println(n+"的阶乘是："+fac(n));
    }

    public static int fac(int n){
        if(n==1)
            return 1;
        else
            return n*fac(n-1);
    }
}
