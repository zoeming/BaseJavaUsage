package com.Net;

import java.io.*;
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
public class TCPClientDemo {
    public static void main(String[] args) throws IOException {
        //创建一个客户端Socket对象
        //Socket​(String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
        Socket s = new Socket("192.168.1.115",2222);

        //获取输出流,键盘输入，886结束输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line=br.readLine())!=null){
            if("886".equals(line))
                break;

            //获取输出流对象
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        OutputStream os = s.getOutputStream();
//        os.write("hello".getBytes());


        //接受服务器反馈
        InputStream is = s.getInputStream();
        byte[] by = new byte[1024];
        int len = is.read(by);
        System.out.println(new String(by,0,len));

        //释放资源
        s.close();
    }
}
