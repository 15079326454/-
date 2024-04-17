package ThreadTest;

/**
 * 通过实现Runnable接口的方式实现多线程
 */
public class TestRunnable implements Runnable {

    int count = 0;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");
        for (int i = 0; i < 5; i++) {
      /*      try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
//            if (i%2==0){
//                Thread.yield();//线程让步
//            }
            count++;
            System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码：" + count);
        }
    }
}

class TestR {
    public static void main(String[] args) {
        TestRunnable run0 = new TestRunnable();
        TestRunnable run1 = new TestRunnable();
        Thread t0 = new Thread(run0);

        Thread t1 = new Thread(run1);
//        t0.setPriority(1);//设置线程的优先级
//        t1.setPriority(10);
        t0.setName("线程t0");//设置线程的名称
        t1.setName("线程t1");
        t0.start();
        t1.start();

        /**
         * 优先级
         */
//        System.out.println("t0的优先级："+t0.getPriority());

        System.out.println(t0.getName());
        System.out.println(t1.getName());
        System.out.println("----------------------1");
        System.out.println("----------------------2");

        try {
            t0.join();//相当于在这块把t0的run的代码插入到这个位置执行
            /**
             * 专业说法：
             * 就是阻塞当前的main方法，先不执行后面的代码，
             * 先执行join进来的线程的代码
             * join的线程执行完毕之后继续执行之前main方法阻塞的代码
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("----------------------3");
        System.out.println(t1.isAlive());
        t1.stop();//强制停止此线程
        System.out.println(t1.isAlive());
    }
}

