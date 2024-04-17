package com.zlq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {
    @RequestMapping("/t1")
    public String test01(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test";
    }

}
