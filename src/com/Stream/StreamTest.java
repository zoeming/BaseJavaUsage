package com.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作
    - 男演员只要名字为3个字的前三人
    - 女演员只要姓刘的，并且不要第一个
    - 把过滤后的男演员姓名和女演员姓名合并到一起
    - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
 */
public class StreamTest {
    public static void main(String[] args) {
        //创建三个集合对象
        ArrayList<String> man = new ArrayList<>();
        ArrayList<String> woman = new ArrayList<>();
        ArrayList<String> fin = new ArrayList<>();

        //集合写入数据
        String[] m = {"刘昊然","白敬亭","吴磊","朱一龙","吴亦凡","肖战"};
        String[] w = {"刘亦菲","迪丽热巴","刘诗诗","赵丽颖","陈瑶","古力娜扎"};
        man = add(m);
        woman = add(w);

        //男演员只要名字为3个字的前三
        Stream<String> mf = man.stream().limit(3);

        //女演员只要姓刘的，并且不要第一个
        Stream<String> wf = woman.stream().skip(1).filter(s->s.startsWith("刘"));

        //把过滤后的男演员姓名和女演员姓名合并到一起
        Stream.concat(mf,wf).forEach(System.out::println);

    }
    private static ArrayList<String> add(String[] str){
        ArrayList<String> al = new ArrayList<>();
        for(String s:str){
            al.add(s);
        }
        return al;
    }
}
