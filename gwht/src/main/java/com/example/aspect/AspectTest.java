package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wjll9 on 2017/5/10.
 */
@Aspect
@Configuration
public class AspectTest {

    @Pointcut("execution(* com.example.service.AspectService.test(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("I am before!");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("I am after!");
    }


}
