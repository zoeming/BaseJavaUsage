package com.Arrays;
/*
有一个字符串：“91 27 46 38 50”，请写程序实现最终输出结果是：“27 38 46 50 91”
 */

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        System.out.println("原始字符串："+s);

        // 将字符串按照空格分隔成功数组
        String[] a = s.split(" ");

        // 将数组元素由字符串转换为整型数
        int[] arr = new int[a.length];
        for(int i=0; i<a.length; i++){
           arr[i] = Integer.parseInt(a[i]);
        }

        // 排序
        Arrays.sort(arr);

        // 输出排序后的数组
        System.out.println("最终输出："+Array2String(arr));

    }
    public static String Array2String(int[] a) {
        String s = new String();

        for (int i = 0; i < a.length - 1; i++) {
            s = s + a[i] + ' ';
        }
        s += a[a.length - 1];
        return s;
    }
}
