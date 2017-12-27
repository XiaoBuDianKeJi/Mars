package com.xiaobudiankeji.biz2.service;

import com.xiaobudiankeji.base.dao.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by zuoqing on 2017/12/24.
 */
@Service
public class BaseService {
    @Autowired
    protected RestTemplate restTemplate;


    @Autowired
    protected RedisTemplate<String,Object> redisTemplate;

    @Resource
    protected MenuMapper menuDao;


    //服务名字可以大小写都支持

    protected static String SERVICE_BIZ = "http://service-biz";




}
