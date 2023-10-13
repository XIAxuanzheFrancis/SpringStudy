package com.xuanzhe.service;

import com.xuanzhe.dao.UserDao;
import com.xuanzhe.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
  private UserDao userdao;
  //IoC
  public void setUserDao(UserDao userdao){
    this.userdao=userdao;
  }
  @Override
  public void getUser() {
    userdao.getUser();
  }
}
