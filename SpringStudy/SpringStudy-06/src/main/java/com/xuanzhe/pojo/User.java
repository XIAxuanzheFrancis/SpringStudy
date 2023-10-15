package com.xuanzhe.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
  @Value("xiaxuanzhe")
  public String name;
}
