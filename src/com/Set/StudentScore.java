package com.Set;
/*
- 用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
- 要求：按照总分从高到低出现
 */
public class StudentScore {
    //定义成员变量
    private String name;
    private int mathscore;
    private int chinesescore;

    //无参构造方法
    public StudentScore() {
    }

    //带参构造方法
    public StudentScore(String name, int mathscore, int chinesescore) {
        this.name = name;
        this.mathscore = mathscore;
        this.chinesescore = chinesescore;
    }

    //getter&setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathscore() {
        return mathscore;
    }

    public void setMathscore(int mathscore) {
        this.mathscore = mathscore;
    }

    public int getChinesescore() {
        return chinesescore;
    }

    public void setChinesescore(int chinesescore) {
        this.chinesescore = chinesescore;
    }

    //重写equals和hashcode方法，保证可以存入多组数据
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentScore that = (StudentScore) o;

        if (mathscore != that.mathscore) return false;
        if (chinesescore != that.chinesescore) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + mathscore;
        result = 31 * result + chinesescore;
        return result;
    }

    //定义sum函数
    public int Sum(){
        int sum = this.chinesescore+this.mathscore;
        return sum;
    }
}
