package com.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.DoubleStream;

/*
编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
 */
public class RandomNumber {
    public static void main(String[] args) {
        //创建集合对象
        Set<Integer> s = new TreeSet<>();
//        Set<Integer> s = new HashSet<>();

        //生成随机数(设置随机种子），并添加到集合中
        Random r = new Random(11);
        while(s.size()<10){
            int d = r.nextInt(20)+1; //[1, 3, 8, 9, 10, 12, 14, 15, 16, 19]
            s.add(d);
        }

        System.out.println(s);

    }
}
