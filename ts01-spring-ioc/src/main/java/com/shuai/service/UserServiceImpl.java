package com.shuai.service;

import com.shuai.dao.UserDao;

/**
 * @author Admin
 * @date 2022/10/9 15:59
 */
public class UserServiceImpl implements UserService {
  private UserDao userDao;

  // 通过set注入  将对象选择给到用户
  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public void getUserList() {
    userDao.getUserList();
  }
}
