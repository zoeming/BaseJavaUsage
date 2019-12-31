package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    反射获取成员变量并使用

Field[] getFields():返回所有公共成员变量对象的数组
Field[] getDeclaredFields():返回所有成员变量对象的数组
Field getField(String name):返回单个公共成员变量对象
Field getDeclaredField(String name):返回单个成员变量对象
 */
public class getMemberDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.Reflect.Student");

        //Field[] getFields():返回所有公共成员变量对象的数组
        Field[] fields = c.getFields();
        for(Field field : fields){
            System.out.println(field);
            //public java.lang.String com.Reflect.Student.name
        }

        //Field[] getDeclaredFields():返回所有成员变量对象的数组
        Field[] fields1 = c.getDeclaredFields();
        for(Field field : fields1){
            System.out.println(field);
            //int com.Reflect.Student.age
            //private java.lang.String com.Reflect.Student.name
            //public java.lang.String com.Reflect.Student.address
        }

        //Field getField(String name):返回单个公共成员变量对象
        //Field getDeclaredField(String name):返回单个成员变量对象
        Field fields2 = c.getField("address");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //Field提供有关类或接口的单个字段的信息和动态访问
        //void set(Object obj, Object value) 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值
        fields2.set(obj,"上海");
        System.out.println(obj);

    }
}
