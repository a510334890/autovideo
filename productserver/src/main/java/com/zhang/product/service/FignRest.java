package com.zhang.product.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "userserver")
@Component
public interface FignRest {
    @RequestMapping("user/getuser")
    public List getuser();
}
