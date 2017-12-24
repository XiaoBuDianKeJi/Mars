package com.xiaobudiankeji.biz.service.serviceimpl;

import com.xiaobudiankeji.base.dao.MenuMapper;
import com.xiaobudiankeji.base.entity.Menu;
import com.xiaobudiankeji.base.entity.MenuExample;
import com.xiaobudiankeji.biz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zuoqing on 2017/12/24.
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Resource
    private MenuMapper menuDao;

    @Override
    public List<Menu> findUserMenuList(String name) {

        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria menuExampleCriteria = menuExample.createCriteria();
        menuExampleCriteria.andStateEqualTo(0);

        List<Menu> menuList = menuDao.selectByExample(menuExample);


        return menuList;
    }
}
