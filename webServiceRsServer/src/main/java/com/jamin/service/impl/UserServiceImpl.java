package com.jamin.service.impl;

import com.jamin.entity.User;
import com.jamin.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/11/22 20:50<br>
 *     用户服务实现类
 */
public class UserServiceImpl implements UserService {
  @Override
  public void saveUser(User user) {
    System.out.println("saveUser" + user);
  }

  @Override
  public void updateUser(User user) {
    System.out.println("updateUser" + user);
  }

  @Override
  public void deleteUser(User user) {
    System.out.println("deleteUser" + user);
  }

  @Override
  public List<User> findAllUsers() {
    User user = new User();
    user.setUserId(1);
    user.setUserName("测试");
    ArrayList<User> users = new ArrayList<>();
    users.add(user);
    return users;
  }
}
