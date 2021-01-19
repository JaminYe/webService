package com.jamin;

import com.jamin.entity.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * @author Jamin <br>
 * @date 2019/11/23 12:07<br>
 *     客户端测试
 */
public class ClientTest {
  @Test
  public void saveTest() {
    User user =
        WebClient.create("http://localhost:9001/ws/userService/user/1")
            .accept(MediaType.APPLICATION_JSON_TYPE)
            .get(User.class);
    System.out.println(user);
  }
}
