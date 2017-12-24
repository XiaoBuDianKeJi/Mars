package com.xiaobudiankeji.biz2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaomin on 2017/12/24.
 */
@RestController
@RequestMapping(value = "rest")
public class HystrixTestController extends BaseController{

    /**
     * 这个和IndexController 的区别是,第三方服务挂了,不影响我们的程序.低耦合
     * @return
     */
    @RequestMapping("getBizSerivceData")
    public  Object getBizSerivceData(){
        return restTemplateService.getBizSerivceData();

    }
}
