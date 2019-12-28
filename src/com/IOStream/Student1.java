package com.IOStream;

public class Student1 {
    private String name;
    private int math;
    private int chinese;
    private int english;

    public Student1() {
    }

    public Student1(String name, int math, int chinese, int english) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int Sum(){
        int num = this.chinese+this.english+this.math;
        return num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student1 student1 = (Student1) o;

        if (math != student1.math) return false;
        if (chinese != student1.chinese) return false;
        if (english != student1.english) return false;
        return name != null ? name.equals(student1.name) : student1.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + math;
        result = 31 * result + chinese;
        result = 31 * result + english;
        return result;
    }
}
