package com.xiaobudiankeji.biz2.controller;

import com.xiaobudiankeji.biz2.config.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaomin on 2017/12/4.
 */
@RestController
@RequestMapping(value = "rabbit")
public class RabbitTest {
    @Autowired
    private HelloSender helloSender;

    @RequestMapping("/test")
    public String test() {
        helloSender.send();
        return "发送成功";
    }
}
