package com.IOStream;

import java.util.Properties;
import java.util.Set;

/*
Object   setProperty(String key, String value):设置集合的键和值，都是String类型，底层调用   Hashtable方法 put
String   getProperty(String key):使用此属性列表中指定的键搜索属性
Set<String>   stringPropertyNames():从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
 */
public class PropertiesDemo2 {
    public static void main(String[] args) {
        //创建Properties对象
        Properties p = new Properties();

        //写入数据
        p.setProperty("java","1");
        p.setProperty("python","2");
        p.setProperty("c++","3");
        System.out.println(p); //{java=1, python=2, c++=3}

        //Object   setProperty(String key, String value):设置集合的键和值，都是String类型，底层调用Hashtable方法 put
        p.setProperty("java","2");
        System.out.println(p); //{java=2, python=2, c++=3}

        //String   getProperty(String key):使用此属性列表中指定的键搜索属性
        System.out.println(p.getProperty("java")); //2

        //Set<String>   stringPropertyNames():从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串
        Set<String> s = p.stringPropertyNames();
        System.out.println(s); //[java, python, c++]



    }
}
