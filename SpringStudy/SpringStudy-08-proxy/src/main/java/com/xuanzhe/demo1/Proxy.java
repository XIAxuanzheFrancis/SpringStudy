package com.xuanzhe.demo1;

public class Proxy implements Rent{
  private  Host host;

  public Proxy() {
  }

  public Proxy(Host host) {
    this.host = host;
  }

  @Override
  public void rent() {
    seeHouse();
    host.rent();
    contract();
    brokerage();
  }

  public void seeHouse(){
    System.out.println("See house");
  }

  public void contract(){
    System.out.println("Contract");
  }

  public void brokerage(){
    System.out.println("Brokerage");
  }
}
