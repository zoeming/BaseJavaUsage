package com.String;
/*
思路：
    1:已知用户名和密码，定义两个字符串表示即可
    2:键盘录入要登录的用户名和密码，用 Scanner 实现
    3:拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
    4:用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
 */
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        //已知用户名和密码，定义两个字符串表示即可
        String username = "itheima";
        String password = "czbk";

        //键盘录入要登录的用户名和密码，用 Scanner 实现
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户名：");
        String name = sc.nextLine();

        if (name.equals(username)) {
            //用循环实现多次机会，这里的次数明确，采用for循环实现，并在登录成功的时候，使用break结束循环
            for (int i = 0; i < 3; i++) {

                System.out.println("请输入密码：");
                String pwd = sc.nextLine();

                //拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，用equals() 方法实现
                if (pwd.equals(password)) {
                    System.out.println("登录成功");
                    break;
                } else {
                    if (2 - i == 0) {
                        System.out.println("你的账户被锁定，请与管理员联系");
                    } else {
                        //2,1,0
                        //i,0,1,2
                        System.out.println("登录失败，你还有" + (2 - i) + "次机会");
                    }
                }
            }
        }
        else
            System.out.println("请输入正确的用户名");
    }
}
