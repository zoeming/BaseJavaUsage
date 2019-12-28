package com.Thread;

/*
生产者类(Producer)：实现Runnable接口，重写run()方法，调用存储牛奶的操作
 */
public class Producer implements Runnable{
    Box b = new Box();

    public Producer() {
    }

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for(int i=1; i<=30; i++) {
            b.put(i);
        }
    }
}
