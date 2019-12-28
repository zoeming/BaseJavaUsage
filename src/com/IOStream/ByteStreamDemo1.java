package com.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
字节流写数据加入异常处理
 */
public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //加入finally来实现释放资源
        //初始化字节流对象
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("fos.txt");
            fos.write("hello".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos!=null)
                fos.close();
        }
    }
}
