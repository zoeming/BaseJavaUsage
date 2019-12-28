package com.IOStream;

import java.io.*;

/*
- 案例需求
  	把“窗里窗外.txt”复制到模块目录下的“窗里窗外.txt”
- 实现步骤
  - 复制文本文件，其实就把文本文件的内容从一个文件中读取出来(数据源)，然后写入到另一个文件中(目的地)
  - 数据源：
    	窗里窗外.txt --- 读数据 --- InputStream --- FileInputStream
  - 目的地：
    	output.txt --- 写数据 --- OutputStream --- FileOutputStream
 */
public class TextCopy {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream fis = new FileInputStream("窗里窗外.txt");
        //创建输出流对象
        FileOutputStream fps = new FileOutputStream("output.txt");

        //读写数据
        int by;
        while((by=fis.read()) != -1){
            fps.write(by);
        }

        //释放资源
        fis.close();
        fps.close();
    }
}
