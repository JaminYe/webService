package com.jamin.springService;

import javax.jws.WebService;

/**
 * @author Jamin <br>
 * @date 2019/11/21 16:07<br>
 *     helloService
 */
@WebService
public interface HelloService {
  /**
   * helloService
   *
   * @param content 发送内容
   * @return
   */
  public String helloService(String content);
}
