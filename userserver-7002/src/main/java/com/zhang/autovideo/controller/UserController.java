package com.zhang.autovideo.controller;

import com.zhang.autovideo.pojo.User;
import com.zhang.autovideo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    @Qualifier("uServer")
    private IUserService userService;
    @RequestMapping("/getuser")
    public List getuser(){
        List<User> getuser = userService.getuser();
        return getuser;
    }
}
