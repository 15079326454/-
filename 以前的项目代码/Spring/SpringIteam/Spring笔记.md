## 1、Spring

#### 1.1简介

- spring：春天------->给软件行业带来了春天！
- 2002，首次推出了Spring框架的雏形：interface21框架！
- Spring框架即以interface21框架为基础，经过重新设计，并不断丰富其内涵，与2004年3月24号发布1.0正式版本
- **Rod Johnson**，Spring Framework创始人，著名作者。很难想象Rod Johnson的学历，真的让好多人大吃一惊，他是[悉尼大学](https://baike.baidu.com/item/悉尼大学)的博士，然而他的专业不是计算机，而是音乐学
- spring的理念：使现有的技术更加容易使用，本身是一个大杂烩，整合了现有的技术框架！
- SSH：Struct2+Spring+Hibernate！
- SSM：Spring+SpringMVC+MayBatis!

官网：https://spring.io/projects/spring-framework#overview

官方下载地址：官方下载地址：https://repo.spring.io/release/org/springframework/spring/

GitHub：https://github.com/spring-projects/spring-framework/releases

需要入的包：

```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.2.9.RELEASE</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.2.9.RELEASE</version>
</dependency>

```

#### 1.2、优点

- Spring是一个开源的免费的框架（容器）
- Spring是一个轻量级的，非入侵式的框架
- 控制反转（IOC), 面向切面变成（AOP）
- 支持事务的处理，对框架整合的支持

==总结一句话：Spring是一个轻量级的控制反转（IOC）和面向切面变成（AOP）的框架！==

#### 1.3、组成

