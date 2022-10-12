package com.shuai.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Admin
 * @date 2022/10/11 17:28
 */
public class ProxyInvocationHandler implements InvocationHandler {

  private Object target;

  public void setTarget(Object target) {
    this.target = target;
  }

  public Object getProxy() {
    return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
  }

  @Override
  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    Object res = method.invoke(target, objects);
    return res;
  }
}
