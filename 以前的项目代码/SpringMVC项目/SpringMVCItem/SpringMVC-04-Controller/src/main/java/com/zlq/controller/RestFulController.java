package com.zlq.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class RestFulController {
//传统的：http://localhost:8080/SpringMVC_04_Controller_war_exploded/add?a=2&b=3
//RestFul:http://localhost:8080/SpringMVC_04_Controller_war_exploded/add/2/3
    @PostMapping("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为1："+res);
        return "test";
    }

    @GetMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为2："+res);
        return "test";
    }
}
