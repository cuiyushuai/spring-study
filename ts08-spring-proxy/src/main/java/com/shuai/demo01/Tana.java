package com.shuai.demo01;

/**
 * @author Admin
 * @date 2022/10/11 14:38
 */
public class Tana {
  public static void main(String[] args) {
    Hosrs h = new Hosrs();
    Proxy p = new Proxy(h);
    p.rent();
  }
}
