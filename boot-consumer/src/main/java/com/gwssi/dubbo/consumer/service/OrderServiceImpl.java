package com.gwssi.dubbo.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.laughing.dubbo.service.OrderService;
import com.laughing.dubbo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @Reference()
    UserService userService;

    /**
     * 调用provider服务
     *
     * @param id
     */
    @Override
    @HystrixCommand(fallbackMethod = "orderFallback")
    public void order(int id) {
        System.out.println("order服务调用userService");
        userService.getUserDao(id);
        System.out.println(userService.getUserDao(id).toString());
    }

    public void orderFallback(int id) {
        System.out.println("id=" + id);
        System.out.println("Hystrix服务降级 ，orderFallback 逻辑处理--------");

    }


}
