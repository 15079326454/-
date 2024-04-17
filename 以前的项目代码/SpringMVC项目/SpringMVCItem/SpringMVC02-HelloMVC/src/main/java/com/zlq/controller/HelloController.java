package com.zlq.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView模型和视图
        ModelAndView mv = new ModelAndView();
//        封装对象，放在ModelAndView中。
        mv.addObject("msg", "HelloSpringMVC!");
        mv.setViewName("hello");//:/WEB=INF/jsp/hello.jsp
        return mv;
    }
}
