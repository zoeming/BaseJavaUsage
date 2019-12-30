package com.FunctionInterface;

import java.util.function.Consumer;

/*
String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
字符串数组中有多条信息，请按照格式：“姓名：XX,年龄：XX"的格式将信息打印出来
 */
public class ConsumerDemo1 {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
        useComsumer(strArray, s-> System.out.print("姓名："+s.split(",")[0]+","), s->System.out.println("年龄："+s.split(",")[1]));
    }

    public static void useComsumer(String[] str, Consumer<String> c1, Consumer<String> c2){
        for(String s : str){
            c1.andThen(c2).accept(s);
        }
    }
}
