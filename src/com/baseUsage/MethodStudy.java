package com.baseUsage;

public class MethodStudy {
    public static void main(String[] args) {
        max();
        getMax(1,2);
        int result = returnMax(4,5);
        System.out.println(result);
        int[] arr={1,3,4,5};
        printArr(arr);
        int max = getArrMax(arr);
        System.out.println("\n"+max);

    }

    // 定义一个普通输出方法
    public static void max(){
        System.out.println("max");
    }

    // 定义getMan()方法输出两个数中的较大数
    // 带参数的方法定义
    public static void getMax(int a, int b){
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    // 带返回值的方法定义
    public static int returnMax(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

    // 遍历输出一个数组中的所有元素
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    // 输出数组中的最大元素
    public static int getArrMax(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }

}
