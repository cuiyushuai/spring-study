package com.shuai.bean;

import javax.annotation.Resource;

/**
 * @author Admin
 * @date 2022/10/10 14:56
 */
public class People {
  @Resource(name = "cat")
  private Cat cat;
  @Resource
  private Dog dog;
  private String name;

  public People() {
  }

  public People(Cat cat, Dog dog, String name) {
    this.cat = cat;
    this.dog = dog;
    this.name = name;
  }

  @Override
  public String toString() {
    return "People{" + "cat=" + cat + ", dog=" + dog + ", name='" + name + '\'' + '}';
  }

  public Cat getCat() {
    return cat;
  }

  public void setCat(Cat cat) {
    this.cat = cat;
  }

  public Dog getDog() {
    return dog;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
