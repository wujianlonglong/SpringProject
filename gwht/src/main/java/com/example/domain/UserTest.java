package com.example.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by wjll9 on 2017/5/9.
 */
@Data
public class UserTest {
    private String name;

    private String age;


    public UserTest(String name,String age){
        this.name=name;
        this.age=age;
    }


}
