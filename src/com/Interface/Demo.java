package com.Interface;
/*
接口不能直接被实例化，要通过其实现类来进行实例化
 */
public class Demo {
    public static void main(String[] args) {
        // c只能直接调用jumpping中的方法
        Jumpping c = new Cat();
        c.jump();
        ((Cat) c).eat();
        ((Cat) c).setAge(3);
        ((Cat) c).setName("MIMI");
        System.out.println(((Cat) c).getName()+","+((Cat) c).getAge());
        System.out.println("====================================");

        // a只能直接调用Animal中的方法
        Animal a = new Cat();
        ((Cat) a).jump();
        a.eat();
        a.setAge(3);
        a.setName("MEIMEI");
        System.out.println("====================================");

        // t可以直接调用Cat中的方法，包括Animal和Jumpping中的方法，因此一般直接实例化Cat类
        Cat t = new Cat();
        t.jump();
        t.eat();
        t.play();
        t.catchMouse();
        t.setAge(5);
        t.setName("Kitty");
        System.out.println("====================================");

        Jumpping d = new Dog();
        d.jump();
        ((Dog) d).eat();
        ((Dog) d).setName("HUZI");
        ((Dog) d).setAge(4);
        System.out.println(((Dog) d).getName()+","+((Dog) d).getAge());


    }
}
