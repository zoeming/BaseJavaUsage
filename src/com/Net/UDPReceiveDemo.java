package com.Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
UDP接收数据的步骤:
    - 创建接收端的Socket对象(DatagramSocket)
    - 创建一个数据包，用于接收数据
    - 调用DatagramSocket对象的方法接收数据
    - 解析数据包，并把数据在控制台显示
    - 关闭接收端

DatagramPacket(byte[] buf, int len):创建一个DatagramPacket用于接收长度为len的数据包
byte[]  getData():返回数据缓冲区
int  getLength():返回要发送的数据的长度或接收的数据的长度
 */
public class UDPReceiveDemo {
    public static void main(String[] args) throws IOException {
        //DatagramSocket(port):
        //创建接收端Socket对象
        DatagramSocket ds1 = new DatagramSocket(2333);

        while(true) {
            //DatagramPacket(byte[] buf, int len):创建一个DatagramPacket用于接收长度为len的数据包
            //创建接受数据包
            byte[] bt = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(bt, bt.length);

            //接受数据
            ds1.receive(dp1);

            //解析数据包
            byte[] bs = dp1.getData();
            System.out.println(new String(bs, 0, bs.length));
        }
//        //关闭接收端
//        ds1.close();

    }
}
