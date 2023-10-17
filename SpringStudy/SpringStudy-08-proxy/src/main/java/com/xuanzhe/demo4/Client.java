package com.xuanzhe.demo4;

import com.xuanzhe.demo2.UserService;
import com.xuanzhe.demo2.UserServiceImpl;

public class Client {
  public static void main(String[] args) {
    UserServiceImpl userService = new UserServiceImpl();
    ProxyInvocationHandler pih = new ProxyInvocationHandler();
    pih.setTarget(userService);
    UserService proxy = (UserService)pih.getProxy();
    proxy.delete();
  }
}
