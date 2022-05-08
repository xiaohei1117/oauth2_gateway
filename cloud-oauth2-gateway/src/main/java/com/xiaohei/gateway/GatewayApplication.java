package com.xiaohei.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: GatewayApplication
 * @Description:
 * @Author: xiaohei on Date:2022/5/7 15:44
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages="com.xiaohei")
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
