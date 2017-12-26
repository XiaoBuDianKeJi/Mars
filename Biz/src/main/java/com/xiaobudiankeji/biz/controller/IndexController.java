package com.xiaobudiankeji.biz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 接口访问地址:http://localhost:8766/index/getHelloWord
 * Created by zuoqing on 2017/12/24.
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @RequestMapping("getHelloWord")
    public Object getHelloWord(){
        return "我是第一个Spring boot"+"HelloWord";
    }

}
