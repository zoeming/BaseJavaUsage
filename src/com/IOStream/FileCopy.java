package com.IOStream;

import java.io.*;

/*
实现步骤
    - 根据数据源创建字符输入流对象
    - 根据目的地创建字符输出流对象
    - 读写数据，复制文件
    - 释放资源

 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //创建filereader对象
        File f = new File("");
        //获取目标java文件路径
        String path = f.getCanonicalPath();
        System.out.println(path);
        FileReader fr = new FileReader(path+ "\\src\\com\\Map\\Student.java");
        //创建filewrite对象
        FileWriter fw = new FileWriter(path +"\\src\\com\\IOStream\\Student.java");

        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1) {
            fw.write(chs,0,len);
        }

        //释放资源
        fw.close();
        fr.close();
    }
}
