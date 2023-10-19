package com.xuanzhe.mapper;

import com.xuanzhe.pojo.User;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;

public class UserMapperImpl implements UserMapper{
  private SqlSessionTemplate sqlSession;

  public void setSqlSession(SqlSessionTemplate sqlSession) {
    this.sqlSession = sqlSession;
  }

  public List<User> selectUser(){
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    return mapper.selectUser();
  }
}
