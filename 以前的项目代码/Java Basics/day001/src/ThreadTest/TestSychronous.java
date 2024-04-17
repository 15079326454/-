package ThreadTest;

public class TestSychronous {
    public static void main(String[] args) {
//定义账户对象
        Account a = new Account();
//        多线程对象
        User u_wei = new User(a, 2000);
        User u_zhiFuBao = new User(a, 2000);
        Thread wei = new Thread(u_wei, "微信");
        Thread zhiFuB = new Thread(u_zhiFuBao, "支付宝");
        wei.start();
        zhiFuB.start();
    }
}
class Account {
    public static int money = 3000;//数据共享的
    /**
     * 提款，判断账户余额够不够
     *
     * @param m
     */
    public synchronized void drawing(int m) {
        String name = Thread.currentThread().getName();
        if (money < m) {
            System.out.println(name + "操作，账户金额金额不足：" + money);
        } else {
            System.out.println(name + "操作，账户原有金额：" + money);
            System.out.println(name + "操作，取款金额：" + m);

            System.out.println(name+"操作，取款操作：原金额"+money+"-"+"取款金额"+m);
            money = money - m;
            System.out.println(name + "操作，账户余额：" + money);
        }
    }
}
class User implements Runnable {
    Account account;
    int money;

    public User(Account account, int money) {
        this.account = account;
        this.money = money;
    }
    @Override
    public void run() {
        account.drawing(money);
    }
}
