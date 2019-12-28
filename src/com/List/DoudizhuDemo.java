package com.List;

import java.util.ArrayList;
import java.util.Collections;

/*
案例需求
	通过程序实现斗地主过程中的洗牌，发牌和看牌
 */
public class DoudizhuDemo {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> array = new ArrayList<>();

        //往牌盒装牌
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //对应花色和点数
        for(String color:colors){
            for(String number:numbers){
                array.add(color+number);
            }
        }
        array.add("joker1");
        array.add("joker2");

        System.out.println(array);

        //洗牌
        Collections.shuffle(array);
        System.out.println(array);

        //发牌
        //把牌分成三份
        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
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
        lookPoker("x",a1);
        lookPoker("y",a2);
        lookPoker("z",a3);
        /*
        x的牌是：♥A ♦2 ♠7 ♥6 ♥8 ♠6 ♥5 ♣8 ♥K ♥3 ♦Q ♣7 joker2 ♣K ♠10 ♦5 ♥J ♣10
        y的牌是：♠A ♦9 ♦7 ♣Q ♣9 ♥Q ♠Q ♣2 ♣A ♦10 ♠3 ♥2 ♦4 ♣3 ♣4 ♣5 ♦J ♠J
        z的牌是：♦K ♠8 ♠2 ♦6 ♥10 ♣J ♥7 ♠5 ♥9 ♦8 ♠9 ♦A ♥4 ♠K ♠4 ♣6 ♦3 joker1
         */

    }

    //看牌的方法
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.print(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
