package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map的遍历
- - 我们刚才存储的元素都是成对出现的，所以我们把Map看成是一个夫妻对的集合
    - 获取所有结婚证的集合
    - 遍历结婚证的集合，得到每一个结婚证
    - 根据结婚证获取丈夫和妻子
- 步骤分析
  - 获取所有键值对对象的集合
    - Set<Map.Entry<K,V>> entrySet()：获取所有键值对对象的集合
  - 遍历键值对对象的集合，得到每一个键值对对象
    - 用增强for实现，得到每一个Map.Entry
  - 根据键值对对象获取键和值
    - 用getKey()得到键
    - 用getValue()得到值

 */
public class MapTraverse {
    public static void main(String[] args) {
        //构建集合对象
        Map<String,String> m = new HashMap<>();

        //添加元素
        m.put("张无忌", "赵敏");
        m.put("郭靖", "黄蓉");
        m.put("杨过", "小龙女");

        //得到丈夫的集合
        Set<String> h = m.keySet();
        //根据键找值
        for(String s:h){
            System.out.println(s+","+m.get(s));
        }

        //得到键值对象
        Set<Map.Entry<String, String>> entrySet = m.entrySet();
        //根据键值对对象找键和值
        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }

    }
}
