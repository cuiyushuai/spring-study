package com.shuai.demo03;

/**
 * @author Admin
 * @date 2022/10/11 16:48
 */
public class Client {
  public static void main(String[] args) {

    Hosrs hosrs = new Hosrs();
    ProxyInvocationHandler pih = new ProxyInvocationHandler();
    pih.setRent((Rent)hosrs);

    Rent proxy = (Rent)pih.getProxy();

    proxy.rent();

  }
}
