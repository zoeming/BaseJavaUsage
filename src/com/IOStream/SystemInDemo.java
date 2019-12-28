package com.IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
public static final InputStream in：标准输入流。通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
public static final PrintStream out：标准输出流。通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标

 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //标准输入流
        InputStream is = System.in;

//        int by;
//        //读取的是键盘输入，每次读一个字节，不能读字符串和中文
//        while((by=is.read())!=-1){
//            System.out.println((char)by);
//        }

        //将字节流转换为字符流
        //用转换流
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);


        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是：" + line);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是：" + i);

    }
}
