package com.IOStream;

import java.util.Properties;
import java.util.Set;

/*
Properties类表示一组持久的属性，是一个Map体系的集合类
Properties可以保存到流中或从流中加载。
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        //创建Properties对象
        Properties p = new Properties();

        //写入数据
        p.put("java",1);
        p.put("python",2);
        p.put("c++",3);

        //返回所有值的集合
        System.out.println(p.values());
        System.out.println(p.keys());
        //返回所有键的集合
        System.out.println(p.keySet());

        //遍历集合
        Set<Object> keySet = p.keySet();
        for(Object key:keySet){
            Object value = p.get(key);
            System.out.println(key+","+value);
        }
    }
}
