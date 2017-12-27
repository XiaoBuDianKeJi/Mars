package com.xiaobudiankeji.biz2.service;

import com.xiaobudiankeji.base.entity.Menu;
import com.xiaobudiankeji.base.entity.MenuExample;
import com.xiaobudiankeji.base.utils.RedisStaticUtil;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaomin on 2017/12/24.
 */
@Service
public class RedisTestServiceImp extends BaseService implements RedisTestService{


    @Override
    public Object getDataByMysql() {
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria menuExampleCriteria = menuExample.createCriteria();
        menuExampleCriteria.andStateEqualTo(0);

       // List<Menu> menuList = menuDao.selectByExample(menuExample);
        return menuDao.selectByExample(menuExample);
    }

    @Override
    public Object getDataByRedis() {
        String key = RedisStaticUtil.MENUEXAMPLE_LIST;
        List<Menu> menuList= (List<Menu>) redisTemplate.opsForValue().get(key);
        if(menuList==null){
            MenuExample menuExample = new MenuExample();
            MenuExample.Criteria menuExampleCriteria = menuExample.createCriteria();
            menuExampleCriteria.andStateEqualTo(0);
            menuList = menuDao.selectByExample(menuExample);
            redisTemplate.opsForValue().set(key,menuList);
        }
        return menuList;
    }
}
