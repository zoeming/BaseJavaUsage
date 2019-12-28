package com.List;

import java.util.ArrayList;
import java.util.List;

/*
并发修改异常:
    迭代器遍历的过程中，通过集合对象修改了集合中的元素，
    造成了迭代器获取元素中判断预期修改值和实际修改值不一致，则会出现：ConcurrentModificationException
解决的方案:
	用for循环遍历，然后用集合对象做对应的操作即可
 */
public class ConcurrentModificationExceptionDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现
        /*
        .next()方法在modCount!=expectedModCount时抛出ConcurrentModificationException错误
        而.add()在执行的时候会执行modCount++，因此之后调用.next()方法会出现modCount!=expectedModCount
         */
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if(s.equals("world")) {
//                list.add("javaee");
//            }
//        }

        for(int i=0; i<list.size(); i++) {
            String s = list.get(i);
            if(s.equals("world")) {
                list.add("javaee");
            }
        }

        //输出集合对象
        System.out.println(list);
    }
}
