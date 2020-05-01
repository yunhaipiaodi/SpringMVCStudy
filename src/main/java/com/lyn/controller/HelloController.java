package com.lyn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lyn
 * @create 2020-04-27 8:09
 */
@Controller
public class HelloController {
    @RequestMapping(value="/hello")
    public String sayHello(@RequestParam(name = "userName") String name){
        System.out.println("hello! " + name);
        return "/success.jsp";
    }
}
