package com.gwssi.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.laughing.dubbo.service.OrderService;
import com.laughing.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/1 13:12
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    UserService userService;
    /**
     * 调用provider服务
     * @param id
     */
    @Override
    public void order(int id) {
        System.out.println("order服务调用userService");
        userService.getUserDao(id);
        System.out.println(userService.getUserDao(id).toString());
    }
}
