package com.zlq.Life;

import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product implements InitializingBean, DisposableBean {
//public class Product{
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Product.setName方法被调用");
        this.name = name;
    }

    public Product() {
        System.out.println("Product的对象已创建");
    }

    /**
     * 这个就是初始化方法afterPropertiesSet()：做一些初始化操作
     * Spring会进行调用
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Product调用了afterPropertiesSet()方法");
    }

    public void myInit() {
        System.out.println("普通的初始化方法myInit()被调用了");
    }

    /**
     * 销毁方法destroy()：销毁操作（资源释放）
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("Product调用了destroy()方法，进行资源释放");
    }
//    以下是自己定义的销毁方法
    public void myDestroy()throws Exception{
        System.out.println("Product调用了myDestroy()方法，资源释放");
    }


}
