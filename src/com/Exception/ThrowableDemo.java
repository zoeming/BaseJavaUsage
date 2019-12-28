package com.Exception;

public class ThrowableDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] arr = {1, 2, 3};

            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){

            //public String getMessage():返回此 throwable 的详细消息字符串
//            System.out.println(e.getMessage()); //3

            ////public String toString():返回此可抛出的简短描述
            System.out.println(e.toString()); //java.lang.ArrayIndexOutOfBoundsException: 3

        }
    }
}
