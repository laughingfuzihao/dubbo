package com.laughing.dubbo.consumer;

import com.laughing.dubbo.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/1 14:04
 */
public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.order(1);
        System.in.read();
    }
}
