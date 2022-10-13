package com.shuai.mapper;

import com.shuai.bean.User;

import java.util.List;
import java.util.Map;

/**
 * @author Admin
 * @date 2022/10/12 16:57
 */
public interface UserMapper {
  List<User> getUserList();

  int addUser(User user);

  int delUser(int id);

  int updateUser(Map map);
}
