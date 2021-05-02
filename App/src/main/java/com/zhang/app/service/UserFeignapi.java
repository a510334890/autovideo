package com.zhang.app.service;

import com.zhang.autovideo.pojo.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "userserver")
public interface UserFeignapi {
    @RequestMapping("user/getuser")
    List getuser();
    @RequestMapping("user/getuserbyid")
    @Cacheable(value = "user",key = "#id")//如果用到reids必须要在feign里加上@Cacheable否则就会报错
    User getUserById(Integer id);
}
