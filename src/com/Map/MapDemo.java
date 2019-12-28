package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
Map集合的基本操作
 */
public class MapDemo {
    public static void main(String[] args) {
        //创建map对象
        Map<String, String> m = new HashMap();

        //添加元素
        m.put("一号","西施");
        m.put("二号","昭君");
        m.put("三号","貂蝉");
        m.put("四号","玉环");
        m.put("二号","王娡");

        //输出集合对象
        System.out.println(m); //{二号=王娡, 四号=玉环, 三号=貂蝉, 一号=西施}

        //删除对应键的元素
        m.remove("一号");

        //输出集合对象
        System.out.println(m); //{二号=王娡, 四号=玉环, 三号=貂蝉}

        //判断集合中是否包含指定键
        System.out.println(m.containsKey("三号")); //true

        //判断集合中是否包含指定值
        System.out.println(m.containsValue("昭君")); //false
        System.out.println(m.containsValue("西施")); //false

        //判断集合是否为空
        System.out.println(m.isEmpty()); //false

        //输出集合的长度
        System.out.println(m.size()); //3

        //V get(Object key) 根据键获取值
        System.out.println(m.get("二号")); //王娡
        System.out.println(m.get("一号")); //Null

        //获取键的集合和值的集合
        System.out.println(m.keySet()); //[二号, 四号, 三号]
        System.out.println(m.values()); //[王娡, 玉环, 貂蝉]

        //Set<K> keySet() 获取所有键的集合 键不能重复，所以用Set
        Set<String> k = m.keySet();
        for(String s:k){
            System.out.println(s);
        }

        //Collection<V> values():获取所有值的集合
        Collection<String> values = m.values();
        for(String value : values) {
            System.out.println(value);
        }

    }
}