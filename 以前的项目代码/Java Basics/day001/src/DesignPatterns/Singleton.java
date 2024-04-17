package DesignPatterns;

/**
 * 饿汉模式的单例模式
 */
public class Singleton {
//    私有的构造，构造方法私有化，调用这个类的人就不能直接使用new来创建对象
    private Singleton(){

    }
//    私有的Singleton类型的变量
    private  static Singleton single = new Singleton();

    public static Singleton getInstance(){
        return single;
    }

}
