package com.Lambda;

/*
定义一个测试类(EatableDemo)，在测试类中提供两个方法
  - 一个方法是：useEatable(Eatable e)
  - 一个方法是主方法，在主方法中调用useEatable方法
 */
public class EatableDemo{
    public static void main(String[] args) {
        //调用方法
        Eatable e = new EatableImp();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("an apple a day, keeps doctor away");
            }
        });

        //lambda表达式
        useEatable(()->{
            System.out.println("an apple a day, keeps doctor away");
        });

    }

    private static void useEatable(Eatable e){
        e.eat();
    }
}
