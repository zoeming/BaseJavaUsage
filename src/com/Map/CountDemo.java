package com.Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
需求：
    - 键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
    - 举例：键盘录入“aababcabcdabcde”  在控制台输出：“a(5)b(4)c(3)d(2)e(1)”
 */
public class CountDemo {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.nextLine();

        //创建集合对象
        HashMap<Character, Integer> hs = new HashMap<>();

        //遍历字符串并统计
        for(int i=0; i<input.length(); i++){
            //得到每一个字符
            char key = input.charAt(i);

            //存在键则值加一；不存在键则录入键
            if(hs.containsKey(key)){
                hs.put(key, hs.get(key)+1);
            }
            else
                hs.put(key,1);

        }

        //遍历输出统计各字符数量
        Set<Character> keys = hs.keySet();
        for(Character s:keys){
            System.out.print(s+"("+hs.get(s)+")");
        }

    }
}
