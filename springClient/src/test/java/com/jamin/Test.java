package com.jamin;

import com.jamin.springService.HelloService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Jamin <br>
 * @date 2019/11/21 17:44<br>
 *     测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
  @Resource private HelloService helloService;

  @org.junit.Test
  public void test() {
    System.out.println(helloService.getClass());
    String s = helloService.helloService("测试");
    System.out.println(s);
  }
}
