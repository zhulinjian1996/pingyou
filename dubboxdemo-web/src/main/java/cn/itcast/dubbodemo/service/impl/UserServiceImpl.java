package cn.itcast.dubbodemo.service.impl;

import cn.itcast.dubbodemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author zhulinjian
 * @create 2019-09-19 9:23
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "hello dubbox";
    }
}
