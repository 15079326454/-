package ThreadTest;
import java.lang.Thread;
import java.lang.Runnable;
/**
 * 生产者与消费者
 */
public class ProductAndCustomer {
    public static void main(String[] args) {
        Clerk c = new Clerk();
//        消费时不生产，生产时不消费
//          生产者
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {//无限循环代表无限的生产次数
                        if (c.productNum == 0) {//产品数为0，开始生产
                            System.out.println("产品数为0，开始生产");
                            while (c.productNum < 4) {
                                c.productNum++;//增加商品
                                System.out.println("库存：" + c.productNum);
                            }
                            System.out.println("产品数为:" + c.productNum + "，结束生产");
                            c.notify();//唤醒消费者线程
                        }else {
                            try {
                                c.wait();//生产者线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "生产者").start();

//        消费者，
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {//无限循环代表无限的消费次数
                        if (c.productNum == 4) {//产品数为4，开始消费
                            System.out.println("产品数为4，开始消费");
                            while (c.productNum >0) {
                                c.productNum--;//减少产品
                                System.out.println("库存：" + c.productNum);
                            }
                            System.out.println("产品数为:" + c.productNum + "，结束消费");
                            c.notify();//唤醒生产者线程
                        }else {
                            try {
                                c.wait();//消费者线程等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "消费者").start();
    }
}
class Clerk {
    public int productNum = 0;
}