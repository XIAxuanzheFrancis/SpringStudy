package com.xuanzhe.demo2;

import com.xuanzhe.demo1.Proxy;

public class Client {
  public static void main(String[] args) {

    UserServiceImpl userservice = new UserServiceImpl();
    UserServiceProxy proxy = new UserServiceProxy();
    proxy.setUserService(userservice);
    proxy.add();
  }
}
