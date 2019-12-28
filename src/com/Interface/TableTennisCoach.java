package com.Interface;

public class TableTennisCoach extends Coach implements StudyEnglish{
    public TableTennisCoach() {
    }

    public TableTennisCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Table tennis coach eat less");
    }

    @Override
    public void teach() {
        System.out.println("Table tennis coach teach Table tennis");
    }

    @Override
    public void learn() {
        System.out.println("Table tennis coach need learn english");
    }
}
