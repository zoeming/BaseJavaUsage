package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
需求：
    - 创建一个ArrayList集合，存储三个元素，每一个元素都是HashMap
    - 每一个HashMap的键和值都是String，并遍历。

 */
public class MapTraverse3 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<HashMap<String,String>> al = new ArrayList<>();

        //创建HashMap集合，并添加键值对元素
        HashMap<String, String> hm1 = new HashMap<String, String>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
        //把HashMap作为元素添加到ArrayList集合
        al.add(hm1);

        HashMap<String, String> hm2 = new HashMap<String, String>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        //把HashMap作为元素添加到ArrayList集合
        al.add(hm2);

        HashMap<String, String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        //把HashMap作为元素添加到ArrayList集合
        al.add(hm3);

        //s是每一个HashMap
        for(HashMap<String,String> s:al){
            //k是每一个HashMap的键集合
            Set<String> k = s.keySet();
            for(String key:k){
                System.out.println(key+","+s.get(key));
            }
        }
    }
}
