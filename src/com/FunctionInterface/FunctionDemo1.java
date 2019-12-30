package com.FunctionInterface;

import java.util.function.Function;

/*
练习描述
- String s = "林青霞,30";
- 请按照我指定的要求进行操作：
  1:将字符串截取得到数字年龄部分
  2:将上一步的年龄字符串转换成为int类型的数据
  3:将上一步的int数据加70，得到一个int结果，在控制台输出
- 请通过Function接口来实现函数拼接

 */
public class FunctionDemo1 {
    public static void main(String[] args) {
        String s = "林青霞,30";
        //将年龄加70
        String i = add(s.split(",")[1], s1->Integer.parseInt(s1), s2->String.valueOf(s2+70));
        //将修改后的年龄加到姓名后面
        System.out.println(s.split(",")[0].concat(i));
    }

    private static String add(String s, Function<String,Integer> f1, Function<Integer,String> f2){
        String i = f1.andThen(f2).apply(s);
        return i;
    }
}
