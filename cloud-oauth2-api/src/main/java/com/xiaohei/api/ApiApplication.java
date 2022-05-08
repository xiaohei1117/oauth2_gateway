package com.xiaohei.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: ApiApplication
 * @Description:
 * @Author: xiaohei on Date:2022/5/7 23:30
 * @Version: 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }
}
