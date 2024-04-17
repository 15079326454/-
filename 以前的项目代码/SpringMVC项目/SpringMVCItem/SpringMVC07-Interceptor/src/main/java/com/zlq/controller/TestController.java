package com.zlq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/t01")
    public String test01(){
        System.out.println("执行了test01方法");
        return "OK";
    }
}
