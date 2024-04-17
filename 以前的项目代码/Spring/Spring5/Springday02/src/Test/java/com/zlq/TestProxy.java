package com.zlq;

import com.zlq.Proxy.Entity.User;
import com.zlq.Proxy.Service.OrderService;
import com.zlq.Proxy.Service.ServiceImpl.OrderServiceProxy;
import com.zlq.Proxy.Service.ServiceImpl.UserServiceProxy;
import com.zlq.Proxy.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

public class TestProxy {
    /**
     * 用于测试：静态代理的代码
     */
    @Test
    public void testProxy(){
        UserService userService = new UserServiceProxy();
        userService.login("20201217","123");
        userService.register(new User());
        System.err.println("--------------------------");

        OrderService orderService = new OrderServiceProxy();
        orderService.showOrder();
    }

    /**
     * 用于测试：Spring的动态代理,UserService
     */
    @Test
    public void testDynamic01(){
       ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        boolean result = userService.login("密码","12333");
        System.err.println("result:"+result);

        userService.register(new User());
    }
    /**
     * 用于测试：Spring的动态代理,OrderService
     */
    @Test
    public void testDynamic02(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        OrderService orderService = (OrderService) ctx.getBean("orderService");
       orderService.showOrder();
    }

    @Test
    public void testAspect(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext1.xml");
       UserService userService = (UserService) ctx.getBean("userService");
//       userService.login("AOP","2312");

       userService.register(new User());
    }


}
