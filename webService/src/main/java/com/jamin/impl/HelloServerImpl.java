package com.jamin.impl;

import com.jamin.HelloServer;

/**
 * @author Jamin <br>
 * @date 2019/11/20 21:01<br>
 * 服务端接口实现
 */
public class HelloServerImpl implements HelloServer {
    @Override
    public String helloServer(String name) {
        return "你好"+name+"+WebSerice";
    }
}
