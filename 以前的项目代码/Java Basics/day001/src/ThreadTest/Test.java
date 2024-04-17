package ThreadTest;

import java.lang.Thread;

public class Test {
    public static void main(String[] args) {
        Thread t0 = new TestExtendsThread();
        t0.start();//启动线程，开始运行run方法中的代码,这是异步
        System.out.println("---------------------1");
        System.out.println("---------------------2");
        System.out.println("---------------------3");
    }
}
