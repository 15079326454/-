package FactoryMethod;

/**
 * 宝马车的产品接口
 */
public interface BWM {
//    产品信息介绍
//    车的发动方式
    void showInfo();
}

/**
 * 构建具体的车的类
 */
class BWM3 implements BWM{

    @Override
    public void showInfo() {
        System.out.println("这是宝马3系车");
    }
}
class BWM5 implements BWM{

    @Override
    public void showInfo() {
        System.out.println("这是宝马5系车");
    }
}
class BWM7 implements BWM{

    @Override
    public void showInfo() {
        System.out.println("这是宝马7系车");
    }
}

