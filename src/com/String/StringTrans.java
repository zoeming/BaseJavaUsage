package com.String;
/*
    思路：
        1:定义一个 int 类型的数组，用静态初始化完成数组元素的初始化
        2:定义一个方法，用于把 int 数组中的数据按照指定格式拼接成一个字符串返回。
          返回值类型 String，参数列表 int[] arr
        3:在方法中遍历数组，按照要求进行拼接
        4:调用方法，用一个变量接收结果
        5:输出结果
 */
public class StringTrans {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        String s = array2String(a);
        System.out.println(s);

    }



    // 将int数组拼接为字符串
    public static String array2String(int[] a){

        String s = new String();

        s += '[';
        for(int i=0; i<a.length-1; i++){
            s = s + a[i]+',';
        }
        s += a[a.length-1];
        s += ']';
        return s;
    }
}