![img](https://bkimg.cdn.bcebos.com/pic/6159252dd42a2834a59fbbf551b5c9ea15cebf17?x-bce-process=image/watermark,image_d2F0ZXIvYmFpa2U4MA==,g_7,xp_5,yp_5)

组成 Spring 框架的每个模块（或组件）都可以单独存在，或者与其他一个或多个模块联合实现。每个模块的功能如下：

- **核心容器**：核心容器提供 Spring 框架的基本功能。核心容器的主要组件是 BeanFactory，它是工厂模式的实现。BeanFactory 使用*控制反转*（IOC） 模式将应用程序的配置和依赖性规范与实际的应用程序代码分开。
- **Spring 上下文**：Spring 上下文是一个配置文件，向 Spring 框架提供上下文信息。Spring 上下文包括企业服务，例如 JNDI、EJB、电子邮件、国际化、校验和调度功能。
- **Spring AOP**：通过配置管理特性，Spring AOP 模块直接将面向切面的编程功能 , 集成到了 Spring 框架中。所以，可以很容易地使 Spring 框架管理任何支持 AOP的对象。Spring AOP 模块为基于 Spring 的应用程序中的对象提供了事务管理服务。通过使用 Spring AOP，不用依赖组件，就可以将声明性事务管理集成到应用程序中。
- **Spring DAO**：JDBC DAO 抽象层提供了有意义的异常层次结构，可用该结构来管理异常处理和不同数据库供应商抛出的错误消息。异常层次结构简化了错误处理，并且极大地降低了需要编写的异常代码数量（例如打开和关闭连接）。Spring DAO 的面向 JDBC 的异常遵从通用的 DAO 异常层次结构。
- **Spring ORM**：Spring 框架插入了若干个 ORM 框架，从而提供了 ORM 的对象关系工具，其中包括 JDO、Hibernate 和 iBatis SQL Map。所有这些都遵从 Spring 的通用事务和 DAO 异常层次结构。
- **Spring Web 模块**：Web 上下文模块建立在应用程序上下文模块之上，为基于 Web 的应用程序提供了上下文。所以，Spring 框架支持与 Jakarta Struts 的集成。Web 模块还简化了处理多部分请求以及将请求参数绑定到域对象的工作。
- **Spring MVC 框架**：MVC 框架是一个全功能的构建 Web 应用程序的 MVC 实现。通过策略接口，MVC 框架变成为高度可配置的，MVC 容纳了大量视图技术，其中包括 JSP、Velocity、Tiles、iText 和 POI。

#### 1.4、Spring Boot与Spring Cloud

- Spring Boot 是 Spring 的一套快速配置脚手架，可以基于Spring Boot 快速开发单个微服务;
- Spring Cloud是基于Spring Boot实现的；
- Spring Boot专注于快速、方便集成的单个微服务个体，Spring Cloud关注全局的服务治理框架；
- Spring Boot使用了约束优于配置的理念，很多集成方案已经帮你选择好了，能不配置就不配置 , Spring Cloud很大的一部分是基于Spring Boot来实现，Spring Boot可以离开Spring Cloud独立使用开发项目，但是Spring Cloud离不开Spring Boot，属于依赖的关系。
- SpringBoot在SpringClound中起到了承上启下的作用，如果你要学习SpringCloud必须要学习SpringBoot。

![图片](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7KtDiaOqFy5ourlJ8FTVV2FFH5GFXM4YPUGrmA2JdpPic3FwYaI1JZHBZxibaUJVXWzzTFeCayk4XAIg/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

spring弊端：发展了太久后，违背了原来的理念！配置十分繁琐，人称：“配置地狱”

## 2、IOC理论推导

1. UserDao接口
2. UserDaoImpl实现类
3. UserService业务接口
4. UserServiceImpl业务实现类

在我们之前的业务中，用户的需求可能会影响我们原来的代码，我们需要根据用户的需求去修改源代码！



我们使用一个set接口实现

```java
    private UserDao userDao;

    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
```

- 之前，程序是主动创建对象！控制权在程序员手上
- 使用set注入后，程序不再具有主动性，而是变成了被动的接受对象



这种思想，从本质上解决了问题，我们程序猿不用再去管理对象的创建了，系统的耦合性大大减低，可以更加专注在业务的实现上！这是IOC的原型！

#### 3、IOC的本质

**控制反转IOC(Inversion of Control)，是一种设计思想，DI(依赖注入)是实现IoC的一种方法**，也有人认为DI只是IoC的另一种说法。没有IoC的程序中 , 我们使用面向对象编程 , 对象的创建与对象间的依赖关系完全硬编码在程序中，对象的创建由程序自己控制，控制反转后将对象的创建转移给第三方，个人认为所谓控制反转就是：获得依赖对象的方式反转了。

![图片](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7KtDiaOqFy5ourlJ8FTVV2FFuYibmavlBHq9e4cDqiclpYSG8VT4EicVsnqKp65yJKQeNibsVdTiahQibJSg/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

Spring容器在初始化时先读取配置文件，根据配置文件或元数据创建与组织对象存入容器中，程序使用时再从Ioc容器中取出需要的对象。

![container magic](https://docs.spring.io/spring-framework/docs/current/reference/html/images/container-magic.png)

采用XML方式配置Bean的时候，Bean的定义信息是和实现分离的，而采用注解的方式可以把两者合为一体，Bean的定义信息直接以注解的形式定义在实现类中，从而达到了零配置的目的。

**控制反转是一种通过描述（XML或注解）并通过第三方去生产或获取特定对象的方式。在Spring中实现控制反转的是IoC容器，其实现方法是依赖注入（Dependency Injection,DI）。**



## 3、Hello Spring

#### 导入Jar包

注 : spring 需要导入commons-logging进行日志记录 . 我们利用maven , 他会自动下载对应的依赖项 .

```xml
   <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.9.RELEASE</version>
        </dependency>
```

#### 编写代码

1、编写一个Hello实体类

```java
package com.zlq.model.entity;

public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}

```

2、编写我们的spring文件 , 这里我们命名为ApplicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <!--使用spring来创建对象，在spring中这些都成为bean-->
    <bean id="hello" class="com.zlq.model.entity.Hello">
        <property name="name" value="Spring"/>
    </bean>
</beans>
```

3、我们可以去进行测试了 .

```java
 @Test
    public void test01(){
//        获取spring的伤心问对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//对象现在都在spring中管理，要用之久去里面取出来就可以
        Hello hello = (Hello) context.getBean("hello");
        System.err.println(hello.toString());
    }
```

#### 思考
- Hello 对象是谁创建的 ?  【hello 对象是由Spring创建的
- Hello 对象的属性是怎么设置的 ?  hello 对象的属性是由Spring容器设置的

这个过程就叫控制反转 :

- 控制 : 谁来控制对象的创建 , 传统应用程序的对象是由程序本身控制创建的 , 使用Spring后 , 对象是由Spring来创建的
- 反转 : 程序本身不创建对象 , 而变成被动的接收对象 .

依赖注入 : 就是利用set方法来进行注入的.

==IOC是一种编程思想，由主动的编程变成被动的接收==

可以通过newClassPathXmlApplicationContext去浏览一下底层源码 .



#### 修改案例一

我们在案例一中， 新增一个Spring配置文件ApplicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
<bean id="mysqlImpl" class="com.zlq.model.dao.Impl.MySqlDaoImpl"/>
    <bean id="userDaoImpl" class="com.zlq.model.dao.Impl.UserDaoImpl"/>
    <bean id="userServiceImpl" class="com.zlq.model.service.Impl.UserServiceImpl">
  <!--注意: 这里的name并不是属性 , 而是set方法后面的那部分 , 首字母小写-->
  <!--引用另外一个bean , 不是用value 而是用 ref-->
        <property name="userDao" ref="userDaoImpl"/>
    </bean>
</beans>
```

#### 测试！

```java
public class MyTest {
    public static void main(String[] args) {
//        获取ApplicationContext；拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        容器在手，需要什么，就直接get什么！
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
```

**OK , 到了现在 , 我们彻底不用再程序中去改动了 , 要实现不同的操作 , 只需要在xml配置文件中进行修改 , 所谓的IoC,一句话搞定 : 对象由Spring 来创建 , 管理 , 装配 !** 



## 4、IOC创建对象的方式

#### 1.使用无惨构造方法来创建

- User.java

```java
public class User {
    private String name;

    public User() {
        System.err.println("User的无惨构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.err.println("name=" + name);
    }
}
```

- applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="user" class="com.zlq.model.entity.User">
        <property name="name" value="可比克"/>
    </bean>
</beans>
```

- 测试类

```java
 @Test
    public void noConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();

    }
```

==结果可以发现，在调用show方法之前，User对象已经通过无参构造初始化了！==

#### 2.有参构造方法来创建

- User.java

```java
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.err.println("name=" + name);
    }
}
```

- applicationContext.xml有三种编写方式

```xml
<!--2.有参构造方法创建对象：
   01构造函数参数索引：使用下标的方式，index-->
<bean id="user" class="com.zlq.model.entity.User">
  <!-- index指构造方法 , 下标从0开始 -->
    <constructor-arg  index="0" value="狂神说java"/>
</bean>
```

```xml
<!--02.构造函数参数类型匹配,不建议使用-->
<bean id="user" class="com.zlq.model.entity.User">
    <constructor-arg type="java.lang.String" value="通过有参类型"/>
</bean>
```

```xml
<!--03.直接通过参数名来设置-->
    <bean id="user" class="com.zlq.model.entity.User">
        <constructor-arg name="name" value="直接通过参数名"/>
    </bean>
```

- 测试类

```java
    @Test
    public void noConstructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
```

==结论：在配置文件加载的时候。其中管理的对象都已经初始化了！==

## 5、Spring配置

#### 5.1、别名

alias 设置别名 , 为bean设置别名 , 可以设置多个别名

```xml
<!--设置别名：在获取Bean的时候可以使用别名获取-->
<alias name="user" alias="userNew"/>
```

#### 5.2、Bean的配置

```xml
<!--bean就是java对象,由Spring创建和管理-->

<!--
   id 是bean的标识符,要唯一,如果没有配置id,name就是默认标识符
   如果配置id,又配置了name,那么name是别名
   name可以设置多个别名,可以用逗号,分号,空格隔开
   如果不配置id和name,可以根据applicationContext.getBean(.class)获取对象;

class是bean的全限定名=包名+类名
-->
  <bean id="userT" class="com.zlq.model.entity.UserT" name="user2 u3,u4">
        <property name="name" value="ks"/>
    </bean>
```

#### 5.3、Import

团队的合作通过import来实现 .

```xml
<import resource="{path}/beans.xml"/>
```



## 6、依赖注入

#### 6.1、构造器注入

在4中已说过

#### 6.2、Set方式注入【重点】

- 依赖注入：Set注入！
  - 依赖：指Bean对象的创建依赖于容器 . Bean对象的依赖资源 .
  - 注入：指Bean对象所依赖的资源 , 由容器来设置和装配 

【环境搭建】

1. 复杂类型

   ```java
   public class Address {
       private String address;
   
       public String getAddress() {
           return address;
       }
   
       public void setAddress(String address) {
           this.address = address;
       }
   }
   ```

   

2. 真实测试对象

```java
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> hobbys;
    private Map<String, String> cards;
    private Set<String> games;
    private String wife;
    private Properties info;
  
  public void show() {
        System.out.print("name=" + name
                + ",address=" + address.getAddress()
                + "\n" + "books="
        );
        for (String book : books) {
            System.out.print("<<" + book + ">>\t");
        }
        System.out.println("\n爱好:" + hobbys);

        System.out.println("cards:" + cards);

        System.out.println("games:" + games);

        System.out.println("wife:" + wife);

        System.out.println("info:" + info);

    }
}
```

3. bean.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="student" class="com.zlq.model.entity.Student">
        <!--1、第一种：普通值注入，value-->
        <property name="name" value="乐高"/>
    </bean>
</beans>
```

