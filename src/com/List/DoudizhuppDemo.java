package com.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
案例需求
	通过程序实现斗地主过程中的洗牌，发牌和看牌。要求：对牌进行排序
 */
public class DoudizhuppDemo {
    public static void main(String[] args) {
        //创建牌盒
        HashMap<Integer,String> hm = new HashMap<>();
        //创建ArrayList，存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();

        //往牌盒装牌
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        int key = 0;
        //对应花色和点数
        for(String color:colors){
            for(String number:numbers){
                String s = color+number;
                hm.put(key, s);
                array.add(key++);
            }
        }
        hm.put(key,"joker1");
        array.add(key++);
        hm.put(key,"joker2");
        array.add(key++);

        //洗牌
        Collections.shuffle(array);
        System.out.println(array);

        //发牌
        //把牌分成三份
        TreeSet<Integer> a1 = new TreeSet<>();
        TreeSet<Integer> a2 = new TreeSet<>();
        TreeSet<Integer> a3 = new TreeSet<>();
        for(int i=0; i<array.size(); i++){
            if(i%3==1){
                a1.add(array.get(i));
            }
            else if(i%3==2){
                a2.add(array.get(i));
            }
            else
                a3.add(array.get(i));
        }

        //定义三个玩家看牌
        lookPoker("x",a1,hm);
        lookPoker("y",a2,hm);
        lookPoker("z",a3,hm);
        /*
        x的牌是：♦2 ♦3 ♦10 ♦J ♦Q ♣7 ♣8 ♣9 ♣J ♥2 ♥4 ♥J ♥A ♠3 ♠8 ♠9 ♠J ♠A
        y的牌是：♦4 ♦6 ♦8 ♦K ♣5 ♣6 ♣Q ♥6 ♥9 ♥10 ♥Q ♥K ♠2 ♠6 ♠10 ♠Q ♠K joker1
        z的牌是：♦5 ♦7 ♦9 ♦A ♣2 ♣3 ♣4 ♣10 ♣K ♣A ♥3 ♥5 ♥7 ♥8 ♠4 ♠5 ♠7 joker2
         */

    }

    //看牌的方法
    public static void lookPoker(String name, TreeSet<Integer> array, HashMap<Integer,String> hm) {
        System.out.print(name + "的牌是：");
        for (int poker : array) {
            System.out.print(hm.get(poker) + " ");
        }
        System.out.println();
    }
}
