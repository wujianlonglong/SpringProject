package com.example.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by wjll9 on 2017/5/3.
 */
@Entity
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = true, unique = true)
    private String nickName;
    @Column(nullable = false)
    private String regTime;

    public User(String nickNamep,String emailp,String userNamep,String passWordp,String regTimep){
        nickName=nickNamep;
        email=emailp;
        userName=userNamep;
        passWord=passWordp;
        regTime=regTimep;
    }
    //省略getter settet方法、构造方法
}