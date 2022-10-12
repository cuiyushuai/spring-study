package com.shuai.dao;

/**
 * @author Admin
 * @date 2022/10/12 10:19
 */
public class UserServiceImpl implements UserService {
  @Override
  public void add() {
    System.out.println("添加了一个用户");
  }

  @Override
  public void del() {
    System.out.println("删除了一个用户");

  }

  @Override
  public void update() {
    System.out.println("修改了一个用户");

  }

  @Override
  public void select() {
    System.out.println("查询了一个用户");

  }
}
