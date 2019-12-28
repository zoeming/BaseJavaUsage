package com.baseUsage;

import java.util.Scanner;

public class DebugStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which is the day of this week?");
        String a = sc.nextLine();

        switch(a){
            case "Monday":
                System.out.println("跑步");
                break;
            case "Tuesday":
                System.out.println("游泳");
                break;
            case "Wednesday":
                System.out.println("慢走");
                break;
            case "Thursday":
                System.out.println("动感单车");
                break;
            case "Friday":
                System.out.println("拳击");
                break;
            case "Saturday":
                System.out.println("爬山");
                break;
            case "Sunday":
                System.out.println("吃饭");
                break;
        }

    }
}
