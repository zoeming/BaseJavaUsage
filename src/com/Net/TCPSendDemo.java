package com.Net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
Java为客户端提供了Socket类，为服务器端提供了ServerSocket类
Socket(InetAddress address,int port):创建流套接字并将其连接到指定IP指定端口号
Socket(String host, int port):创建流套接字并将其连接到指定主机上的指定端口号
InputStream  getInputStream():返回此套接字的输入流
OutputStream getOutputStream():返回此套接字的输出流

TCP发送数据流程：
    - 创建客户端Socket对象
    - 获取输出流，写数据
    - 释放资源
 */
public class TCPSendDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket(InetAddress.getByName("192.168.1.115"),33333);

        //获取输出流，写数据
        //OutputStream getOutputStream() 返回此套接字的输出流
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        //释放资源
        s.close();

    }
}
