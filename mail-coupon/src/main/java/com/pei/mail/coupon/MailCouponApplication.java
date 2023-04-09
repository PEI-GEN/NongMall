package com.pei.mail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MailCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailCouponApplication.class, args);
    }

}
