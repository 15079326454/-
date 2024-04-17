package Reflection;

public class Test1 {
    Persion p = new Persion();
    Class clazz = p.getClass();

    Class c0 = Persion.class;//通过类名.class创建知道类的Class实例

    Class c1 = p.getClass();//通过一个类的实例对象的getClass()方法，获取对应实例对象的类的class 实例

    Class c2;

    {
        try {
            //通过Classd的静态方法forName(String className)来获取一个类的Class实例
//            forName(String className)方法中的参数是你要获取的Class实例的类的全路径（包名.类名
            c2 = Class.forName("Reflection.Persion");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
