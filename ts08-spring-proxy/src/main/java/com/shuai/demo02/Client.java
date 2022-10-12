package com.shuai.demo02;

/**
 * @author Admin
 * @date 2022/10/11 15:10
 */
public class Client {
  public static void main(String[] args) {
    //
    //    UserServiceImpl userService = new UserServiceImpl();
    //
    //    UserServiceProxy userServiceProxy = new UserServiceProxy();
    //    userServiceProxy.setUserService(userService);
    //    userServiceProxy.query();

    UserServiceImpl userService = new UserServiceImpl();

    ProxyInvocationHandler pih = new ProxyInvocationHandler();
    pih.setTarget(userService);
    UserServiceImpl proxy = (UserServiceImpl)pih.getProxy();
    proxy.add();

  }
}
