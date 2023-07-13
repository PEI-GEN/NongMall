package com.pei.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@EnableFeignClients(basePackages = "com.pei.mail.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class MailMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailMemberApplication.class, args);
    }

}
