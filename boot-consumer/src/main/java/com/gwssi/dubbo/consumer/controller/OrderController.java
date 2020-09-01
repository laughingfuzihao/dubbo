package com.gwssi.dubbo.consumer.controller;

import com.laughing.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/1 14:49
 */
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/consumer")
    public void intiOrder() {
        orderService.order(1);
    }
}
