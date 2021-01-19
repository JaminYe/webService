package com.jamin.service.impl;

import com.jamin.entity.entity.User;
import com.jamin.entity.service.HelloServer;

/**
 * @author Jamin <br>
 * @date 2019/11/25 10:40<br>
 */
public class HelloServerImpl implements HelloServer {
  @Override
  public String helloServer(String name) {
    return name;
  }

  @Override
  public User helloUser() {
    return null;
  }

  @Override
  public User helloUser2(User user) {
    return user;
  }
}
