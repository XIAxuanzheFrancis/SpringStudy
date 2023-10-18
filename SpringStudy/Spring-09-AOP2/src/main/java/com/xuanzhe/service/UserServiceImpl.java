package com.xuanzhe.service;

public class UserServiceImpl implements UserService{

  @Override
  public void add() {
    System.out.println("Add user");
  }

  @Override
  public void delete() {
    System.out.println("Delete user");
  }

  @Override
  public void update() {
    System.out.println("Update user");
  }

  @Override
  public void select() {
    System.out.println("Select user");
  }
}
