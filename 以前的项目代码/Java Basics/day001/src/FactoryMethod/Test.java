package FactoryMethod;

public class Test {
    public static void main(String[] args) {
//        开发人员B的工作
        BWM b3 = new BWM3Factory().productBWM();
        b3.showInfo();
        BWM b5 = new BWM5Factory().productBWM();
        b5.showInfo();
        BWM b7 = new BWM7Factory().productBWM();
        b7.showInfo();
    }
}
