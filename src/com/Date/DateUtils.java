package com.Date;
/*
工具类：
构造方法私有
成员方法静态
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
定义一个日期工具类(DateUtils)，包含两个方法：
把日期转换为指定格式的字符串；
把字符串解析为指定格式的日期，
然后定义一个测试类(DateDemo)，测试日期工具类的方法
 */
public class DateUtils {
    private DateUtils() {}

    /*
        把日期转为指定格式的字符串
        返回值类型：String
        参数：Date date, String format
     */
    public static String Date2String(Date d, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(d);
        return s;
    }

    /*
        把字符串解析为指定格式的日期
        返回值类型：Date
        参数：String s, String format
     */
    public static Date String2Date(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }


}
