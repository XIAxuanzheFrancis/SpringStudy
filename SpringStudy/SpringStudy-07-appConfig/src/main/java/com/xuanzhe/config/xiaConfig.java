package com.xuanzhe.config;

import com.xuanzhe.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(xiaConfig2.class)
public class xiaConfig {
  @Bean
  public User getUser(){
    return new User();
  }
}
