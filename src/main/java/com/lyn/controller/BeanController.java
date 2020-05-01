package com.lyn.controller;

import com.lyn.bean.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lyn
 * @create 2020-04-28 15:52
 */
@Controller
@RequestMapping("/beanReq")
public class BeanController {
    @RequestMapping("/getAccount")
     public String getAccount(Account account){
        System.out.println(account.toString());
        return "/success.jsp";
     }

    @RequestMapping("/getApi")
     public String getApi(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
         System.out.println(httpServletRequest);
         System.out.println(httpServletResponse);
         return "/success.jsp";
     }
}
