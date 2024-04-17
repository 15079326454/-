package DesignPatterns;

public class Test {
    public static void main(String[] args) {
//        Singleton s = Singleton.getInstance();

        Singleton1 s = Singleton1.getInstance();
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        Singleton1 s3 = Singleton1.getInstance();



    }
}
