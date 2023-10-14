package com.xuanzhe.pojo;

public class User {
  private String name;
/*
  public User() {
    System.out.println("Constructeur sans argument");
  }
*/

  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        '}';
  }
}
