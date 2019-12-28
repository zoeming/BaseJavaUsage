package com.IOStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
PrintWriter(String fileName):使用指定的文件名创建一个新的PrintWriter，而不需要自动执行刷新
PrintWriter(Writer out, boolean autoFlush):创建一个新的PrintWriter    out：字符输出流    autoFlush： 一个布尔值，如果为真，则println ， printf ，或format方法将刷新输出缓冲区
 */
public class PrintWriteDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintWriter(String fileName) ：使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新
        PrintWriter pw = new PrintWriter("pw.txt");

        //写入数据
        pw.write("hello");
        pw.write("\r\n");
        pw.flush();
        pw.write("world");
        pw.write("\r\n");
        pw.flush();

        //释放资源
        pw.close();
    }
}
