package com.Modifier.PermissionModifier;

import com.Modifier.PermissionModifier.Fu;

// 同一个包内的类可以访问其他类中的public、protected和默认成员变量
// 不同包内的无关类只能访问public变量
// 不同包内的相关类可以访问public、protected变量
public class Other {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show4();
        f.show3();
        f.show2();

    }
}
