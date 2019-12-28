package com.Set;
/*
创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
要求：学生对象的成员变量值相同，我们就认为是同一个对象
需要重写equals和hashcode方法，自动生成
 */
public class Student implements Comparable<Student>{
    //创建成员变量
    private int age;
    private String name;

    //创建构造方法
    //无参构造
    public Student() {
    }

    //带参构造
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //Getter
    public int getAge() {
        return age;
    }

    //Setter
    public void setAge(int age) {
        this.age = age;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    //重写equals方法
    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    //重写compartTo方法
    @Override
    public int compareTo(Student o) {
//        return 0 //认为输入元素重复，不会添加后面的元素
//        return 1; //按照升序添加后面的元素
//        return -1; //按照降序添加后面的元素
        int num = this.age-o.age; //年龄按照从小到大排序
        int num2 = num==0?this.name.compareTo(o.name):num; //年龄相同按照姓名排序
        return num2;
    }
}
