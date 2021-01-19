package com.jamin.entity.entity;

/**
 * @author Jamin <br>
 * @date 2019/11/23 16:57<br>
 *     用户实体类
 */
public class User {
  /** 用户id */
  private Integer userId;
  /** 用户名 */
  private String userName;

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            '}';
  }

  public User(Integer userId, String userName) {
    this.userId = userId;
    this.userName = userName;
  }

  public User() {}

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getUserId() {
    return userId;
  }

  public String getUserName() {
    return userName;
  }
}
