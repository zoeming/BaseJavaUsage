package com.Exception;
/*
throws抛出异常，但是处理异常还是需要try/catch
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        method2();
        System.out.println("结束");
    }

    //编译时异常
    public static void method2(){
        String s = "2018-06-25";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(d);
    }

    //运行时异常
    public static void method() throws ArrayIndexOutOfBoundsException{
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);

    }
}