4. 测试类

```java
    @Test
public void Test01(){
      ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = (Student) context.getBean("student");
        System.err.println(student.getName());
    }
```

完善注入信息：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
  
    <bean id="address" class="com.zlq.model.entity.Address">
        <property name="address" value="南京"/>
    </bean>

    <bean id="student" class="com.zlq.model.entity.Student">
        <!--1、第一种：普通值注入，value-->
        <property name="name" value="乐高"/>
        <!--2、第二种：Bean注入，ref-->
        <property name="address" ref="address"/>
        <!--3、第三种：数组注入，ref-->
        <property name="books">
            <array>
                <value>红楼梦</value>
                <value>西游记</value>
                <value>三国演义</value>
                <value>水浒传</value>
            </array>
        </property>
        <!--4、第四种：List注入，ref-->
        <property name="hobbys">
            <list>
                <value>听歌</value>
                <value>看电影</value>
                <value>玩游戏</value>
            </list>
        </property>
        <!--5、第五种：Map注入，ref-->
        <property name="cards">
            <map>
                <entry key="身份证" value="356245698756235556"/>
                <entry key="银行卡" value="568232565566899633"/>
            </map>
        </property>
        <!--6、第六种：Set注入，ref-->
        <property name="games">
            <set>
                <value>和平精英</value>
                <value>LOL</value>
            </set>
        </property>
        <!--7、第七种：null注入，ref-->
        <property name="wife">
            <null></null>
        </property>
        <!--8、第八种：注入，ref-->
        <property name="info">
            <props>
                <prop key="学号">001</prop>
                <prop key="性别">男</prop>
            </props>
        </property>
    </bean>


