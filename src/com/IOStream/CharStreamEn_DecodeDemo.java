package com.IOStream;

import java.io.*;

/*
字符流的编解码问题
 */
public class CharStreamEn_DecodeDemo {
    public static void main(String[] args) throws IOException {
        //创建字符流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test.txt"),"utf-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("窗里窗外.txt"),"gbk");

        //写入数据
        osw.write("中国");

        //读取数据
        int b;
        while((b = isr.read()) != -1){
            System.out.println((char)b);
        }


        //释放资源
        osw.close();
        isr.close();
    }
}
