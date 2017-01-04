package com.lorelib.microservice.commons.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 抽象控制器
 * Created by listening on 2017/1/4.
 */
public class AbstractController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        return discoveryClient.getLocalServiceInstance();
    }
}
