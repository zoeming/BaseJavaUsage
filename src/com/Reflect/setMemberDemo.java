package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
voidset(Object obj,Object value):给obj对象的成员变量赋值为value
 */
public class setMemberDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取Class对象
        Class<?> c = Class.forName("com.Reflect.Student");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //Field getDeclaredField(String name):返回单个成员变量对象
        Field name = c.getDeclaredField("name");
        //public void setAccessible(boolean flag):值为true，取消访问检查
        name.setAccessible(true);
        //给成员变量赋值
        name.set(obj,"花花");

        //s.age = 30;
        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        age.set(obj,30);

        //s.address=上海
        Field address = c.getField("address");
        address.set(obj,"上海");
        System.out.println(obj); //Student{name='花花', age='30', address='上海'}


    }
}
