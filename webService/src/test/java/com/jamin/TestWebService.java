package com.jamin;

import com.jamin.impl.HelloServerImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author Jamin <br>
 * @date 2019/11/20 21:08<br>
 *     测试WebService发布
 */
public class TestWebService {
  public static void main(String[] args) {
    //      发布服务的工厂
    JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
    //    设置服务地址
    jaxWsServerFactoryBean.setAddress("http://127.0.0.1:9099/ws/hello");
    //  设置服务
    jaxWsServerFactoryBean.setServiceBean(new HelloServerImpl());
    //    发布服务
    jaxWsServerFactoryBean.create();
    System.out.println("服务发布完成");
  }
}
