package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) {
        try {
//            通过包名.类名的字符串，调用Class.forName方法获取指定类的Class实例
            Class clazz = Class.forName("Reflection.Students");

      /*     Class superClazz = clazz.getSuperclass();//获取父类
            System.out.println("父类是：" + superClazz.getName());
            Class[] interfaces = clazz.getInterfaces();//获取当前所有接口
            for (Class c : interfaces) {
                System.out.println("接口是：" + c.getName());
            }*/

            /**
             * 获取所有构造方法的信息
             */
 /*
            Constructor[] cons = clazz.getConstructors();//获取到类的公有的构造方法
            for (Constructor c : cons){
//                getName();------取得方法名称
                System.out.println("构造方法名称：" + c.getName());
//                getModifiers();-----取得修饰符。返回参数1：代表是public
                System.out.println("构造方法名称：" + c.getName()+"修饰符是：" + c.getModifiers());
                Class[] paramClazz = c.getParameterTypes();
                for (Class pc:paramClazz){
                    System.out.println("构造方法名称：" +c.getName()+"的参数类型是：" +pc.getName());
                }
            }*/
  /*          Constructor[] cos1 =clazz.getDeclaredConstructors();//获取类的所有构造方法，包括私有的。
            for (Constructor c : cos1){
                System.out.println("-----------------");
//                getName();------取得方法名称
                System.out.println("构造方法名称：" + c.getName());
//                getModifiers();-----取得修饰符，返回参数2：代表是private
                System.out.println("构造方法名称：" + c.getName()+"修饰符是：" + c.getModifiers());
                Class[] paramClazz = c.getParameterTypes();
                for (Class pc:paramClazz){
                    System.out.println("构造方法名称：" +c.getName()+"的参数类型是：" +pc.getName());
                }
                System.out.println("-----------------");
            }*/

//            Method[] ms = clazz.getMethods();//获取到类的所有公有的方法


            /**
             * 获取所有方法的信息
             */
  /*
 Method[] ms = clazz.getDeclaredMethods();
            for (Method m : ms) {
                System.out.println("方法名：" + m.getName());
                System.out.println("返回值类型：" + m.getReturnType());
                System.out.println("修饰符：" + m.getModifiers());

                Class[] pcs = m.getParameterTypes();//获取方法的参数类型，是一个数组，方法有几个参数，数组就有几个元素
                if (pcs != null && pcs.length > 0) {
                    for (Class c : pcs) {
                        System.out.println("参数类型"+c.getClass());
                    }
                }
                System.out.println("============================");
            }*/

            /**
             * 获取所有属性的信息
             */
/*

//            Field[] fd = clazz.getFields();//获取类的公有的属性
            Field[] fd = clazz.getDeclaredFields();//获取所有的属性，包括私有的
            for (Field f : fd) {
                System.out.println("属性的名称是：" + f.getName());
                System.out.println("属性的修饰符是：" + f.getModifiers());
                System.out.println("属性的类型是：" + f.getType());
            }

            Package pk = clazz.getPackage();//获取类所在的包
            System.out.println(pk.getName());
*/

            /**
             * 注意：下面不论是反射调用setInfo还是test
             * 都调用的obj对象的方法，obj对象实际上就是student对象
             */
//            得到名称叫setInfo，参数是String，String的方法
          Constructor con= clazz.getConstructor();//获取无参构造
          Object obj = con.newInstance();//使用无参构造创建对象
         Method md= clazz.getMethod("setInfo",String.class,String.class);
         md.invoke(obj,"zhangsan","第一中学");//参数1是需要实例化的对象，参数2是调用当前的方法时间参数

            Method m1 = clazz.getDeclaredMethod("test", String.class);
            m1.setAccessible(true);//接触私有的封装，下面可以强制调用私有的方法
            m1.invoke(obj,"李四");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Students extends Persion implements Move, Study {
    public String school;
    private String privateField;

    public Students() {
    }

    public Students(String school) {
        this.school = school;
    }

    private Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("学校是：" + this.school);
    }

    @Override
    public void moveType() {
        System.out.println("学习的中学知识");
    }

    @Override
    public void studyInfo() {
        System.out.println("骑自行车上学");
    }

    private void test(String name) {
        System.out.println("这是私有方法private void test(String name)");
    }

    public String getSchool() {
        return this.school;
    }

    public void setInfo(String name, String school) {
        this.name = name;
        this.school = school;
        System.out.println("这是setInfo方法");
    }

}

interface Move {
    void moveType();
}

interface Study {
    void studyInfo();
}
