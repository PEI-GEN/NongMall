package com.pei.mail.mailthirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MailThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailThirdPartyApplication.class, args);
    }

}
