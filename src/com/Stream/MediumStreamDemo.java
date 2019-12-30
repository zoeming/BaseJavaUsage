package com.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

/*
中间操作的意思是，执行完此方法之后，Stream流依然可以继续执行其他操作。
流不能重复操作

Stream<T> filter(Predicate predicate):用于对流中的数据进行过滤
Stream<T> limit(long maxSize):返回此流中的元素组成的流，截取前指定参数个数的数据
Stream<T> skip(long n):跳过指定参数个数的数据，返回由该流的剩余元素组成的流
static <T> Stream<T> concat(Stream a, Stream b):合并a和b两个流为一个流
Stream<T> distinct():返回由该流的不同元素（根据Object.equals(Object) ）组成的流
Stream<T> sorted():返回由此流的元素组成的流，根据自然顺序排序
Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
<R> Stream<R> map(Function mapper):返回由给定函数应用于此流的元素的结果组成的流
IntStream mapToInt(ToIntFunction mapper):返回一个IntStream其中包含将给定函数应用于此流的元素的结果
 */
public class MediumStreamDemo {
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

        //Stream<T> filter(Predicate predicate):用于对流中的数据进行过滤
        System.out.println("Filter Demo:");
        //把list集合中以张开头的元素在控制台输出
        list.stream().filter(l->l.startsWith("张")).forEach(System.out::println);
        //把list集合中长度为3的元素在控制台输出
        list.stream().filter(l->l.length()==3).forEach(System.out::println);
        //把list集合中以张开头的，长度为3的元素在控制台输出
        list.stream().filter(l->l.startsWith(("张"))).filter(l->l.length()==3).forEach(System.out::println);
        System.out.println("-----------------------------");

        //Stream<T> limit(long maxSize):返回此流中的元素组成的流，截取前指定参数个数的数据

        System.out.println("limit Demo:");
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("-----------------------------");

        //Stream<T> skip(long n):跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        System.out.println("skip Demo:");
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("-----------------------------");

        //static <T> Stream<T> concat(Stream a, Stream b):合并a和b两个流为一个流
        System.out.println("concat Demo:");
        Stream<String> s4 = Stream.of("hello","world","java");
        Stream.concat(list.stream(),s4).forEach(System.out::println);
        System.out.println("-----------------------------");

        //Stream<T> distinct():返回由该流的不同元素（根据Object.equals(Object) ）组成的流（去重）
        System.out.println("distinct Demo:");
        list.stream().distinct().forEach(System.out::println);
        System.out.println("-----------------------------");

        //Stream<T> sorted():返回由此流的元素组成的流，根据自然顺序排序
        System.out.println("sorted(自然排序） Demo:");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("-----------------------------");

        //Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
        System.out.println("sorted(比较器) Demo:");
        list.stream().sorted((s1,s2) -> {
            int num = s1.length()-s2.length();
            int num2 = num==0?s1.compareTo(s2):num;
            return num2;
        }).forEach(System.out::println);
        System.out.println("-----------------------------");

        //<R> Stream<R> map(Function mapper):返回由给定函数应用于此流的元素的结果组成的流
        //IntStream mapToInt(ToIntFunction mapper):返回一个IntStream其中包含将给定函数应用于此流的元素的结果
        System.out.println("map Demo:");
        list.stream().map(s -> s.contains("张"));
        list.stream().mapToInt(String::length).forEach(System.out::println);

    }
}
