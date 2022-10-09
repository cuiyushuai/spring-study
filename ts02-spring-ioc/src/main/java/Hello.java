package com.shuai;

/**
 * @author Admin
 * @date 2022/10/9 17:01
 */
public class Hello {
  private String str;

  @Override
  public String toString() {
    return "Hello{" + "str='" + str + '\'' + '}';
  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }
}