</beans>
```

#### 6.3、扩展方式注入

- p:命名空间和c:命名空间

官方解释：

![image-20210122144613967](C:\Users\admin\AppData\Roaming\Typora\typora-user-images\image-20210122144613967.png)

1. 使用：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--p命名空间注入，可以直接注入属性值-->
    <bean id="user" class="com.zlq.model.entity.User" p:name="牛奶" p:age="23"/>
    <!--c命名空间注入，可以通过构造器注入，construct-args-->
    <bean id="user2" class="com.zlq.model.entity.User" c:name="c命名空间" c:age="123"/>
</beans>
```

2. 测试

```java
    @Test
    public void testUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
//        p:命名空间
//        User user = context.getBean("user",User.class);
//        c:命名空间
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }
```

注意：==p命名空间和c命名空间不能直接使用，需要导入xml约束！==

```xml
xmlns:p="http://www.springframework.org/schema/p"
xmlns:c="http://www.springframework.org/schema/c"
```

6.4、Bean的作用域

![image-20210122145123473](C:\Users\admin\AppData\Roaming\Typora\typora-user-images\image-20210122145123473.png)

1. 单例模式singleton（spring的默认机制）

```xml
    <bean id="user2" class="com.zlq.model.entity.User" c:name="c命名空间" c:age="123" scope="singleton"/>
```

2. 原型模式(prototype):每次从容器中get的时候，都会产生一个新对象！

```xml
<bean id="accountService" class="com.something.DefaultAccountService" scope="prototype"/>
```

3. 其他的request`，`session`，`application，这些个只能在web开发中使用到！

## 7、Bean的自动装配

- 自动装配是Spring满足bean依赖的一种方式！
- Spring会在上下文中自动寻找，并自动给bean装配属性

三种方式：

1. 在xml中显示配置
2. 在java中显示配置
3. 隐式的自动装配bean（配置）

#### 7.1、测试

1. 环境搭建，一个人有两个宠物

#### 7.2、byName自动装配

```xml
    <bean id="cat" class="com.zlq.model.entity.Cat"/>
    <bean id="dog" class="com.zlq.model.entity.Dog"/>
<!--    byName：会自动在容器上下文中查找，和自己对象Set方法后面的值对应的bean id-->
    <bean id="people" class="com.zlq.model.entity.People" autowire="byName">
        <property name="name" value="小明"/>
    </bean>
```

#### 7.3、byType自动装配

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="cat" class="com.zlq.model.entity.Cat"/>
    <bean id="dog1" class="com.zlq.model.entity.Dog"/>
    <!--    byName：会自动在容器上下文中查找，和自己对象Set方法后面的值对应的bean id-->
    <!--    byType：会自动在容器上下文中查找，和自己对象属性类型相同的bean-->
    <bean id="people" class="com.zlq.model.entity.People" autowire="byType">
        <property name="name" value="小明"/>
    </bean>

</beans>
```

==小结:==

1. byName：需要保证所有bean的id唯一，并且这个bean需要和自动注入的属性的set方法的值一致！
2. byType：需要保证所有bean的class唯一，并且这个bean需要和自动注入的属性的类型一致！

#### 7.4、使用注解实现自动装配

1. 使用注解须知：
   - 导入约束：context
   - ==配置注解的支持：<context:annotation-config/>==

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>

</beans>
```

#### `@Autowired`

- 直接 属性上使用即可！可以在set方式上使用！
- 使用Autowired后，我么可以不编写set方法，前提是自动装配的属性在IOC（spring）容器中存在，且符合名字byname!

#### `科普`

```markdown
@Nullable  字段标记了这个注解，说明这个字段可以为null
```

```java
public @interface Autowired {
    boolean required() default true;
}
```

@Autowired(required=false)  说明：false，对象可以为null；true，对象必须存对象，不能为null。

```java
//如果允许对象为null，设置required = false,默认为true
@Autowired(required = false)
private Cat cat;
```

#### @Qualifier

- @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
- @Qualifier不能单独使用。

测试实验步骤：

1、配置文件修改内容，保证类型存在对象。且名字不为类的默认名字！

```xml
<bean id="dog1" class="com.zlq.model.entity.Dog"/>
<bean id="dog2" class="com.zlq.model.entity.Dog"/>
<bean id="cat1" class="com.zlq.model.entity.Cat"/>
<bean id="cat2" class="com.zlq.model.entity.Cat"/>
```

2、没有加Qualifier测试，直接报错

3、在属性上添加Qualifier注解

