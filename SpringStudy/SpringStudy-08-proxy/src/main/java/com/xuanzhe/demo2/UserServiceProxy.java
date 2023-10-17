package com.xuanzhe.demo2;

public class UserServiceProxy implements UserService{
  UserServiceImpl userService;

  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }

  @Override
  public void add() {
    log("Add");
    userService.add();
  }

  @Override
  public void delete() {
    log("Delete");
    userService.delete();
  }

  @Override
  public void update() {
    log("Update");
    userService.update();
  }

  @Override
  public void query() {
    log("Query");
    userService.query();
  }

  public void log(String msg){
    System.out.println(msg+"methode");
  }
}
