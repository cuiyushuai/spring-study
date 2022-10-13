package com.shuai.mapper;

import com.shuai.bean.User;

import java.util.List;

/**
 * @author Admin
 * @date 2022/10/12 15:51
 */
public interface UserMapper {
  /**
   * 查询User表数据
   * @return
   */
  List<User> getUserList();
}
