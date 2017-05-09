package com.example.domain;

import java.util.Comparator;

/**
 * Created by wjll9 on 2017/5/9.
 */
public class ComparatorUser implements Comparator {

    public int compare(Object obj0, Object obj1) {
        UserTest user0=(UserTest)obj0;
        UserTest user1=(UserTest)obj1;
        //首先比较年龄，如果年龄相同，则比较名字

        int flag=user1.getAge().compareTo(user0.getAge());
        if(flag==0){
            return user1.getName().compareTo(user0.getName());
        }else{
            return flag;
        }
    }

}