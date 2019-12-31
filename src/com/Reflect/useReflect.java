package com.Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
通过反射实现类操作
- 获取Class对象：Class.forName
- 创建构造方法：Constructor<T> getConstructor(Class<?>... parameterTypes)
- 创建对象：T newInstance(Object... initargs)
- 创建成员变量：Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
            - 设置访问权限：public void setAccessible(boolean flag):值为true，取消访问检查
- 写入成员变量：Filed.set()
- 返回成员方法：Field getDeclaredMethod(String name):返回单个成员变量对象
- 调用成员方法：Object invoke(Object obj, Object... args)
 */
public class useReflect {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("com.Reflect.Student");

        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method method1 = c.getDeclaredMethod("method1");
        method1.invoke(obj);

        Method method2 = c.getDeclaredMethod("method2", String.class);
        method2.invoke(obj,"林青霞");

        Method method3 = c.getDeclaredMethod("method3", String.class, int.class);
        Object s = method3.invoke(obj,"林青霞",30);
        System.out.println(s);


    }

}
