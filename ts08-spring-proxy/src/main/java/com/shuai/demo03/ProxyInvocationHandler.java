package com.shuai.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Admin
 * @date 2022/10/11 17:28
 */
public class ProxyInvocationHandler implements InvocationHandler {

  private Rent rent;

  public void setRent(Rent rent) {
    this.rent = rent;
  }

  public Object getProxy() {
    return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    Object res = method.invoke(rent, args);
    return res;
  }
}
