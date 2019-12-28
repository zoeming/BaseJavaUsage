package com.Exception;

import java.util.Scanner;

public class ScoreExceptionDemo{
    public static void checkSocre(int score) throws ScoreException{
        if(score<0 || score>100){
            //throw a new exception
            throw new ScoreException("please input a correct score(0-100)!");
        }else{
            System.out.println("normal score.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input a score:");
        int i = sc.nextInt();

        try {
            checkSocre(i);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
