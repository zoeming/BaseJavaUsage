package com.IOStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
- 字节打印流：PrintStream
- 字符打印流：PrintWriter
*/
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //PrintStream(String fileName)：使用指定的文件名创建新的打印流
        PrintStream ps = new PrintStream("ps.txt");

        //写数据
        ps.write(97);

        //释放资源
        ps.close();

    }
}
