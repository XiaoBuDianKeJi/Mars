package com.xiaobudiankeji.biz2.controller;

import com.xiaobudiankeji.biz2.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaomin on 2017/12/24.
 */

public class BaseController {
    @Autowired
    protected RestTemplateService restTemplateService;
}
