package com.Net;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
InetAddress：此类表示Internet协议（IP）地址
static InetAddress getByName(String host):确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
String getHostName():获取此IP地址的主机名
String getHostAddress():返回文本显示中的IP地址字符串
 */
public class NetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //static InetAddress getByName(String host):确定主机名称的IP地址。
        //输入可以是主机名或者IP地址都可，一般使用IP地址来获取
        InetAddress ip = InetAddress.getByName("192.168.1.115");
//        InetAddress ip = InetAddress.getByName("LAPTOP-09JG5ENJ");

        //String getHostName():获取此IP地址的主机名
        String s = ip.getHostName();
        System.out.println("主机名："+s);

        //String getHostAddress():返回文本显示中的IP地址字符串
        String s2 = ip.getHostAddress();
        System.out.println("IP地址："+s2);


    }
}
