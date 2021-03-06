package com.jamin.service;

import com.jamin.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @author Jamin <br>
 * @date 2019/11/22 20:27<br>
 *     用户接口
 */
/** 当前服务对应访问路径 */
@Path("/userService")
@Produces("*/*")
public interface UserService {
  /**
   * 新增操作
   *
   * @param user 访问当前服务所对应的路径 服务器支持的请求数据格式
   */
  @POST
  @Path("/user")
  @Consumes({"application/xml", "application/json"})
  public void saveUser(User user);

  /**
   * 修改操作
   *
   * @param user
   */
  @PUT
  @Path("/user")
  @Consumes({"application/xml", "application/json"})
  public void updateUser(User user);

  /**
   * 删除操作
   *
   * @param user
   */
  @DELETE
  @Path("/user")
  @Consumes({"application/xml", "application/json"})
  public void deleteUser(User user);

  /**
   * 查询操作
   *
   * @return
   */
  @GET
  @Path("/user")
  @Consumes({"application/xml", "application/json"})
  public List<User> findAllUsers();
}
