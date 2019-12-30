package com.FunctionInterface;

import java.util.function.Predicate;

/*
Predicate接口
Predicate<T>接口通常用于判断参数是否满足指定的条件

boolean test(T t):对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值
default Predicate<T> negate():返回一个逻辑的否定，对应逻辑非
default Predicate<T> and(Predicate other):返回一个组合判断，对应短路与
default Predicate<T> or(Predicate other):返回一个组合判断，对应短路或
 */
public class PredicateDemo {
    public static void main(String[] args) {
        //lambda表达式作为判断条件
        boolean b = checkString("lajdjale", s -> s.length() > 3);
        System.out.println(b); //true

        boolean b1 = negCheckString("lajdjale", s -> s.length() > 3);
        System.out.println(b1); //false

        boolean b2 = andCheckString("lajdjale", s -> s.length() > 3, s -> s.length()<8);
        System.out.println(b2); //false

        boolean b3 = orCheckString("lajdjale", s -> s.length() > 3, s -> s.length()<8);
        System.out.println(b3); //true

    }

    //返回lambda表达式的判断值
    private static boolean checkString(String s, Predicate<String> p) {
        return p.test(s);
    }

    //返回lambda表达式逻辑值的非
    private static boolean negCheckString(String s, Predicate<String> p) {
        return p.negate().test(s);
    }

    //返回两个lambda表达式的逻辑与
    private static boolean andCheckString(String s, Predicate<String> p1, Predicate<String> p2) {
        return p1.and(p2).test(s);
    }

    //返回两个lambda表达式的逻辑或
    private static boolean orCheckString(String s, Predicate<String> p1, Predicate<String> p2) {
        return p1.or(p2).test(s);
    }
}
