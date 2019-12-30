package com.Lambda;

/*
定义一个测试类(AddableDemo)，在测试类中提供两个方法
  - 一个方法是：useAddable(Addable a)
  - 一个方法是主方法，在主方法中调用useAddable方法
 */
public class AddableDemo {
    public static void main(String[] args) {
        //调用方法实现
        Addable a = new AddableImp();
        useAddable(a);

        //使用匿名内部类
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                return 2*x+y;
            }
        });

        //使用lambda
        useAddable((int x, int y) -> {
            return x+y;
        });

        //参数类型和return都可以省略，要省略全部省略，不能只省略一个参数的类型
        useAddable((x,y)->
            2*x+2*y
        );
    }

    private static void useAddable(Addable a){
        int sum = a.add(4,5);
        System.out.println(sum);
    }
}
/*
使用Lambda必须要有接口，并且要求接口中有且仅有一个抽象方法
必须有上下文环境，才能推导出Lambda对应的接口
 */
