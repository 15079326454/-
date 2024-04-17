package JavaIO;

import FactoryMethod.Test;

import java.io.*;

/**
 * 序列化与反序列化
 * 注意：对象的序列化与反序列化，使用的类要严格一致，包名，类名，类的结构机制都必须一样
 */
public class TestPerson {
    public static void main(String[] args) {
        try {
//            TestPerson.testSerialize();
            TestPerson.testDeserialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 对象的序列化
     * ObjectOutputStream
     */
    public static void testSerialize() throws Exception {
        //定义对象的输出流，把对象的序列化之后的流放到指定的文件
        ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt7.txt"));
        Person p = new Person();
        p.name = "zhangsan";
        p.age = 23;
        oot.writeObject(p);
        oot.flush();
        oot.close();
    }

    /**
     * 对象的反序列化
     * ObjectInputStream
     */
    public static void testDeserialize() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\SSMS\\java\\Item\\Java Basics\\day001\\src\\JavaIO\\tt7.txt"));
        Object obj = ois.readObject();
        Person p = (Person) obj;
        System.out.println(p.name);
        System.out.println(p.age);
        ois.close();
    }
}

class Person implements Serializable {
    /**
     * 一个表示序列化版本标识符的静态变量
     * 用来表明类的不同版本间的兼容性
     */
    private static final long serialVersionUID = 1L;
    String name;
    int age;
}