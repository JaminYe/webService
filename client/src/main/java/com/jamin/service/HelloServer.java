package com.jamin.service;

import com.jamin.entity.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Jamin <br>
 * @date 2019/11/20 18:11<br>
 *     helloWebService服务端接口
 */
@WebService
public interface HelloServer {
  /**
   * 服务端接口
   *
   * @param name
   * @return
   */
  @WebMethod
  public String helloServer(String name);

  /**
   * 用户
   *
   * @return
   */
  @WebMethod
  public User helloUser();

  @WebMethod
  public User helloUser2(User user);
}
