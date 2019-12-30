package com.Lambda;

/*
定义一个测试类(FlyableDemo)，在测试类中提供两个方法
- 一个方法是：useFlyable(Flyable f)
- 一个方法是主方法，在主方法中调用useFlyable方法
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //调用方法
        Flyable f = new FlyableImp();
        useFlyable(f);

        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("lalaland");
            }
        });

        //lambda
        useFlyable((String l) -> {
            System.out.println(l);
            System.out.println("lalaland");
        });

        //如果只有一个参数，小括号和类型都可以省略
        useFlyable(s->{
            System.out.println("new print:"+s);
        });

        //如果代码块只有一句，大括号和分号都可以省略
        useFlyable(s ->
                System.out.println("省略大括号和分号也可以输出："+s));

    }

    public static void useFlyable(Flyable f){
        f.fly("heiheihei");
    }
}
