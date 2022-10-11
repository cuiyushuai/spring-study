package com.shuai.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Admin
 * @date 2022/10/11 13:41
 */

public class User {

  @Value("帅气")
  private String name;

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User() {
  }

  public User(String name) {
    this.name = name;
  }
}
