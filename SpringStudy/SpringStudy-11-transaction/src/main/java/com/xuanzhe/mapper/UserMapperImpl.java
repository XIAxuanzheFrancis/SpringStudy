package com.xuanzhe.mapper;

import com.xuanzhe.pojo.User;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
  @Override
  public List<User> selectUser() {
    SqlSession sqlSession = getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    return mapper.selectUser();
  }
}
