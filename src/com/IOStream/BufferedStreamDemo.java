package com.IOStream;

import java.io.*;


/*
BufferedOutputStream(OutputStream out):创建字节缓冲输出流对象

BufferedInputStream(InputStream in):创建字节缓冲输入流对象
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream is = new FileInputStream("窗里窗外.txt");
        //创建字节缓冲输入流对象
        BufferedInputStream bis = new BufferedInputStream(is);


        //创建字节输出流对象
        FileOutputStream os = new FileOutputStream("ouput.txt");
        //创建字节缓冲输出流对象
        BufferedOutputStream bos = new BufferedOutputStream(os);

        //写数据
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());

        //读数据
        byte[] b = new byte[1024];
        int len;
        while((len = bis.read()) != -1){
            System.out.print(new String(b,0,len));
        }

        //释放资源
        bis.close();
        bos.close();


    }
}
