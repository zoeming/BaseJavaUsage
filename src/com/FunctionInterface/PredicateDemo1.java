package com.FunctionInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
练习描述
    - String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
    - 字符串数组中有多条信息，请通过Predicate接口的拼装将符合要求的字符串筛选到集合ArrayList中，并遍历ArrayList集合
    - 同时满足如下要求：姓名长度大于2；年龄大于33
 */
public class PredicateDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};

        //姓名长度大于2；年龄大于33
        ArrayList<String> al = selection(strArray, s -> s.split(",")[0].length()>2,
                s -> Integer.parseInt(s.split(",")[1])>33);

        //输出结果
        for(String str:al){
            System.out.println(str);
        }
    }

    public static ArrayList<String> selection(String[] s, Predicate<String> p1, Predicate<String> p2){
        ArrayList<String> a = new ArrayList<>();

        for(String str : s){
            if(p1.and(p2).test(str)){
                a.add(str);
            }
        }
        return a;
    }
}
