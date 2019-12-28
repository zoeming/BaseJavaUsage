package com.Polymorphism;

public class Demo {
    public static void main(String[] args) {
        // 由父类引用子类的对象
        // 对象a就体现了多态性，
        // 访问成员变量时，在编译的时候a是Animal类，运行的时候也是Animal类
        // 访问成员方法时，在编译的时候a是Animal类，运行的时候也是Cat类,
        // 即如果子类中有对父类方法进行重写，则运行子类中的方法
        Animal c = new Cat();
        c.eat();
        System.out.println(c.age);
        System.out.println(((Cat) c).weight);

        // 多态可以提高程序的扩展性，使用时用具体的子类型参与操作
        Cat b = new Cat();
        Dog d = new Dog();
        AnimalOpreator a = new AnimalOpreator();
        a.useAnimal(b);
        a.useAnimal(d);

        /*
        向上转型
            从子到父
            父类引用指向子类对象
        向下转型
            从父到子
            父类引用指向子类对象
         */
        Animal n = new Cat(); // 向上转型
        n.eat();
        Cat t = (Cat)n; // 向下转型
        t.play();

    }
}
