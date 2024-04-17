package com.zlq.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zlq.entity.User;
import com.zlq.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController  //就不会走视图解析器，会直接返回一个字符串
public class UserController {
    @RequestMapping(value = "/j1")
    public String json1() throws JsonProcessingException {
        //创建一个对象
        User user = new User("nini", 2, "男");
        //jackson,ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping(value = "/j2")
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<>();
        User user1 = new User("柠檬1", 2, "男");
        User user2 = new User("柠檬2", 2, "男");
        User user3 = new User("柠檬3", 2, "男");
        User user4 = new User("柠檬4", 2, "男");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        return JsonUtils.getJson(userList);
    }
    @RequestMapping(value = "/j3")
    public String json3() throws JsonProcessingException {
        Date data = new Date();
        String json = JsonUtils.getJson(data);
        return json;
    }
    @RequestMapping(value = "/j4")
    public String json4() throws JsonProcessingException {
        List<User> userList2 = new ArrayList<>();
        User user1 = new User("柠檬1", 2, "男");
        User user2 = new User("柠檬2", 2, "男");
        User user3 = new User("柠檬3", 2, "男");
        User user4 = new User("柠檬4", 2, "男");
        userList2.add(user1);
        userList2.add(user2);
        userList2.add(user3);
        userList2.add(user4);
        String string = JSON.toJSONString(userList2);

        return string;
    }
}
