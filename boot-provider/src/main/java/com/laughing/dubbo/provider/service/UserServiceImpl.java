package com.laughing.dubbo.provider.service;


import com.alibaba.dubbo.rpc.cluster.loadbalance.AbstractLoadBalance;
import com.alibaba.dubbo.rpc.cluster.loadbalance.RandomLoadBalance;
import com.laughing.dubbo.dao.UserDao;
import com.laughing.dubbo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: 伪接口实现
 * @date 2020/9/1 13:08
 */
// Dubbo暴露接口
@com.alibaba.dubbo.config.annotation.Service(timeout = 3000,retries = 3,loadbalance = RandomLoadBalance.NAME)
@Service
public class UserServiceImpl implements UserService {
    @Override
    @HystrixCommand
    public List<UserDao> getUserDao(int id) {
        UserDao userDao = new UserDao();
        List<UserDao> userDaoList = new ArrayList<>();
        userDao.setId(id);
        userDao.setName("laughing");
        userDao.setAddress("Beijing");
        userDao.setAge(1);
        userDaoList.add(userDao);
        return userDaoList;
    }
}
