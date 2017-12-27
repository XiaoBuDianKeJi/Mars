package com.xiaobudiankeji.biz.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaobudiankeji.base.entity.Menu;
import com.xiaobudiankeji.biz.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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

    /**
     *
     * 集成分页插件
     * @param page 当前页面
     * @param pageSize 每页的数量
     * @return
     */
    @RequestMapping("findUserMenuPageList")
    public Object findUserMenuPageList(@RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                   @RequestParam(value = "pageSize", required = false, defaultValue = "2") int pageSize){

        PageHelper.startPage(page, pageSize);//设置分页参数
        List<Menu> humorList = this.userService.findUserMenuList("李文涛");
        PageInfo<Menu> pageInfo = new PageInfo<>(humorList);
        return pageInfo;
    }

}
