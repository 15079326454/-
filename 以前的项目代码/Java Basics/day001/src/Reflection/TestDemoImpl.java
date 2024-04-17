package Reflection;

public class TestDemoImpl implements ITestDemo{
    @Override
    public void test1() {
        System.out.println("执行了 test1()方法");
    }

    @Override
    public void test2() {
        System.out.println("执行了 test2()方法");
    }
}
class Test3{
    public static void main(String[] args) {
            ITestDemo testDemo = new TestDemoImpl();
    }
}