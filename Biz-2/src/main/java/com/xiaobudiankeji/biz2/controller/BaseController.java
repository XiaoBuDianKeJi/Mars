package com.xiaobudiankeji.biz2.controller;

import com.xiaobudiankeji.biz2.service.RedisTestService;
import com.xiaobudiankeji.biz2.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by gaomin on 2017/12/24.
 */

public class BaseController {
    @Autowired
    protected RestTemplateService restTemplateService;
    @Autowired
    protected RedisTestService redisTestService;
}
