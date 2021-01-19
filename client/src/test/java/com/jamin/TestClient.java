package com.jamin;

import com.jamin.entity.entity.User;
import com.jamin.service.HelloServer;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @author Jamin <br>
 * @date 2019/11/21 08:19<br>
 *     测试webService客户端
 */
public class TestClient {
  public static void main(String[] args) {
    // 创建代理工厂
    JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
    //   设置远程访问服务端地址
    jaxWsProxyFactoryBean.setAddress("http://localhost:9001/userServer/");
    //    设置接口类型
    jaxWsProxyFactoryBean.setServiceClass(HelloServer.class);
    // 添加日志输入输出拦截器
    jaxWsProxyFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
    jaxWsProxyFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
    //    生成接口代理对象
    HelloServer helloServer = jaxWsProxyFactoryBean.create(HelloServer.class);
    System.out.println(helloServer.getClass());
    // 远程访问服务端方法
    String content = helloServer.helloServer("测试");
    System.out.println(content);
    User user = helloServer.helloUser();
    System.out.println(user);
  }
}
