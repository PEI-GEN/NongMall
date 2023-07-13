package com.pei.mail;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//@EnableAspectJAutoProxy(exposeProxy = true)
@EnableFeignClients(basePackages = "com.pei.mail.order.feign")
@EnableRedisHttpSession
@EnableRabbit
@EnableDiscoveryClient
@SpringBootApplication
public class MailOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailOrderApplication.class, args);
    }

}
