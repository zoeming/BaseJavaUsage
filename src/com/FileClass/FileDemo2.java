package com.FileClass;

import java.io.File;
import java.io.IOException;
/*
创建文件
public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
public boolean mkdir()：创建由此抽象路径名命名的目录
public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
public   boolean isDirectory()：测试此抽象路径名表示的File是否为目录
public   boolean isFile()：测试此抽象路径名表示的File是否为文件
public   boolean   exists()：测试此抽象路径名表示的File是否存在
public   String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
public   String getPath():将此抽象路径名转换为路径名字符串
public   String getName():返回由此抽象路径名表示的文件或目录的名称
public   String[] list():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
public   File[] listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在E:\\itcast目录下创建一个文件java.txt
        //如果文件存在就返回false，如果文件不存在返回true并创建文件
        File f1 = new File("E:\\itcast\\java.txt");
        System.out.println(f1.createNewFile()); //false
        //获取绝对路径
        System.out.println(f1.getAbsolutePath()); //E:\itcast\java.txt
        //获取路径的字符串形式
        System.out.println(f1.getPath()); //E:\itcast\java.txt
        //获取文件名
        System.out.println(f1.getName()); //java.txt
        System.out.println("--------");

        //需求2：我要在E:\\itcast目录下创建一个目录JavaSE
        File f2 = new File("E:\\itcast\\JavaSE");
        System.out.println(f2.mkdir()); //false
        System.out.println("--------");

        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("E:\\itcast\\JavaWEB\\HTML");
//        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs()); //false
        //判断f3路径是否为文件
        System.out.println(f3.isFile()); //false
        //判断f3路径是否为目录
        System.out.println(f3.isDirectory()); //true
        //判断f3路径是否存在
        System.out.println(f2.exists()); //true
        System.out.println("--------");

        //需求4：我要在E:\\itcast目录下创建一个文件javase.txt
        File f4 = new File("E:\\itcast\\javase.txt");
        System.out.println(f4.mkdir()); //false
        //删除f4路径下的内容
        System.out.println(f4.delete()); //true
        System.out.println(f4.createNewFile()); //true
        System.out.println(f4.isFile()); //true
        System.out.println("----------");

        //需求5：获取E:\\itcast目录下的所有文件和目录
        //新建File对象
        File f5 = new File("E:\\itcast");
        //获取路径名目录下的所有路径和目录名称的字符串数组
        String[] l1 = f5.list();
        for(String s:l1)
            System.out.println(s);
        /*
            java.txt
            JavaSE
            javase.txt
            JavaWEB
         */
        System.out.println("++++++++");
        //获取路径名下的目录中的文件和目录的File对象数组
        File[] l2 = f5.listFiles();
        for(File f:l2){
            System.out.println(f.getName());
        }
        /*
            java.txt
            JavaSE
            javase.txt
            JavaWEB
         */

    }
}
