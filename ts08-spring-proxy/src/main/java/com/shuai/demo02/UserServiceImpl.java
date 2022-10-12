package com.shuai.demo02;

/**
 * @author Admin
 * @date 2022/10/11 15:09
 */
public class UserServiceImpl implements UserService {
  @Override
  public void add() {
    System.out.println("添加了一个用户");
  }

  @Override
  public void delete() {
    System.out.println("删除加了一个用户");

  }

  @Override
  public void update() {
    System.out.println("修改了一个用户");

  }

  @Override
  public void query() {
    System.out.println("查询了一个用户");
  }
}
