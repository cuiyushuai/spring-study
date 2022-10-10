package com.shuai.bean;

/**
 * @author Admin
 * @date 2022/10/10 11:01
 */
public class User {
  private String name;

  public User() {
  }
  public User(String name) {
    this.name = name;
  }

  public void show(){
    System.out.println(name);
  }

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
}
