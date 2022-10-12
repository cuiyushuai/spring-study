package com.shuai.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Admin
 * @date 2022/10/12 11:10
 */

/**
 * 注解的方法
 */
@Aspect
public class Log02 {

  @Before("execution(* com.shuai.dao.UserServiceImpl.*(..))")
  public void before() {

    System.out.println("之前执行-----------");
  }

  @After("execution(* com.shuai.dao.UserServiceImpl.*(..))")
  public void later() {
    System.out.println("之后执行-----------");
  }

  @Around("execution(* com.shuai.dao.UserServiceImpl.*(..))")
  public void around(ProceedingJoinPoint jp) throws Throwable {
    System.out.println("之前执行-----------jp");
    //jp.proceed(); 算是执行方法  需要调用
    Object proceed = jp.proceed();
    System.out.println("之后执行-----------jp");
  }
}
