package com.shuai.demo01;

/**
 * @author Admin
 * @date 2022/10/11 14:38
 */
public class Proxy implements Rent {
  private Hosrs hosrs;

  public Proxy(Hosrs hosrs) {
    this.hosrs = hosrs;
  }

  public Proxy() {
  }

  @Override
  public void rent() {
    look();
    hosrs.rent();
    contract();

    charge();
  }

  // 看房
  public void look() {
    System.out.println("看房子");
  }

  // 签合同
  public void contract() {
    System.out.println("签合同");
  }

  // 收费
  public void charge() {
    System.out.println("收费");
  }

}
