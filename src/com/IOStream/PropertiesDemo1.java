package com.IOStream;

import java.io.*;
import java.util.Properties;

/*
Propeties和IO流结合的方式
void   load(InputStream inStream):从输入字节流读取属性列表（键和元素对）
void   load(Reader reader):从输入字符流读取属性列表（键和元素对）
void   store(OutputStream out, String comments):将此属性列表（键和元素对）写入此   Properties表中，以适合于使用   load(InputStream)方法的格式写入输出字节流
void   store(Writer writer, String comments):将此属性列表（键和元素对）写入此   Properties表中，以适合使用   load(Reader)方法的格式写入输出字符流
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        //把文件中的数据加载到集合
        myLoad();
    }
    private static void myLoad() throws IOException {
        Properties prop = new Properties();

        //void load(Reader reader)：
        FileReader fr = new FileReader("pw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("itheima001","林青霞");
        prop.setProperty("itheima002","张曼玉");
        prop.setProperty("itheima003","王祖贤");

        //void store(Writer writer, String comments)：
        FileWriter fw = new FileWriter("fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
