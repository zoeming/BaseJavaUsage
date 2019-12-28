package com.baseUsage;

public class ArrayStudy {
    public static void main(String[] args) {
        // 新建数组
        int[] arr = new int[3];
        arr[0] = 1;
        System.out.println(arr); // 输出arr[0]的地址
        System.out.println("arr[0]:"+arr[0]); // 1
        System.out.println("arr[1]:"+arr[1]); // 0
        System.out.println("arr[2]:"+arr[2]); // 0

//       新建一个数组指向第一个数组
//       这里是arr1指向arr的地址
//       因此改变arr1数组中的值时arr中的值也会改变
        /*int[] arr1 = arr;
        arr1[0] = 2;
        arr1[2] = 2;
        arr1[1] = 2;
        System.out.println(arr1); // 输出arr[0]的地址
        System.out.println("arr[0]:"+arr[0]); // 2
        System.out.println("arr[1]:"+arr[1]); // 2
        System.out.println("arr[2]:"+arr[2]); // 2
        */

        // 静态初始化
        /*
        int[] arr2 = {1,2,3};
        System.out.println(arr2); // 输出arr[0]的地址
        System.out.println("arr2[0]:"+arr2[0]); // 1
        System.out.println("arr2[1]:"+arr2[1]); // 2
        System.out.println("arr2[2]:"+arr2[2]); // 3
        */

        // 数组遍历
        /*
        int[] a = {1,2,3,4,5,6};
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        */


    }
}
