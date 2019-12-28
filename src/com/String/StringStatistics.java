package com.String;

import java.util.Scanner;

/*
思路：
    1:键盘录入一个字符串，用 Scanner 实现
    2:要统计三种类型的字符个数，需定义三个统计变量，初始值都为0
    3:遍历字符串，得到每一个字符
    4:判断该字符属于哪种类型，然后对应类型的统计变量+1
        假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
        大写字母：ch>='A' && ch<='Z'
        小写字母： ch>='a' && ch<='z'
        数字： ch>='0' && ch<='9'
    5:输出三种类型的字符个数
 */
public class StringStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String input = sc.nextLine();

        int BigCount = 0;
        int SmallCount = 0;
        int NumberCount = 0;
        int OtherCount = 0;

        // 判断字符属于哪个类型，并统计个数
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch>='A' && ch<='Z')
                BigCount = BigCount + 1;
            else if(ch>='a' && ch<='z')
                SmallCount = SmallCount + 1;
            else if(ch>='0' && ch<='9')
                NumberCount = NumberCount + 1;
            else
                OtherCount = OtherCount + 1;
        }

        // 输出不同类型字符的个数
        System.out.println("大写字母:"+BigCount+",小写字母："+SmallCount+",数字："+NumberCount+",其他字符："+OtherCount);
    }
}