```java
@Autowired
@Qualifier(value = "cat2")
private Cat cat;
@Autowired
@Qualifier(value = "dog2")
private Dog dog;
```

测试，成功输出！

#### @Resource

- @Resource如有指定的name属性，先按该属性进行byName方式查找装配；
- 其次再进行默认的byName方式进行装配；
- 如果以上都不成功，则按byType的方式自动装配。
- 都不成功，则报异常。

实体类：

```java
public class User {
    //如果允许对象为null，设置required = false,默认为true
    @Resource(name = "cat2")
    private Cat cat;
    @Resource
    private Dog dog;
    private String str;
}
```

beans.xml

```xml
<bean id="dog" class="com.kuang.pojo.Dog"/>
<bean id="cat1" class="com.kuang.pojo.Cat"/>
<bean id="cat2" class="com.kuang.pojo.Cat"/>

<bean id="user" class="com.kuang.pojo.User"/>
```

测试：结果OK

配置文件2：beans.xml ， 删掉cat2

```xml
<bean id="dog" class="com.kuang.pojo.Dog"/>
<bean id="cat1" class="com.kuang.pojo.Caxt"/>
```

实体类上只保留注解

```java
@Resource
private Cat cat;
@Resource
private Dog dog;
```

结果：OK

结论：先进行byName查找，失败；再进行byType查找，成功。

### ==小结==

@Autowired与@Resource异同：

1、@Autowired与@Resource都可以用来装配bean。都可以写在字段上，或写在setter方法上。

2、@Autowired默认通过byType装配（属于spring规范），默认情况下必须要求依赖对象必须存在，如果要允许null 值，可以设置它的required属性为false，如：@Autowired(required=false) ，如果我们想使用名称装配可以结合@Qualifier注解进行使用

3、@Resource（属于J2EE复返），默认按照名称进行装配，名称可以通过name属性进行指定。如果没有指定name属性，当注解写在字段上时，默认取字段名进行按照名称查找，如果注解写在setter方法上默认取属性名进行装配。当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。

它们的作用相同都是用注解方式注入对象，但执行顺序不同。@Autowired先byType，@Resource先byName。

4、都是用来自动装配的

## 8、使用注解开发

1. bean

   在spring4之后，要使用注解开发，必须要保证aop的包导入了

   使用注解开发需要导入context约束，增加注解的支持

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
           https://www.springframework.org/schema/beans/spring-beans.xsd
           http://www.springframework.org/schema/context
           https://www.springframework.org/schema/context/spring-context.xsd">
   
       <context:annotation-config/>
   
   </beans>
   ```

   bean:

   - ```java
     //等价与：<bean id="user" class="com.zlq.model.entity.User"/>
     @Component //组件
     public class User {
         public String name="kek";
     
     }
     ```

2. 属性如何注入

   ```java
   //等价与：<bean id="user" class="com.zlq.model.entity.User"/>
   @Component //组件
   public class User {
   //相当于：<property name="name" value="凝练"/>
       @Value("凝练")
       public String name;
   }
   ```

3. 衍生的注解

   @Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层

   - dao[@Repository]
   - service[@Service]
   - controller[@Controller]

   ==注==：这个四个注解功能是一样的，都代表将某个类注册到spring中，装配bean

4. 自动装配置

   ```markdown
   @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
   @Qualifier不能单独使用。
    @Nullable  字段标记了这个注解，说明这个字段可以为null
    @Resource:自动装配通过名字，类型
   ```

5. 作用域

   ```java
   @Component //组件
   //singleton:单例；   prototype:原型模式
   @Scope("singleton")
   public class User {
   //相当于：<property name="name" value="凝练"/>
       @Value("凝练")
       public String name;
   }
   ```

   

6. 小结

xml与注解：

- xml更加万能，适用于任何场合！维护简单方便
- 注解不是自己类使用不了，维护相对复杂

最佳实践：

- xml用来管理bean

- 注解复杂完成属性的注入

- 我们使用的过程中，只需要注意一个问题：必须让注解生效，就必须开启注解的支持

  ```xml
     <!--    指定要扫描的包，这个包下的注解就会生效-->
      <context:component-scan base-package="com.zlq"/>
      <context:annotation-config/>
  ```

## 9、使用Java的方式配置spring

我们现在要完全不使用spring的xml配置了，全权交给Java来做

JavaConfig是Spring的一个子项目，在Spring4之后，它成为了一个核心功能

![image-20210126160404814](C:\Users\admin\AppData\Roaming\Typora\typora-user-images\image-20210126160404814.png)

实体类：

```java
//说明这个类被spring接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("javaConfig")  //注入属性值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

配置类：

```java
import com.zlq.model.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
//这个也归spring容器托管，注册到容器中，因为他本来就是一个@Component
//@Configuration：代表一个配置类，和之前的bean.xml是一样的
@Configuration
@ComponentScan("com.zlq.model")
@Import(UserConfig2.class)
public class UserConfig {
    //    注册一个bean，就相当于我们之前写的一个bean标签
//    这个方法的名字,就相当于bean标签中的id属性
//    方法的返回值,就相当于bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();  //就是返回要注入到bean的对象
    }
}
```

