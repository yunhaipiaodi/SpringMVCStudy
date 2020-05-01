package com.lyn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lyn
 * @create 2020-04-28 13:50
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/getParam")
    public String getParam(){
        System.out.println("execute getParam");
        return "/success.jsp";
    }
}
