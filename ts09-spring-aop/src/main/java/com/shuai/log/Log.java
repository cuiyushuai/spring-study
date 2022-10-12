package com.shuai.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Admin
 * @date 2022/10/12 10:21
 */
public class Log implements MethodBeforeAdvice {

  @Override
  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println("当前执行的是" + method.getName() + "方法");
  }
}
