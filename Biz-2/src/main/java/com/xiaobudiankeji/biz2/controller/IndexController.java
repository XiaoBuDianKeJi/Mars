package com.xiaobudiankeji.biz2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zuoqing on 2017/12/24.
 */

@RestController
@RequestMapping("index")
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    String host = "http://SERVICE-BIZ";

    @Bean
    @LoadBalanced
        //开启负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("index")
    public  Object index(){
        String url = host+"/index/findUserMenuList";
        Map<String,Object> uriVariables = new HashMap<>();
        return restTemplate.getForObject(url,Object.class);

    }


}
