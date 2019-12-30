package com.Stream;

import java.util.ArrayList;

/*
案例需求
按照下面的要求完成集合的创建和遍历
- 创建一个集合，存储多个字符串元素
- 把集合中所有以"张"开头的元素存储到一个新的集合
- 把"张"开头的集合中的长度大于3的元素存储到一个新的集合
- 遍历上一步得到的集合
Stream<T> filter​(Predicate<? super T> predicate):返回由与此给定谓词匹配的此流的元素组成的流。
 */
public class StreamDemo {
    public static void main(String[] args) {
        //创建一个集合对象（原始）
        ArrayList<String> al = new ArrayList<>();
        al.add("张量");
        al.add("张冠李戴");
        al.add("明目张胆");
        al.add("张皇失措");

        //Stream流
        al.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() > 3).forEach(System.out::println);

    }
}
