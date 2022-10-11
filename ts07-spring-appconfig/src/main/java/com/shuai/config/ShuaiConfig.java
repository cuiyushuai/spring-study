package com.shuai.config;

import com.shuai.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Admin
 * @date 2022/10/11 13:42
 */

@Configuration
public class ShuaiConfig {

  @Bean
  public User user() {
    return new User();
  }
}
