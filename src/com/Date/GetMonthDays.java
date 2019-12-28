package com.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
获取任意一年的二月有多少天
 */
public class GetMonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年：");
        int year = sc.nextInt();

        // 设置日历对象的年、月、日(3.1)
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        // 3月1日往前推一天，就是2月的最后一天
        c.add(Calendar.DATE,-1);

        // 获取这一天输出即可
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年的2月份有" + date + "天");
    }
}
