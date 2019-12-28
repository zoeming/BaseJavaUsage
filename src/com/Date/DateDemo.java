package com.Date;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        //public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time):设置时间，给的是毫秒值
        // System.currentTimeMillis()返回当前时间
//        long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);

        System.out.println(d);

        // 测试DateUtils中的方法
        // 将date转化为字符串
        String s1 = DateUtils.Date2String(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        // 将字符串转化为date
        String s = "2014-05-09 12:22:34";
        Date d1 = DateUtils.String2Date(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(d1.toString());

    }
}
