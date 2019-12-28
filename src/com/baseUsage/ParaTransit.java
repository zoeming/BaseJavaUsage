package com.baseUsage;

public class ParaTransit {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(n); // 0
        n = change1(n);
        System.out.println(n); // 100
        change2(n);
        System.out.println(n); // 100
        int[] arr = {1,1,1,1,1};
        change(arr);
        System.out.println(arr[0]); // 3
    }

    // 基本数据类型参数传递(有返回）
    public static int change1(int x){
        x = 100;
        return x;
    }

    // 基本数据类型参数传递（无返回）
    public static void change2(int x){
        x = 200;
    }

    // 引用类型参数传递(形参改变会改变实参的值）
    public static void change(int[] arr){
        arr[0] = 3;
    }
}
