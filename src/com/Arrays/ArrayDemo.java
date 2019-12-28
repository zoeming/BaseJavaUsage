package com.Arrays;
/*
    冒泡排序：
        一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，
        依次对所有的数据进行操作，直至所有数据按要求完成排序
 */

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {3, 32, 12, 2, 5, 1};
        System.out.println("原始数组：");
        System.out.println(Array2String(a));

        // 冒泡法
        for (int i = 0; i < a.length; i++)
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        System.out.println("排序后的数组：");
        System.out.println(Array2String(a));

        /*
        public static String toString(int[] a):返回指定数组的内容的字符串表示形式
        public static void sort(int[] a):按照数字顺序排列指定的数组
         */
        // Arrays方法实现
        int[] a1 = {3, 32, 12, 2, 5, 1};
        System.out.println("原始数组：");
        System.out.println(Arrays.toString(a1));
        System.out.println("排序后的数组：");
        Arrays.sort(a1);
        System.out.println(Array2String(a1));
    }

    public static String Array2String(int[] a) {
        String s = new String();

        s += '[';
        for (int i = 0; i < a.length - 1; i++) {
            s = s + a[i] + ',';
        }
        s += a[a.length - 1];
        s += ']';
        return s;
    }
}
