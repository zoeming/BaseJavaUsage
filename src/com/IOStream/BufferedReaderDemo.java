package com.IOStream;

import java.io.*;

/*
字符缓冲流
BufferedWriter(Writer out):创建字符缓冲输出流对象
BufferedReader(Reader in):创建字符缓冲输入流对象
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象
        //BufferedReader不能改变解码格式，可以先用inputStreamReader改变其解码格式
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("output.txt"),"gbk"));
        //创建字符缓冲输入流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //读取数据
        //按行读取
        String l;
        while((l = br.readLine()) != null) {
            System.out.println(l);
        }
//        //按字符数组读取
//        char[] b = new char[1024];
//        int len;
//        while((len = br.read(b))!=-1){
//            System.out.println(new String(b, 0,len));
//        }

        //写入数据
        bw.write("hello,");
        bw.write("java");
        bw.newLine();

//        bw.write("hello,");
//        bw.write("java\r\n");

        //释放资源
        br.close();
        bw.close();
    }
}

