package com.laughing.dubbo.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: ProviderApplication主启动
 * @date 20202020/9/1 13:36
 */
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();
        // 阻塞
        System.in.read();

    }
}
