package com.shuai.mapper;

import com.shuai.bean.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Admin
 * @date 2022/10/12 17:07
 */
public class UserMapperImpl implements UserMapper {
  private SqlSessionTemplate sqlSession;

  public void setSqlSession(SqlSessionTemplate sqlSession) {
    this.sqlSession = sqlSession;
  }

  @Override
  public List<User> getUserList() {
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);

    //    User user = new User(3, "ds", "234");
    //    delUser(3);
    //    addUser(user);
    Map<String, String> map = new HashMap<>();

    map.put("name", "xs");
    map.put("pwd", "123");
    map.put("id", "1");

    updateUser(map);
    return mapper.getUserList();
  }

  @Override
  public int addUser(User user) {
    return sqlSession.getMapper(UserMapper.class).addUser(user);
  }

  @Override
  public int delUser(int id) {
    return sqlSession.getMapper(UserMapper.class).delUser(id);
  }

  @Override
  public int updateUser(Map map) {
    return sqlSession.getMapper(UserMapper.class).updateUser(map);
  }
}
