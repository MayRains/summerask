package com.atguigu.summerask.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody // 这个类的所有方法返回的数据直接写给浏览器(如果是对象直接转换为JSON数据)
//@Controller
@RestController // @ResponseBody  + @Controller
public class helloController {


    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot";
    }
}
