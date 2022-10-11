package com.shuai.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Admin
 * @date 2022/10/10 17:07
 */

@Component   // @Component 相当于 <bean id="user" class="com.shuai.bean.User"/>
public class User {

  @Value("帅气")   //   @Value("ssss") 相当于 <property name="name" value="ssss"/>

  private String name;

  public User() {
  }

  public User(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" + "name='" + name + '\'' + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
