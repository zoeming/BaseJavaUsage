package com.Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/*
Java提供了DatagramSocket类作为基于UDP协议的Socket
DatagramSocket():创建数据报套接字并将其绑定到本机地址上的任何可用端口
DatagramPacket(byte[] buf,int len,InetAddress add,int port):创建数据包,发送长度为len的数据包到指定主机的指定端口
void send(DatagramPacket p):发送数据报包
void close():关闭数据报套接字
void receive(DatagramPacket p):从此套接字接受数据报包

UDP发送数据的步骤
    - 创建发送端的Socket对象(DatagramSocket)
    - 创建数据，并把数据打包
    - 调用DatagramSocket对象的方法发送数据
    - 关闭发送端

UDP发送数据：
    数据来自于键盘录入，直到输入的数据是886，发送数据结束
 */
public class UDPSendDemo {
    public static void main(String[] args) throws IOException {
        //DatagramSocket():创建数据报套接字并将其绑定到本机地址上的任何可用端口
        //创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket();


        //创建数据
//        //DatagramPacket(byte[] buf,int len,InetAddress add,int port):创建数据包,发送长度为len的数据包到指定主机的指定端口
//        //创建发送数据包
//        byte[] bt = "UDP Connection".getBytes();
//        InetAddress ia = InetAddress.getByName("192.168.1.115");
//        int port = 2333;
//        DatagramPacket dp = new DatagramPacket(bt,bt.length,ia,port);

        //键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=br.readLine())!=null){
            //输入的数据是886，发送数据结束
            if("886".equals(line))
                break;

            //创建数据，并把数据打包
            byte[] bt = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bt,bt.length,InetAddress.getByName("192.168.1.115"),2333);

            //调用DatagramSocket对象的方法发送数据
            //void send(DatagramPacket p):发送数据报包
            ds.send(dp);
        }


        //关闭发送端
        //void close():关闭数据报套接字
        ds.close();



    }
}
