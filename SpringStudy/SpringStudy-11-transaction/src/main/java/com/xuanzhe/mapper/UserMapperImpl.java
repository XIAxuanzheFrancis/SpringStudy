package com.xuanzhe.mapper;

import com.xuanzhe.pojo.User;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
  @Override
  public List<User> selectUser() {
    User user = new User(7,"小夏","isima");
    UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
    mapper.addUser(user);
    mapper.deleteUser(7);
//    SqlSession sqlSession = getSqlSession();
//    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    return mapper.selectUser();
  }

  @Override
  public int addUser(User user) {
    return getSqlSession().getMapper(UserMapper.class).addUser(user);
  }

  @Override
  public int deleteUser(int id) {
    return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
  }
}
