package com.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
- 案例需求
  	把“mn.jpg”复制到模块目录下的“output.jpg”
- 实现步骤
  - 根据数据源创建字节输入流对象
  - 根据目的地创建字节输出流对象
  - 读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
  - 释放资源
 */
public class PictureCopy {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream fis = new FileInputStream("mn.jpg");
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("output.jpg");

        //读写图片数据
        byte[] b = new byte[1024];
        int len;
        while((len = fis.read(b)) != -1){
            fos.write(b,0,len);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
