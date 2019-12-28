package com.IOStream;

import java.io.*;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
//        //创建一个文件对象
//        File f = new File("fox.txt");
//        FileOutputStream fos = new FileOutputStream(f);
        //创建字节流输出对象
        FileOutputStream fos = new FileOutputStream("fos.txt" );
        /*
            做了三件事：
                1.调用系统功能创建了文件
                2.创建了字节输出流对象
                3.让字节输出流对象指向创建好的文件
         */

        //void write(int b)：将指定的字节写入此文件输出流
        fos.write(97);
        //写入换行
        /*
        不同操作系统的换行符不同
            windows: \r\n
            linux:\n
            mac:\r
         */
        fos.write("\n".getBytes());

        //void write(byte[] b)：将 b.length字节从指定的字节数组写入此文件输出流
        byte[] bys = {97, 98, 99, 100, 101};
//        byte[] bys = "abcde".getBytes(); //等价于上面的写法，一般使用这种做法比较方便
        fos.write(bys);
        //写入换行
        fos.write("\n".getBytes());

        //void write(byte[] b, int off, int len)：将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        fos.write(bys,1,3);

        //释放资源，关闭此文件输出流并释放与此流相关联的任何系统资源
        fos.close();

        //追加写入
        FileOutputStream f = new FileOutputStream("fos.txt" ,true);
        f.write("\n123".getBytes());

        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");

//        //读取字节流的标准代码
//        int by;
//        //字节流末尾为-1
//        while ((by = fis.read()) != -1) {
//            System.out.println((char)by);
//        }

        System.out.println("--------");
//        //一次读取一个字节流数据
//        byte[] b = new byte[5];
//        //将读取的字节流数据存放到字节数组中
//        int aby = fis.read(b);
//        System.out.println(aby); //5
//        //将字节数组变为字符串
//        System.out.print(new String(b)); //5\nabc
        //标准代码
        byte[] b = new byte[1024]; //数组长度一般为1024或其整数倍
        int len;
        while((len=fis.read(b)) != -1){
            System.out.print(new String(b,0,len));
        }

        //释放资源
        fis.close();

    }
}
