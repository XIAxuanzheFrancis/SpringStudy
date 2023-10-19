package com.xuanzhe.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Annotation {
  @Before("execution(* com.xuanzhe.service.UserServiceImpl.*(..))")
  public void before(){
    System.out.println("=============before=================");
  }


}
