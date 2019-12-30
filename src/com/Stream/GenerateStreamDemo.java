package com.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
生成Stream流的方式

- Collection体系集合
  使用默认方法stream()生成流， default Stream<E> stream()
- Map体系集合
  把Map转成Set集合，间接的生成流
- 数组
  通过Stream接口的静态方法of(T... values)生成流

 */
public class GenerateStreamDemo {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream()生成流
        ArrayList<String> al = new ArrayList<>();
        Stream<String> st = al.stream();

        //Map体系的集合间接的生成流
        Map<String,Integer> m = new HashMap<>();
        Stream<String> sk = m.keySet().stream();
        Stream<Integer> sv = m.values().stream();

        //数组可以通过Stream接口的静态方法of(T... values)生成流
        String[] strArray = {"hello","world","java"};
        Stream<String> s1 = Stream.of(strArray);
        Stream<String> s2 = Stream.of("hello","world","java");
        Stream<Integer> s3 = Stream.of(1,2,3,4);

    }
}
