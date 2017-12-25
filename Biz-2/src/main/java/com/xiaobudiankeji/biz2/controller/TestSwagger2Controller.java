package com.xiaobudiankeji.biz2.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zuoqing on 2017/12/24.
 */

@RestController
@RequestMapping("swagger")
public class TestSwagger2Controller extends BaseController{

    @ApiOperation(value="获取value的值")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "value1", value = "value1的值",  dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "value2", value = "value2的值", dataType = "int",paramType = "query")
    })
    @RequestMapping(value = "getIndex",method = RequestMethod.GET)
    public String getIndex(String value1,int value2){
     return value1+""+value2;
    }


}
