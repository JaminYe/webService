package com.jamin.springService.impl;

import com.jamin.springService.HelloService;

/**
 * @author Jamin <br>
 * @date 2019/11/21 16:08<br>
 * webService接口实现类
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String helloService(String content) {
        return "ceshi"+content;
    }
}
