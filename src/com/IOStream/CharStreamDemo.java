package com.IOStream;

import java.io.*;

/*
void   write(int c):写一个字符
void   write(char[] cbuf):写入一个字符数组
void write(char[] cbuf, int off, int len):写入字符数组的一部分
void write(String str):写一个字符串
void write(String str, int off, int len):写一个字符串的一部分
int read()：一次读一个字符数据
int read(char[] cbuf)：一次读一个字符数组数据
 */
public class CharStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字符输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test.txt"));

        //写入一个字符
        osw.write('a');
        //刷新流,如果不刷新，数据在缓冲区
        osw.flush();

        //写入一个字符数组
        char[] ch = {'a','b','c','d','e','f'};
        osw.write(ch,1,3);

        //写入一个字符串
        osw.write("\nhello");

        //写入字符串的一部分
        osw.write(",java....",0,5);

        //刷新流,如果不刷新，数据在缓冲区
        osw.flush();


        //释放资源，close()是先刷新缓冲，然后释放资源，close()直接关闭了输出流
        osw.close();

        //创建数据输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"));

//        //int read()：一次读一个字符数据
//        int c;
//        while ((c=isr.read())!=-1) {
//            System.out.print((char)c);
//        }

        //int read(char[] cbuf)：一次读一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        isr.close();

    }
}
