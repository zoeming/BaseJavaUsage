package com.Net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
ServertSocket(int port):创建绑定到指定端口的服务器套接字
Socket accept():监听要连接到此的套接字并接受它

TCP接受数据的步骤：
    - 创建服务器端的Socket对象
    - 监听客户端连接，返回一个Socket对象
    - 获取输入流，读数据并显示到控制台
    - 释放资源
 */
public class TCPRecivedDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端Socket对象
        //ServertSocket(int port):创建绑定到指定端口的服务器套接字
        ServerSocket ss = new ServerSocket(33333);

        //获取输出流
        //Socket accept():监听要连接到此的套接字并接受它
        Socket s = ss.accept();

        //读数据并显示到控制台
        InputStream is = s.getInputStream();
        byte[] by = new byte[1024];
        int len = is.read(by);
        System.out.println(new String(by, 0, len));

        //释放资源
        ss.close();
        s.close();
    }
}
