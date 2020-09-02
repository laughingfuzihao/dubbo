package com.laughing.dubbo.consumer.service;

import com.laughing.dubbo.dao.UserDao;
import com.laughing.dubbo.service.UserService;

import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: consumer UserServiceStub
 * @date 20202020/9/2 9:49
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    // 构造函数传入真正的远程代理对象
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }


    @Override
    public List<UserDao> getUserDao(int id) {
        System.out.println("-----执行了UserServiceStub本地存根的内容-----");
        userService.getUserDao(id);
        return null;
    }
}
