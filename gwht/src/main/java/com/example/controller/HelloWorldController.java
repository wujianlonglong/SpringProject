package com.example.controller;

import com.example.domain.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by wjll9 on 2017/5/3.
 */
@RestController
public class HelloWorldController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/test")
    public void test(){
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        User user=new User("aa1", "aa@126.com", "aa", "aa123456",formattedDate);
        userRepository.save(user);
    }
}