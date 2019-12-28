package com.Modifier.PermissionModifier;

// 继承子类只能访问父类中的public、protected和默认成员变量
public class Zi extends Fu {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show2();
        z.show3();
        z.show4();
    }

}
