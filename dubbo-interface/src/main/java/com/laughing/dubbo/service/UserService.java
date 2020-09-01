package com.laughing.dubbo.service;


import com.laughing.dubbo.dao.UserDao;

import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: User服务接口
 * @date 2020/9/1 13:05
 */
public interface UserService {
    /**
     *  按ID查询用户信息
     * @param id
     * @return
     */
    public List<UserDao> getUserDao(int id);
}
