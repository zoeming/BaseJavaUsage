package com.IOStream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
字符串的编解码
 */
public class StringEn_DecodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个字符串
        String s = "中国";

        //byte[] getBytes():使用平台的默认字符集将该 String编码为一系列字节
        byte[] bys = s.getBytes();//默认是utf-8，[-28, -72, -83, -27, -101, -67]
        //byte[] getBytes(String charsetName):使用指定的字符集将该 String编码为一系列字节
//        byte[] bys = s.getBytes("utf-8"); //[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes("gbk"); //[-42, -48, -71, -6]
//        byte[] bys = s.getBytes("ASCII"); //[63, 63]
        System.out.println(Arrays.toString(bys));

        //String(byte[] bytes):使用平台的默认字符集解码指定的字节数组来创建字符串
        String ss = new String(bys); //中国
        //String(byte[] bytes, String charsetName):通过指定的字符集解码指定的字节数组来创建字符串
//        String ss = new String(bys,"gbk"); //涓浗
        System.out.println(ss);

    }
}
