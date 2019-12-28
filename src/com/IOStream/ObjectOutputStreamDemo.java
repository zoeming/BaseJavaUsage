package com.IOStream;

import java.io.*;

/*
- 对象序列化介绍
  - 对象序列化：就是将对象保存到磁盘中，或者在网络中传输对象
  - 这种机制就是使用一个字节序列表示一个对象，该字节序列包含：对象的类型、对象的数据和对象中存储的属性等信息
  - 字节序列写到文件之后，相当于文件中持久保存了一个对象的信息
  - 反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化
- 对象序列化流： ObjectOutputStream
  - 将Java对象的原始数据类型和图形写入OutputStream。 可以使用ObjectInputStream读取（重构）对象。 可以通过使用流的文件来实现对象的持久存储。 如果流是网络套接字流，则可以在另一个主机上或另一个进程中重构对象
- 对象反序列化流： ObjectInputStream
  - ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象

 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象的序列化流
        //ObjectOutputStream(OutputStream out)：创建一个写入指定的OutputStream的ObjectOutputStream
        //创建ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));

        //创建学生对象
        Student2 s = new Student2("李红",30);

        //void writeObject(Object obj)：将指定的对象写入ObjectOutputStream
        //写入到对象中的序列化流是乱码，人很难读懂，需要对象的反序列化流读取
        oos.writeObject(s);

        //释放资源
        oos.close();


        //对象的反序列化流
        //ObjectInputStream(InputStream in)：创建从指定的InputStream读取的ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));

        //Object readObject()：从ObjectInputStream读取一个对象
        Object obj = ois.readObject();

        Student2 s1 = (Student2)obj;
        System.out.println(s1.getName()+","+s1.getAge());

        //释放资源
        ois.close();

    }
}
/*
序列化运行时与每个可序列化的类关联一个版本号，称为serialVersionUID，
它在反序列化过程中使用，以验证序列化对象的发送者和接收者是否加载了与序列化兼容的对象的类。
一个可序列化的类可以通过声明一个名为"serialVersionUID"的字段来显式地声明它自己的serialVersionUID，
该字段必须是static，final和long类型
- 用对象序列化流序列化了一个对象后，假如我们修改了对象所属的类文件，读取数据会不会出问题呢？
  - 会出问题，会抛出InvalidClassException异常
- 如果出问题了，如何解决呢？
  - 重新序列化
- 如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
  - 给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程

 */
