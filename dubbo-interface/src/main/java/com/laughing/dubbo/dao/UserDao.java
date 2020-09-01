package com.laughing.dubbo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 2020/9/1 13:03
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDao implements Serializable {
    private int id;
    private String name;
    private int age;
    private String address;
}
