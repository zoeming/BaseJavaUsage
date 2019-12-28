package com.baseUsage;

/*
方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载
   - 多个方法在同一个类中
   - 多个方法具有相同的方法名
   - 多个方法的参数不相同，类型不同或者数量不同
*/

public class MethodOveride {
    public static void main(String[] args) {
        getMax(1,2);
        getMax(1.1,2.1);
        getMax(1,2,3);
    }

    // 定义getMan()方法输出两个数中的较大数(int）
    public static void getMax(int a, int b){
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    // 定义getMan()方法输出两个数中的较大数(double）
    public static void getMax(double a, double b){
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    // 定义getMan()方法输出三个数中的较大数
    public static void getMax(int a, int b, int c){
        if(a>b && a>c)
            System.out.println(a);
        else if(b>a && b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }

}
