package com.Object;

public class Student extends Object {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

/*
Object.toString一般需要重写
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*/
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*
            this --- s1
            o    --- s2
         */
        // 比较地址是否相同
        if (this == o) return true;
        // 判断两个对象是否来自同一类
        if (o == null || getClass() != o.getClass()) return false;

        // 向下转型
        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }


}

