package com.jamin.entity.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jamin <br>
 * @date 2019/11/22 20:09<br>
 *     用户实体类
 */

/** 基于resultful风格用户可以传递xml和json数据 */
@XmlRootElement(name = "User")
public class User {
  /** 用户id */
  private Integer userId;
  /** 用户名 */
  private String userName;

  public User() {}

  public User(Integer userId, String userName) {
    this.userId = userId;
    this.userName = userName;
  }

  @Override
  public String toString() {
    return "User{" + "userId=" + userId + ", userName='" + userName + '\'' + '}';
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
