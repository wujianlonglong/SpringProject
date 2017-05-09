package com.example.controller;

import com.example.service.AspectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wjll9 on 2017/5/10.
 */
@RestController
public class AspectController {

    @Autowired
    AspectService aspectService;


    @RequestMapping("/aspecttest")
    public void aspect(){
        aspectService.test();
    }

}
