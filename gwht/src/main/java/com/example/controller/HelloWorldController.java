package com.example.controller;

import com.example.domain.ComparatorUser;
import com.example.domain.User;
import com.example.domain.UserTest;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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

    @RequestMapping("/sort")
    public void sort(){
        List<UserTest> userlist=new ArrayList();
        userlist.add(new UserTest("dd","4"));
        userlist.add(new UserTest("aa","1"));
        userlist.add(new UserTest("ee","5"));
        userlist.add(new UserTest("bb","2"));
        userlist.add(new UserTest("ff","5"));
        userlist.add(new UserTest("cc","3"));
        userlist.add(new UserTest("gg","6"));

        ComparatorUser comparator=new ComparatorUser();
        Collections.sort(userlist, comparator);

        for (int i=0;i<userlist.size();i++){
            UserTest user_temp=(UserTest)userlist.get(i);
            System.out.println(user_temp.getAge()+","+user_temp.getName());
        }

    }
}