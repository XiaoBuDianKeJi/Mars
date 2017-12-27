package com.xiaobudiankeji.biz2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zuoqing on 2017/12/24.
 */

public class BaseService {
    @Autowired
    protected RestTemplate restTemplate;


    protected static String SERVICE_BIZ = "http://service-biz";




}
