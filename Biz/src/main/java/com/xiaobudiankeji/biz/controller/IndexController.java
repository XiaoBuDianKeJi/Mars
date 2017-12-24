package com.xiaobudiankeji.biz.controller;

import com.xiaobudiankeji.biz.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zuoqing on 2017/12/24.
 */
@RestController
@RequestMapping("index")
public class IndexController {

    @Resource
    private UserService userService;

    @RequestMapping("index")
    public String index(){

        return "index";
    }

    @RequestMapping("findUserMenuList")
    public Object findUserMenuList(){

        return userService.findUserMenuList("李文涛");
    }

}