测试类：

```java
    @Test
    public void Test01() {
//        如果完全使用了配置类方式做，我们就只能通过ApplicationContext上下文来获取容器，
//        通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
```

## 10、AOP(代理模式)

为什么要学习代理模式？因为这就是SpringAOP的底层！【SpringAOP和SpringMVC】

代理模式的分类：

- 静态代理
- 动态代理

![image-20210126212715476](/Users/apple/Library/Application Support/typora-user-images/image-20210126212715476.png)

#### 10.1、静态代理

角色分析：

- 抽象角色：一般会使用接口或者抽象类来解决
- 真实角色：被代理的角色
- 代理角色：代理真实角色，代理真实角色后，我们一般会做一些附属操作
- 客户：访问代理对象的人！

代码步骤：

1. 接口

   ```java
   //租房
   public interface Rent {
       public  void rent();
   }
   ```

2. 真实角色

   ```java
   //房东
   public class Host implements Rent{
       @Override
       public void rent() {
           System.err.println("房东要出租房子");
       }
   }
   
   ```

3. 代理角色

   ```java
   public class Proxy implements Rent {
       private Host host;
   
       public Proxy() {
       }
   
       public Proxy(Host host) {
           this.host = host;
       }
   
       @Override
       public void rent() {
           seeHost();
           host.rent();
           heTong();
           fare();
       }
   
       //    看房
       public void seeHost() {
           System.out.println("中介带你看房");
       }
   
       public void heTong() {
           System.out.println("签合同");
       }
   
       public void fare() {
           System.out.println("收中介费");
       }
   }
   ```

4. 客户端访问代理角色  

```java
public class Client {
    public static void main(String[] args) {
//        房东要租房子
        Host host=new Host();
//       代理，中介帮房东租房子，但是呢，代理角色一般有一些附属操作
        Proxy proxy = new Proxy(host);
//        你不用面对房东，直接招中介租房子即可！
        proxy.rent();
    }
}
```

代理模式的好处：

1. 可以使真实角色的操作很假纯粹！不用去关注一些公共的业务
2. 公共业务就交给了代理角色！实现了业务的分工
3. 公共业务发生扩展的时候，方便集中管理！

缺点：

1. 一个真实角色就会产生一个代理角色；代码会翻倍，开发效率较低

#### 10.2加深理解

![image-20210126222437110](/Users/apple/Library/Application Support/typora-user-images/image-20210126222437110.png)

#### 10.3、动态代理

- 动态代理和静态代理角色一样
- 动态代理的代理类是动态生成的，不是我们直接写好的
- 动态代理分为两大类：基于接口的，基于类的动态代理
  - 基于接口---- JDK动态代理【我们在这里使用】
  - 基于类：cglib
  - Java字节码实现：javassist

需要了解两个类：Proxy【代理】，InvocationHandler【调用处理程序】



动态代理的好处：

- 可以使真实角色的操作更加纯粹，不用去关注一些公共的业务
- 公共业务就交给代理角色！实现了业务分工！
- 公共业务发生扩展的时候，方便集中管理
- 一个动态代理类代理的是一个接口，一般就是对应的一类业务
- 一个动态代理类可以代理多个类，只要是实现了同一个接口即可



## 11、AOP

#### 11.1、什么是AOP

