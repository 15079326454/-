package com.zlq.model.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//等价与：<bean id="user" class="com.zlq.model.entity.User"/>
@Component //组件
//singleton:单例；   prototype:原型模式
@Scope("singleton")
public class User {
//相当于：<property name="name" value="凝练"/>
    @Value("凝练")
    public String name;
}
