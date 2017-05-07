package com.example.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wjll9 on 2017/5/8.
 */
@RestController
@RequestMapping(value = "/session")
public class SessionTest {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(HttpServletRequest request){
        if(request.getSession()==null)
            System.out.print("session is null");
        else {
            String id = request.getSession().getId();
            System.out.print("session is { }"+id);
            if(request.getSession().getAttribute("userId")==null){
                request.getSession().setAttribute("userId","admin");
            }
        }


    }

}
