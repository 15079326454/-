package com.BeanFactory;

import com.zlq.BeanPost.Category;
import com.zlq.Converter.Student;
import com.zlq.Factorybean.ConnectionFactoryBean;
import com.zlq.Life.Product;
import com.zlq.Scope.Account;
import com.zlq.basic.Controller.BeenFactory;
import com.zlq.basic.Service.UserService;
import com.zlq.basic.entity.Person;
import com.zlq.basic.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.util.*;

public class TestSpring501 {
    /**
     * 用于测试：工厂类进行解耦合的操作
     */
    @Test
    public void test1() {
        UserService userService = (UserService) BeenFactory.getBean("userService");
        userService.login("name", "suns");
        User user = new User("suns", "123456");
        userService.register(user);
    }

    @Test
    public void test2() {
        Person person = (Person) BeenFactory.getBean("person");
        System.out.println("person:" + person);
    }

    /**
     * 用于测试sring的第一个程序
     */
    @Test
    public void test3() {
//        1.获得Spring的工厂
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
//        2.通过工厂类 获得 对象
        Person person = (Person) ctx.getBean("person");
        System.out.println("person:" + person);
    }

    /**
     * Spring从此提供的其他方法
     * 无需强转ctx.getBean("person", Person.class);
     */
    @Test
    public void test4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = ctx.getBean("person", Person.class);
        System.out.println("person:" + person);
    }

    /**
     * Spring从此提供的其他方法
     * 配置文件中，只能有一个<been class 是Person类型
     */
    @Test
    public void test5() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
//        当前Spring的配置文件中，只能有一个<been class 是Person类型
        /*Person person = ctx.getBean(Person.class);
        System.out.println("person:" + person);*/

//  beanDefinitnoNames: 获取的是spring工厂配置文件中所有bean标签的id值：person ，person1
       /* String[] beanDefinitnoNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitnoNames) {
            System.out.println(beanDefinitionName);
        }*/

//beanNamesForType:根据类型获得spring配置文件中对应的id值
       /* String[] beanNamesForType = ctx.getBeanNamesForType(Person.class);
        for (String id : beanNamesForType) {
            System.out.println("id:" + id);
        }*/

//  containsBeanDefinition:  用于判断是否存在指定id值的bean,但是不能判断name值
//        以下代码返回true，因为containsBeanDefinition可以判断id值
        if (ctx.containsBeanDefinition("person")) {
            System.out.println("true:" + true);
        } else {
            System.out.println("false:" + false);
        }
//        以下代码返回false，因为containsBeanDefinition不能判断name值，
        if (ctx.containsBeanDefinition("p")) {
            System.out.println("true:" + true);
        } else {
            System.out.println("false:" + false);
        }
        // containsBean:  用于判断是否存在指定id值的bean，可以判断name值
//        以下代码返回true，因为containsBean可以判断id值。
        /*if (ctx.containsBean("a")) {
            System.out.println("true:" + true);
        } else {
            System.out.println("false:" + false);
        }*/
//        以下代码返回true，因为containsBean可以判断name值
        /*if (ctx.containsBean("p")) {
            System.out.println("true:" + true);
        } else {
            System.out.println("false:" + false);
        }*/
    }

    /**
     * 用于测试spring工厂配置文件中，只配置class属性，没有配置id。
     */
    @Test
    public void test6() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
   /* Person person = ctx.getBean(Person.class);
    System.out.println("person:"+person);*/
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("beanDefinitionName" + beanDefinitionName);
        }
    }

    /**
     * 用于测试spring工厂配置文件中的name属性
     */
    @Test
    public void test7() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Object p = ctx.getBean("p1");
        System.out.println("p:" + p);
    }

    /**
     * 用于测试：配置文件进行赋值（注入）
     */
    @Test
    public void test8() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }

    /**
     * 用于测试：JDK类型成员的复制，例如数组，集合
     */
    @Test
    public void test9() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        String[] emails = person.getEmails();
        for (String email : emails) {
            System.out.println("emial:" + email);
        }
        System.out.println("------------------------------");
        Set<String> tels = person.getTels();
        for (String tel : tels) {
            System.out.println("tel:" + tel);
        }
        System.out.println("-----------------------------");
        List<String> address = person.getAddress();
        for (String address2 : address) {
            System.out.println("address:" + address2);
        }
        System.out.println("-----------------------------");
        Map<String, String> qqs = person.getQqs();
        Set<String> keys = qqs.keySet();
        for (String key : keys) {
            System.out.println("key" + key);
        }
        System.out.println("-----------------------------");
        Properties p = person.getP();
        System.out.println("key is key1 " + "value is " + p.getProperty("001"));
        System.out.println("key is key2 " + "value is " + p.getProperty("002"));
        System.out.println(person);
    }

    /**
     * 用于测试：用户自定义类型成员变量的赋值（注入）
     */
    @Test
    public void test10() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.register(new User("小米", "123123"));
        userService.login("张三", "123123");
    }

    /**
     * 用于测试：构造 （注入）
     */
    @Test
    public void test11() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Object customer = ctx.getBean("customer");
        System.out.println("person" + customer);
    }

    /**
     * 用于测试：FactoryBean接口
     */
    @Test
    public void test12() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        Connection conn2 = (Connection) ctx.getBean("conn");
        System.out.println("conn:" + conn);
        System.out.println("conn2:" + conn2);
    }

    @Test
    public void test13() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ConnectionFactoryBean conn = (ConnectionFactoryBean) ctx.getBean("&conn");
        System.out.println("conn:" + conn);
    }

    /**
     * 用于测试：实例工厂
     */
    @Test
    public void test14() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn:" + conn);
    }

    /**
     * 用于测试：静态工厂
     */
    @Test
    public void test15() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn:" + conn);
    }

    /**
     * 用于测试：控制简单对象的创建次数
     */
    @Test
    public void testScope01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Account account1 = (Account) ctx.getBean("Account");
        Account account2 = (Account) ctx.getBean("Account");
        System.out.println("account1:" + account1);
        System.out.println("account2:" + account2);
    }

    /**
     * 用于测试：生命周期
     */
    @Test
    public void testLife01() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Product product = (Product) ctx.getBean("product");
        ctx.close();
    }
    /**
     * 用于测试：配置文件参数化
     */
    @Test
    public void testDB() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext1.xml");
        Connection conn = (Connection) ctx.getBean("conn");
        System.out.println("conn:" + conn);
    }

    /**
     * 用于测试：自定义类型转换器
     */
    @Test
    public void testStudent01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        Student student = (Student) ctx.getBean("student");
        System.err.println("student:" + student.getBirthday());
    }
    /**
     * 用于测试：BeanPostProcessor的作用：对Spring工厂所创建的对象，进行再加工
     */
    @Test
    public void testCategory01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext3.xml");
        Category category = (Category) ctx.getBean("category");
        System.err.println("category:" + category.getName());
    }


}
