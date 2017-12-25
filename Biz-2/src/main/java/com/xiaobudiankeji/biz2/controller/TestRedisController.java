package com.xiaobudiankeji.biz2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zuoqing on 2017/12/24.
 */

@RestController
@RequestMapping("redis")
public class TestRedisController extends BaseController{


    /**
     * 从mysql 获取
     * @return
     */
    @RequestMapping(value = "getByMysql",method = RequestMethod.GET)
    public Object getByMysql(){

        return redisTestService.getDataByMysql();
    }

    /**
     * 从redis 获取
     * @return
     */
    @RequestMapping(value = "getByRedis",method = RequestMethod.GET)
    public Object getByRedis(){

        return redisTestService.getDataByRedis();
    }

}
