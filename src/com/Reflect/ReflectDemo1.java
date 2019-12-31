package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
反射获取构造方法并使用
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class类
        Class<?> c = Class.forName("com.Reflect.Student");

        //获取方法
        //Constructor<?>[] getConstructors()：返回所有公共构造方法对象的数组
        Constructor<?>[] cons = c.getConstructors();
        for(Constructor con:cons){
            System.out.println(con);
            //public com.Reflect.Student(int,java.lang.String,java.lang.String)
            //public com.Reflect.Student()
            System.out.println("-------------------");
        }
        //Constructor<?>[] getDeclaredConstructors():返回所有构造方法对象的数组
        Constructor[] c1 = c.getDeclaredConstructors();
        for(Constructor con:c1){
            System.out.println(con);
            //private com.Reflect.Student(java.lang.String)
            //com.Reflect.Student(java.lang.String,int)
            //public com.Reflect.Student(int,java.lang.String,java.lang.String)
            //public com.Reflect.Student()
            System.out.println("-------------------");
        }
        //Constructor<T> getConstructor(Class<?>... parameterTypes):返回单个公共构造方法对象
        //Constructor<T> getDeclaredConstructor​(Class<?>... parameterTypes) 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数。
        //参数：获取的构造方法的参数个数和数据类型对应的字节码文件对象
        Constructor<?> con = c.getConstructor();

        //Constructor提供了一个类的单个构造函数的信息和访问权限
        //T newInstance(Object... initargs) 使用由此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例
        Object obj = con.newInstance();
        System.out.println(obj); //Student{name='null', age='0', address='null'}


    }
}
