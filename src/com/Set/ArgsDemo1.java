package com.Set;

/*
可变参数又称参数个数可变，用作方法的形参出现，那么方法参数个数就是可变的了
可变参数的注意事项:
    - 这里的变量其实是一个数组
    - 如果一个方法有多个参数，包含可变参数，可变参数要放在最后
 */
public class ArgsDemo1 {
    public static void main(String[] args) {

        System.out.println(Sum(1,2,3)); //5
        System.out.println(Sum(4,5,6,7,8,9)); //35

    }
    //可变参数
    public static int Sum(int b, int ... a){
        int sum = 0;
        for(int i:a){
            sum += i;
        }
        return sum;
    }
}
