package com.Thread;

/*
奶箱类(Box)：定义一个成员变量，表示第x瓶奶，提供存储牛奶和获取牛奶的操作
 */
public class Box {
    //定义奶箱里有多少奶
    private int milk;
    //定义奶箱状态（是否满了）
    private boolean state = false;
    //定义奶箱容量
    private int max = 10;

    //存储牛奶操作方法
    public synchronized void put(int milk){
        //奶箱是满的就停止送奶
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //奶箱还没满就继续送奶
        else{
            this.milk = this.milk+milk;
            if(this.milk >= max) {
                state = true;
                this.milk = max;
            }
            else
                state = false;

            System.out.println("奶箱中一共有"+this.milk+"瓶奶");
        }


        //唤醒其他等待的线程
        notifyAll();
    }

    //取奶的操作方法
    public synchronized void get(int milk){
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else{
            this.milk = this.milk - milk;
            System.out.println("奶箱中一共有"+this.milk+"瓶奶");

            if(this.milk == 0)
                state = false;
        }
        //唤醒其他等待的线程
        notifyAll();
    }

}
