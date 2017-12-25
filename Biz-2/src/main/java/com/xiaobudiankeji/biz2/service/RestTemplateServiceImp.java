package com.xiaobudiankeji.biz2.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaomin on 2017/12/24.
 */
@Service
public class RestTemplateServiceImp extends BaseService implements RestTemplateService {
    @Resource
    protected RestTemplate restTemplate;

    @Bean
    @LoadBalanced
        //开启负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Override
    @HystrixCommand(fallbackMethod = "getBizSerivceDataErrorBack")
    public Object getBizSerivceData() {
        String url = SERVICE_BIZ+"/index/findUserMenuList";
        Map<String,Object> uriVariables = new HashMap<>();
        return restTemplate.getForObject(url,Object.class);
    }

    /**
     * 服务降级 SERVICE_BIZ服务挂了,自动走这个方法.适用于所有第三方
     * 调用别的服务时,如果别的服务未响应,会导致本服务请求阻塞,这个可以解决断路由保护
     * 直接返回error,默认请求时间2000毫秒
     * @return
     */
    public Object getBizSerivceDataErrorBack(){
        //可以重新请求继续降级 ....
        return null;
    }


}
