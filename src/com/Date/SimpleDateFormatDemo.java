package com.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
SimpleDateFormat是一个具体的类，用于以区域设置敏感的方式格式化和解析日期。
    格式化(从Date到String)
        public final String format(Date date)：将日期格式化成日期/时间字符串
    解析(从String到Date)
        public Date parse(String source)：从给定字符串的开始解析文本以生成日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // 格式化：从date到String
        Date d = new Date();

        // 默认的SimpleDateFormat格式不满足要求
//        SimpleDateFormat sdf = new SimpleDateFormat(); // 19-12-13 上午11:19
        // 定义一种日期模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s); // 2019年12月13日 11:25:09


        //从 String 到 Date
        String ss = "2048-08-09 11:11:11";
        //ParseException
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd); // Sun Aug 09 11:11:11 SGT 2048

    }

}
