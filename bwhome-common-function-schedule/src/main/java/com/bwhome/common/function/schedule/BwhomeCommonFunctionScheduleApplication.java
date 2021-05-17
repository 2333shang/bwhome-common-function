package com.bwhome.common.function.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BwhomeCommonFunctionScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BwhomeCommonFunctionScheduleApplication.class, args);
    }

}
