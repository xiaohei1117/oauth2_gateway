package com.xiaohei.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: AuthApplication
 * @Description:
 * @Author: xiaohei on Date:2022/5/7 15:20
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages="com.xiaohei")
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
