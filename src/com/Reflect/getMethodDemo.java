package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
T newInstance(Object...initargs):根据指定的构造方法创建对象

通过反射获取公共的构造方法并创建对象
 */
public class getMethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class<?> c = Class.forName("com.Reflect.Student");

        //获取构造方法
        //Constructor<T> getConstructor(Class<?>... parameterTypes)
        Constructor<?> con = c.getConstructor(int.class, String.class, String.class);

        //创建对象
        //T newInstance(Object... initargs)
        Object obj = con.newInstance(28,"小红","上海");

        System.out.println(obj); //Student{name='小红', age='28', address='上海'}


        //获取构造方法
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
        Constructor<?> con1 = c.getDeclaredConstructor(String.class);

        //暴力反射
        //访问私有成员变量会抛出访问异常，需要设置Accessible
        //public void setAccessible(boolean flag):值为true，取消访问检查
        con1.setAccessible(true);

        //创建对象
        //T newInstance(Object... initargs)
        Object obj1 = con1.newInstance("小红");

        System.out.println(obj1); //Student{name='小红', age='0', address='null'}


        //获取构造方法
        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
        Constructor<?> con2 = c.getDeclaredConstructor(String.class, int.class);

        //创建对象
        //T newInstance(Object... initargs)
        Object obj2 = con2.newInstance("小红",22);

        System.out.println(obj2); //Student{name='小红', age='22', address='null'}
    }
}
