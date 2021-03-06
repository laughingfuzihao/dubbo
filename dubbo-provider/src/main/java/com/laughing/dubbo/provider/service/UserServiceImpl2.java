package com.laughing.dubbo.provider.service;


import com.laughing.dubbo.dao.UserDao;
import com.laughing.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: 伪接口实现
 * @date 2020/9/1 13:08
 */
@Service
public class UserServiceImpl2 implements UserService {
    @Override
    public List<UserDao> getUserDao(int id) {
/*
        // TODO 休眠4s
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

        UserDao userDao = new UserDao();
        List<UserDao> userDaoList = new ArrayList<>();
        userDao.setId(id);
        userDao.setName("laughing");
        userDao.setAddress("Beijing");
        userDao.setAge(1);
        userDaoList.add(userDao);
        System.out.println("UserService 远程调用 version2");
        return userDaoList;
    }
}
