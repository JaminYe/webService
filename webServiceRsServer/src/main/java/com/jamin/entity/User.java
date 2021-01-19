package com.jamin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jamin <br>
 * @date 2019/11/22 20:09<br>
 *     用户实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
/** 基于resultful风格用户可以传递xml和json数据 */
@XmlRootElement(name = "User")
public class User {
  /** 用户id */
  private Integer userId;
  /** 用户名 */
  private String userName;
}
