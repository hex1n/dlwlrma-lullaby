package com.dlwlrma.lullaby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:hex1n
 * @Date:2020/1/20 17:40
 */
@RestController
@RequestMapping("/query")
public class QueryController {

    @Autowired
    EurekaClientConfigBean eurekaClientConfigBean;

    @GetMapping("/eureka-server")
    public Object getEurekaServerUlr() {
        return eurekaClientConfigBean.getServiceUrl();
    }
}
