package com.shuai.demo02;

/**
 * @author Admin
 * @date 2022/10/11 15:11
 */
public class UserServiceProxy implements UserService {
  private UserServiceImpl userService;

  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }

  @Override
  public void add() {
    log("add");
    userService.add();
  }

  @Override
  public void delete() {
    log("delete");
    userService.delete();
  }

  @Override
  public void update() {
    log("update");
    userService.update();
  }

  @Override
  public void query() {
    log("query");
    userService.query();
  }

  /**
   * 日志
   */
  public void log(String mse) {
    System.out.println("[deg] 使用了" + mse + "方法");

  }
}
