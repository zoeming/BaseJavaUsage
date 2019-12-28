package com.IOStream;

import java.io.*;
import java.util.ArrayList;

/*
- 案例需求
  把文本文件中的数据读取到集合中，并遍历集合。要求：文件中每一行数据是一个集合元素
- 实现步骤
  - 创建字符缓冲输入流对象
  - 创建ArrayList集合对象
  - 调用字符缓冲输入流对象的方法读数据
  - 把读取到的字符串数据存储到集合中
  - 释放资源
  - 遍历集合
 */
public class File2Array {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        //创建一个ArrayList对象
        ArrayList<String> al = new ArrayList<>();

        //读取文件数据到ArrayList
        String l;
        while((l = br.readLine())!=null) {
            al.add(l);
        }

        //释放资源
        br.close();

        //遍历集合
        for(String s:al){
            System.out.println(s);
        }
    }
}
