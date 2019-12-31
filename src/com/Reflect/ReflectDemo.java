package com.Reflect;

/*
- 使用类的class属性来获取该类对应的Class对象：类名.class属性
- 调用对象的getClass()方法：对象名.getClass()方法，该方法是Object类中的方法
- 使用Class类中的静态方法：Class.forName(全类名)方法，需要传入字符串参数，字符串参数是某个类的全路径
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象：类名.class属性
        Class<Student> c = Student.class;
        System.out.println(c); //class com.Reflect.Student

        Class<Student> c1 = Student.class;
        System.out.println(c1==c); //true

        //调用对象的getClass()方法：对象名.getClass()方法，该方法是Object类中的方法
        Student s = new Student();
        Class<? extends Student> c2 = s.getClass();
        System.out.println(c2==c); //true

        //使用Class类中的静态方法：Class.forName(全类名)方法，需要传入字符串参数，字符串参数是某个类的全路径
        Class<?> c3 = Class.forName("com.Reflect.Student");
        System.out.println(c3==c); //true
    }
}
