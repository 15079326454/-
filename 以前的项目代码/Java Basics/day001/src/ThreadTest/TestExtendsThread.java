package ThreadTest;
import java.lang.Thread;
/**
 * 继承Thread类的方式实现多线程
 * @author 1by
 */
public class TestExtendsThread extends Thread {
    @Override
    public void run() {
        System.out.println("多线程运行的代码");
        for (int i=0;i<5;i++){
            System.out.println("这是多线程的逻辑代码："+i);
        }
    }
}
