package com.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
通过反射技术，向一个泛型为Integer的集合中添加一些字符串数据
 */
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> array = new ArrayList<Integer>();

        //获取array的Class对象
        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);

        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");

        System.out.println(array);
    }
}
