package com.zhang.app.service;

import com.zhang.autovideo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "userserver")
public interface UserFeignapi {
    @RequestMapping("user/getuser")
    List getuser();
    @RequestMapping("user/getuserbyid")
    User getUserById(Integer id);
}