AOP(Aspect Oriented Programming)的缩写，意为：[面向切面编程](https://baike.baidu.com/item/面向切面编程/6016335)，通过[预编译](https://baike.baidu.com/item/预编译/3191547)方式和运行期间动态代理实现程序功能的统一维护的一种技术。AOP是[OOP](https://baike.baidu.com/item/OOP)的延续，是软件开发中的一个热点，也是[Spring](https://baike.baidu.com/item/Spring)框架中的一个重要内容，是[函数式编程](https://baike.baidu.com/item/函数式编程/4035031)的一种衍生范型。利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的[耦合度](https://baike.baidu.com/item/耦合度/2603938)降低，提高程序的可重用性，同时提高了开发的效率。

![图片](https://mmbiz.qpic.cn/mmbiz_png/uJDAUKrGC7JAeTYOaaH6rZ6WmLLgwQLHf5pmH30gj6mZm81PC7iauicFu55sicJtspU7K3vTCVdZCDTSHq7D5XHlw/640?wx_fmt=png&tp=webp&wxfrom=5&wx_lazy=1&wx_co=1)

#### 11.2、AOP在Spring中的作用

提供声明式事务:允许用户自定义切面

- 横切关注点:跨越应用程序多个模块的方法或功能.既是,与我们业务逻辑无关,但是我们需要关注的部分,就是横切关注点.如日志,安全,缓存,事务等…
- 切面（ASPECT）：横切关注点 被模块化 的特殊对象。即，它是一个类。
- 通知（Advice）：切面必须要完成的工作。即，它是类中的一个方法。
- 目标（Target）：被通知对象。
- 代理（Proxy）：向目标对象应用通知之后创建的对象。
- 切入点（PointCut）：切面通知 执行的 “地点”的定义。
- 连接点（JointPoint）：与切入点匹配的执行点。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200219154244873.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MDkyNzQzNg==,size_16,color_FFFFFF,t_70)

==SpringAOP中，通过Advice定义横切逻辑，Spring中支持5种类型的Advice:==

![[外链图片转存失败,源站可能有防盗链机制,建议将图片保存下来直接上传(img-mmR2GJ66-1582098145036)(https://blog.kuangstudy.com/usr/uploads/2019/10/904133406.png)]](https://img-blog.csdnimg.cn/20200219154304911.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MDkyNzQzNg==,size_16,color_FFFFFF,t_70)

即 Aop 在 不改变原有代码的情况下 , 去增加新的功能 .

#### 11.3、使用Spring实现AOP

【重点】使用AOP织入，需要导入一个依赖包！

```xml
<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
<dependency>
   <groupId>org.aspectj</groupId>
   <artifactId>aspectjweaver</artifactId>
   <version>1.9.5</version>
</dependency>
```

==**第一种方式**==

**通过 Spring API (接口)实现**

1. 首先编写我们的业务接口和实现类

```java
public interface UserService {
    public void add();
    public void delete();
    public void update();
    public void select();
}
```

```java
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.err.println("添加了一个用户");
    }
    @Override
    public void delete() {
        System.err.println("删除了一个用户");
    }
    @Override
    public void update() {
        System.err.println("修改了一个用户");
    }
    @Override
    public void select() {
        System.err.println("查询了一个用户");
    }
}
```

2. 然后去写我们的增强类 , 我们编写两个 , 一个前置增强 一个后置增强

```java
public class Log implements MethodBeforeAdvice {

    //    method：要执行的目标对象的方法
//    args：参数
//    target:目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "方法，被执行了");
    }
}
```

```java
public class AfterAdvice implements AfterReturningAdvice {
    //returnValue 返回值
    //method被调用的方法
    //args 被调用的方法的对象的参数
    //target 被调用的目标对象
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了：" + method.getName() + "，返回结果为：" + returnValue);
    }
}
```

3. 最后去spring的文件中注册 , 并实现aop切入实现 , 注意导入约束 .

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/aop
       http://www.springframework.org/schema/aop/spring-aop.xsd">

    <!--    注册bean-->
    <bean id="userService" class="com.zlq.model.service.UserServiceImpl"/>
    <bean id="log" class="com.zlq.model.log.Log"/>
    <bean id="afterLog" class="com.zlq.model.log.AfterAdvice"/>
    <!--方式一：使用原生Spring API接口-->
    <!--配置aop:需要导入aop的约束-->
    <aop:config>
        <!--切入点:expression:表达式，execution(要执行的为！ * * * * *)-->
        <aop:pointcut id="pointcut" expression="execution(* com.zlq.model.service.UserServiceImpl.*(..))"/>
        <!--执行环绕增加！-->
        <aop:advisor advice-ref="log" pointcut-ref="pointcut"/>
        <aop:advisor advice-ref="afterLog" pointcut-ref="pointcut"/>
    </aop:config>
</beans>
```

4. 测试

```java
    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是接口
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
```

Aop的重要性 : 很重要 . 一定要理解其中的思路 , 主要是思想的理解这一块 .

Spring的Aop就是将公共的业务 (日志 , 安全等) 和领域业务结合起来 , 当执行领域业务时 , 将会把公共业务加进来 . 实现公共业务的重复利用 . 领域业务更纯粹 , 程序猿专注领域业务 , 其本质还是**动态代理**. 

==**第二种方式**==

**自定义类来实现Aop**

目标业务类不变依旧是userServiceImpl

第一步 : 写我们自己的一个切入类

```java
public class DiyPointCut {
    public void before(){
        System.out.println("===============方法执行前");
    }
    public void after(){
        System.out.println("===============方法执行后");
    }
}
```

去spring中配置

```xml
<!--第二种方式自定义实现-->
<!--注册bean-->
<bean id="diy" class="com.kuang.config.DiyPointcut"/>

<!--aop的配置-->
<aop:config>
   <!--第二种方式：使用AOP的标签实现-->
   <aop:aspect ref="diy">
       <aop:pointcut id="diyPonitcut" expression="execution(* com.kuang.service.UserServiceImpl.*(..))"/>
       <aop:before pointcut-ref="diyPonitcut" method="before"/>
       <aop:after pointcut-ref="diyPonitcut" method="after"/>
   </aop:aspect>
</aop:config>
```

测试

```java
public class MyTest {
   @Test
   public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       UserService userService = (UserService) context.getBean("userService");
       userService.add();
  }
}
```

==**第三种方式**==

**使用注解实现**

第一步：编写一个注解实现的增强类

```java
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointcut {
    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("---------方法执行前---------");
    }

    @After("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("---------方法执行后---------");
    }

    @Around("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
```

第二步：在Spring配置文件中，注册bean，并增加支持注解的配置

```xml
<!--第三种方式:注解实现-->
<bean id="annotationPointcut" class="com.zlq.model.diy.AnnotationPointcut"/>
<aop:aspectj-autoproxy/>
```

aop:aspectj-autoproxy：说明

```xml-dtd
通过aop命名空间的<aop:aspectj-autoproxy />声明自动为spring容器中那些配置@aspectJ切面的bean创建代理，织入切面。当然，spring 在内部依旧采用AnnotationAwareAspectJAutoProxyCreator进行自动代理的创建工作，但具体实现的细节已经被<aop:aspectj-autoproxy />隐藏起来了

<aop:aspectj-autoproxy />有一个proxy-target-class属性，默认为false，表示使用jdk动态代理织入增强，当配为<aop:aspectj-autoproxy  poxy-target-class="true"/>时，表示使用CGLib动态代理技术织入增强。不过即使proxy-target-class设置为false，如果目标类没有声明接口，则spring将自动使用CGLib动态代理。
```

## 12、整合MyBatis

步骤：

1. 导入相关jar包
   - Junit
   - mybatis
   - mysql
   - spring相关
   - aop织入
   - mybatis-spring【new】

```xml
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13</version>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.46</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.3</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.2.9.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.2.9.RELEASE</version>
    </dependency>
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>1.9.5</version>
    </dependency>
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjrt</artifactId>
        <version>1.8.9</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>2.0.5</version>
    </dependency>
```

2. 编写配置文件
3. 测试

#### 12.1、回忆MyBatis

1. 编写实体类
2. 编写核心配置文件
3. 编写接口
4. 编写Mapper.xml
5. 测试

#### 12.2、MyBatis-spring

1. 编写数据源配置

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xmlns:context="http://www.springframework.org/schema/context"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
          http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/context
          https://www.springframework.org/schema/context/spring-context.xsd">
       <!--引入java配置文件-->
       <context:property-placeholder location="classpath:db.properties"/>
       <!--    DataSource:使用Spring的数据源替换mybatis的配置 c3p0 dbcp druid-->
       <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
           <property name="driverClassName" value="${jdbc.driver}" />
           <property name="url" value="${jdbc.url}"/>
           <property name="username" value="${jdbc.username}"/>
           <property name="password" value="${jdbc.password}"/>
       </bean>
       </beans>
   ```

2. sqlSessionFactory

   ```xml
   <!--sqlSessionFactory-->
   <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
       <!--指定数据源-->
       <property name="dataSource" ref="dataSource"/>
       <!--    绑定mybatis配置文件-->
       <property name="configLocation" value="classpath:mybatis-config.xml"/>
   
   </bean>
   ```

3. SqlSessionTemplate

   ```xml
   <!--SqlSessionTemplate:就是我们使用的sqlSession-->
   <bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
       <!--只能使用构造器注入，sqlSessionFactory，因为他没有set方法-->
       <constructor-arg index="0" ref="sqlSessionFactory"/>
   </bean>
   <bean id="userMapper" class="com.zlq.model.dao.Impl.UserMapperImpl">
       <property name="sqlSession" ref="sqlSession"/>
   </bean>
   ```

4. 需要给接口加实现类

   ```java
   public class UserMapperImpl implements UserMapper {
   
       public void setSqlSession(SqlSessionTemplate sqlSession) {
           this.sqlSession = sqlSession;
       }
       private SqlSessionTemplate sqlSession;
       @Override
       public List<User> selectUser() {
           UserMapper mapper = sqlSession.getMapper(UserMapper.class);
           return mapper.selectUser();
       }
   }
   ```

5. 将自己写的实现类，注入到spring中

   ```xml
   <bean id="userMapper" class="com.zlq.model.dao.Impl.UserMapperImpl">
       <property name="sqlSession" ref="sqlSession"/>
   </bean>
   ```

6. 测试即可

   ```java
   @Test
   public void testSelect() throws IOException {
       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
       for (User user : userMapper.selectUser()) {
           System.err.println(user);
       }
   }
   ```

## 13、声明式事务

#### 1、回顾事务

- 把一组业务当成一个业务来做；要么都成功，要么都失败
- 事务在项目开发中，十分重要，涉及到数据的一致性问题，不能马虎
- 确保完整性和一致性；

**==事务的ACID原则：==**

1. 原子性（atomicity）[ˌætəˈmɪsəti]
2. 一致性（consistency）[kənˈsɪstənsi]
3. 隔离性（isolation）[ˌaɪsəˈleɪʃn]
   - ​	多个事务可能操作同一个资源，放置数据损坏
4. 持久性（durability）[ˌdjʊərəˈbɪləti]
   - ​	事务一旦提交，无论系统发生什么问题，结果都不会再被影响，被持久化的写到存储器

#### 2、spring中的事务管理

- 声明式事务：AOP
- 编程式事务：需要在代码中，进行事务管理

























