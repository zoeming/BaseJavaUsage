package com.Lambda.MethodReference;

/*
定义一个测试类(StudentDemo)，在测试类中提供两个方法
    - 一个方法是：useStudentBuilder(StudentBuilder s)
    - 一个方法是主方法，在主方法中调用useStudentBuilder方法
 */
public class StudentDemo {
    public static void main(String[] args) {
        //lambda
        useStudentBuilder((name,age)->new Student(name,age));

        //构造器
        //引用构造器，其实就是引用构造方法
        //类名::new
        //Lambda表达式被构造器替代的时候，它的形式参数全部传递给构造器作为参数
        useStudentBuilder(Student::new);
    }
    public static void useStudentBuilder(StudentBuilder s){
        Student k = s.build("mary",19);
        System.out.println(k.getName()+","+k.getAge());
    }
}
