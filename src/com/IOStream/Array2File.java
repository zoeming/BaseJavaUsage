package com.IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
- 案例需求
  把ArrayList集合中的字符串数据写入到文本文件。要求：每一个字符串元素作为文件中的一行数据
- 实现步骤
  - 创建ArrayList集合
  - 往集合中存储字符串元素
  - 创建字符缓冲输出流对象
  - 遍历集合，得到每一个字符串数据
  - 调用字符缓冲输出流对象的方法写数据
  - 释放资源
 */
public class Array2File {
    public static void main(String[] args) throws IOException {
        //创建ArrayList对象
        ArrayList<String> al = new ArrayList<>();
        al.add("hello");
        al.add("java");
        al.add("happy to study");

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("test1.txt"));

        //写入数据
        for(String s:al){
            bw.write(s);
            bw.newLine();
        }

        //释放资源
        bw.close();
    }
}
