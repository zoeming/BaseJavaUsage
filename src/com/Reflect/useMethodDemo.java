package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Method[] getMethods():返回所有公共成员方法对象的数组，包括继承的

Method[] getDeclaredMethods():返回所有成员方法对象的数组，不包括继承的

Method getMethod(String name, Class<?>... parameterTypes):返回单个公共成员方法对象

Method getDeclaredMethod(String name, Class<?>... parameterTypes):返回单个成员方法对象

 */
public class useMethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.Reflect.Student");

        //获取对象方法
        //Method[] getMethods():返回所有公共成员方法对象的数组，包括继承的
        Method[] methods = c.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }

        //Method[] getDeclaredMethods():返回所有成员方法对象的数组，不包括继承的
        Method[] declaredMethods = c.getDeclaredMethods();
        for(Method method:declaredMethods){
            System.out.println(method);
        }

        //Method getMethod(String name, Class<?>... parameterTypes):返回单个公共成员方法对象
        //Method getDeclaredMethod(String name, Class<?>... parameterTypes):返回单个成员方法对象
        Method m = c.getMethod("method1");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //在类或接口上提供有关单一方法的信息和访问权限
        //Object invoke(Object obj, Object... args) 在具有指定参数的指定对象上调用此 方法对象表示的基础方法
        //Object：返回值类型
        //obj：调用方法的对象
        //args：方法需要的参数
        m.invoke(obj);


    }
}
