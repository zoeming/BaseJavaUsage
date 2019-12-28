package com.Inherit;

public class Teacher extends Person{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setAge(34);
        t.name = "lihua";
        t.show();
        t.teach();
    }
    public void teach(){ System.out.println("teacher should teach"); }

    // 方法的重写
    // 子类中如果有和父类中相同（方法名和参数都相同）的方法，子类调用该方法时优先调用子类中定义的方法
    @Override // 检查方法重新声明的正确性
    public void show(){
        System.out.println("teacher "+name+","+this.getAge()+" years old.");
    }
}
