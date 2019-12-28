package com.Net;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
- 案例需求
  客户端：发送数据，接受服务器反馈
  服务器：收到消息后给出反馈
- 案例分析
  - 客户端创建对象，使用输出流输出数据
  - 服务端创建对象，使用输入流接受数据
  - 服务端使用输出流给出反馈数据
  - 客户端使用输入流接受反馈数据

 */
public class TCPServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务端Socket对象
        ServerSocket ss = new ServerSocket(2222);

        //监听客户端连接，返回一个Socket对象
        Socket s = ss.accept();

        //读取数据
//            InputStream is = s.getInputStream();
//            InputStreamReader isr = new InputStreamReader(is);
//            BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

//            byte[] by = new byte[1024];
//            int len = is.read(by);
//            System.out.println(new String(by, 0, len));
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        //服务端输出反馈
        OutputStream os = s.getOutputStream();
        os.write("数据已收到".getBytes());

        //释放资源
//        ss.close();
//        s.close();
    }
}
