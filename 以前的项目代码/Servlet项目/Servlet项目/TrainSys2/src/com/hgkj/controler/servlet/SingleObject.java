package com.hgkj.controler.servlet;

public class SingleObject {
    private static SingleObject instance=new SingleObject();
    private SingleObject(){}
    public  static synchronized SingleObject getInstance(){
        return  instance;
    }
    public  void  showMessage(){
        System.out.println("Hollo 单利模式");
    }
    public static class SingletonPatternDemo {
        public static  void  main(String[] args){
            SingleObject object = SingleObject.getInstance();
            object.showMessage();
        }
    }
}
