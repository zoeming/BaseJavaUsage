package com.Lambda.MethodReference;

/*
定义一个测试类(PrinterDemo)，在测试类中提供两个方法
- 一个方法是：usePrinter(Printer p)
- 一个方法是主方法，在主方法中调用usePrinter方法
 */
public class PrinterDemo {
    public static void main(String[] args) {

        //Lambda简化写法
        usePrinter(s -> System.out.println(s.toUpperCase()));

        //引用对象实例方法
        //引用对象的实例方法，其实就引用类中的成员方法
        //对象::成员方法
        PrintString ps = new PrintString();
        usePrinter(ps :: printUpper);

    }

    public static void usePrinter(Printer p){
        p.printUpperCase("lalala");

    }
}
