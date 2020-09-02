package com.gwssi.dubbo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/1 14:46
 */
@SpringBootApplication
@EnableDubbo
@EnableHystrix
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
