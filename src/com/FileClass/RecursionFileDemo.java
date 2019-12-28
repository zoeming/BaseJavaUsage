package com.FileClass;

import java.io.File;

/*
给定一个路径(E:\itcast)，通过递归完成遍历该目录下所有内容，并把所有文件的绝对路径输出在控制台
 */
public class RecursionFileDemo {
    public static void main(String[] args) {
        //创建一个File对象
        File f = new File("E:\\itcast");

        //调用方法
        getFilePath(f);


    }
    public static void getFilePath(File f){
        //获取给定的File目录下所有的文件或者目录的File数组
        File[] fileArray = f.listFiles();
        //遍历该File数组，得到每一个File对象
        if(fileArray != null) {
            for(File file : fileArray) {
                //判断该File对象是否是目录
                if(file.isDirectory()) {
                    //是：递归调用
                    getFilePath(file);
                } else {
                    //不是：获取绝对路径输出在控制台
                    System.out.println(file.getAbsolutePath());
                }
            }
        }


    }
}
