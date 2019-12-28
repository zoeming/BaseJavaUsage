package com.Set;


import java.util.Comparator;
import java.util.TreeSet;

/*
- 用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
- 要求：按照总分从高到低出现
 */
public class ScoreDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<StudentScore> hs = new TreeSet<>(new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore s1, StudentScore s2) {
//                int num = o1.getChinesescore()+o1.getMathscore()-o2.getChinesescore()-o2.getMathscore();
//                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
//                return num2;
                //主要条件，按照总分排序
                int num = (s2.Sum()-s2.Sum());
                //次要条件，按照语文分数排序
                int num2 = num == 0 ? s1.getChinesescore() - s2.getChinesescore() : num;
                //再次条件，按照姓名排序
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;
                return num3;
            }
        });

        //添加元素
        hs.add(new StudentScore("李明",98,70));
        hs.add(new StudentScore("肖华",88,89));
        hs.add(new StudentScore("杨曦",85,95));
        hs.add(new StudentScore("赵丽",89,88));

        //变量集合
        for(StudentScore s:hs){
            System.out.println(s.getName()+","+s.getMathscore()+","+s.getChinesescore()+","+s.Sum());
        }





    }
}
