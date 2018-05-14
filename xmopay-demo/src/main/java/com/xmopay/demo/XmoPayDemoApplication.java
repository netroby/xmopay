package com.xmopay.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.xmopay")
public class XmoPayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmoPayDemoApplication.class, args);
    }
}
