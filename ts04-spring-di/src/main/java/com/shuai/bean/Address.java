package com.shuai.bean;

/**
 * @author Admin
 * @date 2022/10/10 11:33
 */
public class Address {
  private String address;

  @Override
  public String toString() {
    return "Address{" + "address='" + address + '\'' + '}';
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
