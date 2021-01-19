package com.jamin.server;

import com.jamin.service.impl.HelloServerImpl;

import javax.xml.ws.Endpoint;

/**
 * @author Jamin <br>
 * @date 2019/11/23 17:08<br>
 *     测试 此方法需要接口实现类注解 导入javax.jws.jsr181 @WebService(endpointInterface =
 *     "com.jamin.entity.service.HelloServer", serviceName = "helloServer")
 */
public class Test {
  public static void main(String[] args) {
    Endpoint.publish("http://localhost:9001/userServer/", new HelloServerImpl());
  }
}
