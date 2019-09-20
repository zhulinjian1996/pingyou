package cn.itcast.dubboxdemo.controller;

import cn.itcast.dubbodemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhulinjian
 * @create 2019-09-19 9:54
 */
@RestController
@RequestMapping("user")
public class UserControiller {

    @Reference
    private UserService service;

    @RequestMapping("showName")
    public String showName(){
        return service.getName();
    }
}
