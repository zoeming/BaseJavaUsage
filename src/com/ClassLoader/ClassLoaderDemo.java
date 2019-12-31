package com.ClassLoader;

/*
- Bootstrap class loader：它是虚拟机的内置类加载器，通常表示为null ，并且没有父null
- Platform class loader：平台类加载器可以看到所有平台类 ，平台类包括由平台类加载器或其祖先定义的Java SE平台API，其实现类和JDK特定的运行时类
- System class loader：它也被称为应用程序类加载器 ，与平台类加载器不同。 系统类加载器通常用于定义应用程序类路径，模块路径和JDK特定工具上的类
- 类加载器的继承关系：System的父加载器为Platform，而Platform的父加载器为Bootstrap
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        //static ClassLoader getSystemClassLoader()：返回用于委派的系统类加载器
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c); //AppClassLoader

        //ClassLoader getParent()：返回父类加载器进行委派
        ClassLoader c2 = c.getParent();
        System.out.println(c2); //ExtClassLoader


        ClassLoader c3 = c2.getParent();
        System.out.println(c3); //null
    }
}
