package com.zlq.controller;

import com.zlq.entity.Users;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(Model model){
        model.addAttribute("msg","hello ajax");
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("java".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }
@RequestMapping("/a2")
    public List<Users> ajax2(){
    List<Users> usersList = new ArrayList<Users>();
//添加数据
    usersList.add(new Users("java",1,"男"));
    usersList.add(new Users("前端",2,"女"));
    usersList.add(new Users("运维",3,"男"));
    return usersList;
}

@RequestMapping("/a3")
    public String ajax3(String name,String pwd){
        String msg="";
        if (name!=null){
            if ("admin".equals(name)){
                msg="OK";
            }else {
                msg="用户名错误";
            }
        }
        if (pwd!=null){
            if ("123".equals(pwd)){
                msg="OK";
            }else {
                msg="密码错误";
            }
        }
        return msg;
}

}
