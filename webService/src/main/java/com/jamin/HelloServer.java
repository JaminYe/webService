package com.jamin;

import javax.jws.WebService;

/**
 * @author Jamin <br>
 * @date 2019/11/20 18:11<br>
 * helloWebService服务端接口
 */
@WebService
public interface HelloServer {
    /**
     * 服务端接口
     * @param name
     * @return
     */
    public String helloServer(String name);

}
