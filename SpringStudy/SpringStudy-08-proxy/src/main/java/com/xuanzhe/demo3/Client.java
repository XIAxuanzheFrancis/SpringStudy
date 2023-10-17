package com.xuanzhe.demo3;

import java.lang.reflect.Proxy;

public class Client {

  public static void main(String[] args) {
    Host host = new Host();
    ProxyInvocationHandler proxy = new ProxyInvocationHandler();
    proxy.setRent(host);
    Rent proxy2 = (Rent) proxy.getProxy();
    proxy2.rent();
  }
}
