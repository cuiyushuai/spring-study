package com.shuai.mapper;

import com.shuai.bean.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/12 15:59
 */
public class UserMapperImpl implements UserMapper {

  private SqlSessionTemplate sqlSession;

  public void setSqlSession(SqlSessionTemplate sqlSession) {
    this.sqlSession = sqlSession;
  }

  @Override
  public List<User> getUserList() {
    return sqlSession.getMapper(UserMapper.class).getUserList();
  }
}
