package com.shuai.bean;

import java.util.*;

/**
 * @author Admin
 * @date 2022/10/10 11:33
 */
public class Student {
  private String name;
  private Address address;

  private String[] books;

  private List<String> hobbys;

  private Map<String, String> card;
  private Set<String> gname;
  private Properties info;

  @Override
  public String toString() {
    return "Student{" + "name='" + name + '\'' + ", address=" + address + ", books=" + Arrays.toString(
        books) + ", hobbys=" + hobbys + ", card=" + card + ", gname=" + gname + ", info=" + info + '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String[] getBooks() {
    return books;
  }

  public void setBooks(String[] books) {
    this.books = books;
  }

  public List<String> getHobbys() {
    return hobbys;
  }

  public void setHobbys(List<String> hobbys) {
    this.hobbys = hobbys;
  }

  public Map<String, String> getCard() {
    return card;
  }

  public void setCard(Map<String, String> card) {
    this.card = card;
  }

  public Set<String> getGname() {
    return gname;
  }

  public void setGname(Set<String> gname) {
    this.gname = gname;
  }

  public Properties getInfo() {
    return info;
  }

  public void setInfo(Properties info) {
    this.info = info;
  }
}
