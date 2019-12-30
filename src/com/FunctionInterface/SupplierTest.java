package com.FunctionInterface;

import java.util.ArrayList;
import java.util.function.Supplier;

/*
案例需求
定义一个类(SupplierTest)，在类中提供两个方法
一个方法是：int getMax(Supplier<Integer> sup)   用于返回一个int数组中的最大值
一个方法是主方法，在主方法中调用getMax方法
 */
public class SupplierTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        Integer max = getMax(() -> {
            int maxvalue = a[0];
            for(int i=0; i<a.length; i++){
                if(a[i]>maxvalue)
                    maxvalue = a[i];
            }
            return maxvalue;
        });
        System.out.println(max);
    }
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
