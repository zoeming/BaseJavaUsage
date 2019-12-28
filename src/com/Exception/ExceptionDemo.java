package com.Exception;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
            at com.Exception.ExceptionDemo.method(ExceptionDemo.java:13)
            at com.Exception.ExceptionDemo.main(ExceptionDemo.java:6)
         */
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("你访问的索引不存在");
            e.printStackTrace();
        }
    }
}
