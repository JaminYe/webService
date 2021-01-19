package com.jamin;

import com.jamin.entity.entity.User;
import com.jamin.entity.filter.CORSFilter;
import com.jamin.entity.service.impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * @author Jamin <br>
 * @date 2019/11/23 12:00<br>
 *     服务端测试
 */
public class ServerTest {
  public static void main(String[] args) {
    JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
    // 设置类文件转换json格式
    jaxrsServerFactoryBean.setResourceClasses(User.class);
    jaxrsServerFactoryBean.setAddress("http://localhost:9001/userServer/");
    jaxrsServerFactoryBean.setServiceBean(new UserServiceImpl());
    jaxrsServerFactoryBean.getOutInterceptors().add(new LoggingOutInterceptor());
    jaxrsServerFactoryBean.getInInterceptors().add(new LoggingInInterceptor());
    jaxrsServerFactoryBean.setProvider(CORSFilter.class);
    jaxrsServerFactoryBean.create();
    System.out.println("服务启动完成");
  }
}
