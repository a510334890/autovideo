package com.zhang.app.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "userserver,userserver02")
public interface UserFeignapi {
    @RequestMapping("user/getuser")
    List getuser();
}
