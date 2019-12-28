package com.Interface;

public class TableTennisPlayer extends Player implements StudyEnglish{
    public TableTennisPlayer() {
    }

    public TableTennisPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study(){
        System.out.println("Table tennis player study table tennis");
    }

    @Override
    public void learn() {
        System.out.println("Table tennis player learn english");
    }
}
