package com.zlq.config;

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
