package com.xuanzhe.log;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class Log implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println(target.getClass().getName()+" "+method.getName());
  }
}
