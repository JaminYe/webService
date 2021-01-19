package com.jamin;

import com.jamin.server.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * @author Jamin <br>
 * @date 2019/11/23 18:52<br>
 *     测试
 */
public class TestClient {
  public static void main(String[] args) {

    Collection<? extends User> collection =
        WebClient.create("http://localhost:8080/userServer/userService/user")
            .accept(MediaType.APPLICATION_XML)
            .getCollection(User.class);
    System.out.println(collection);
  }
}
