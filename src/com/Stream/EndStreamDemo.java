package com.Stream;

import java.util.ArrayList;

/*
终结操作的意思是，执行完此方法之后，Stream流将不能再执行其他操作。
void forEach(Consumer action):对此流的每个元素执行操作
long count():返回此流中的元素数
 */
public class EndStreamDemo {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        list.add("张无忌");

        //void forEach(Consumer action):对此流的每个元素执行操作
        //把list集合中以张开头的，长度为3的元素在控制台输出
        list.stream().filter(l->l.startsWith(("张"))).filter(l->l.length()==3).forEach(System.out::println);

        //long count():返回此流中的元素数
        System.out.println(list.stream().count());
    }
}
