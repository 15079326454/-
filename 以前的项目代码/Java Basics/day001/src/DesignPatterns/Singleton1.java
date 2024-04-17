package DesignPatterns;

/**
 * 懒汉模式的单例模式
 */
public class Singleton1 {
//    先私有化构造方法,让外边不能直接new对象
    private  Singleton1(){}
private  static  Singleton1 s1 = null;

    public static Singleton1 getInstance(){
        if (s1==null){
            s1=new Singleton1();
        }
        return s1;
    }

}
