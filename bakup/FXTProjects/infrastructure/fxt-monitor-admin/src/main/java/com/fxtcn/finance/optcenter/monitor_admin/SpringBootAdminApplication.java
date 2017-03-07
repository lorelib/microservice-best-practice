package com.fxtcn.finance.optcenter.monitor_admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by listening on 2017/1/4.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootAdminApplication /*extends SpringBootServletInitializer*/ {
    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootAdminApplication.class);
    }*/

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminApplication.class, args);
    }
}
