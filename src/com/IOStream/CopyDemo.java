package com.IOStream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符输入流对象
        File f = new File("");
        String path = f.getCanonicalPath();
        System.out.println(path);
        BufferedReader br = new BufferedReader(new FileReader(path + "//src//com//IOStream//PrintStreamDemo.java"));
        //根据目的地创建字符输出流对象
        PrintWriter pw = new PrintWriter(new FileWriter("Copy.java"),true);

        //读写数据，复制文件
        String line;
        while ((line=br.readLine())!=null) {
            pw.println(line);
        }

        //释放资源
        pw.close();
        br.close();
    }
}
