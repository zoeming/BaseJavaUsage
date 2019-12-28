package com.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
案例需求
    - 创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList
    - 每一个ArrayList的元素是String，并遍历。
 */
public class MapTraverse4 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        //创建ArrayList集合，并添加元素
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义",sgyy);

        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("西游记",xyj);

        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("水浒传",shz);

        //遍历HashMap
        //b是书名的集合
        Set<String> b = hm.keySet();
        for(String s:b){
            //value是书中人物的集合
            ArrayList<String> value = hm.get(s);
            System.out.println(s+":");
            for(String s1:value){
                System.out.println('\t'+s1);
            }

        }
    }
}
