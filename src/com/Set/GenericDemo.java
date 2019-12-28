package com.Set;
/*
泛型的本质是参数化类型
将具体的数据类型参数化，在使用或调用的时候传入具体类型
存在泛型类、泛型方法和泛型接口
 */
public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.setT("林青霞");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());

        Generic g = new Generic();
        g.show("kk");
        g.show(24);

    }

    //泛型类
    public static class Generic<T> {
        private T t;

        public T getT() {
            return t;
        }

        //泛型方法
        public void setT(T t) {
            this.t = t;
        }

        //泛型方法
        public void show(T t){
            System.out.println(t);
        }
    }
}
