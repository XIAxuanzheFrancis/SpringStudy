package com.xuanzhe.log;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class AfterLog implements AfterReturningAdvice {

  @Override
  public void afterReturning(Object returnValue, Method method, Object[] args, Object target)
      throws Throwable {
    System.out.println(method.getName()+"return value:"+returnValue);
  }
}
