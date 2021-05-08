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
    @RequestMapping("/getuserbyid")
    public User getUserById(Integer id){
        User userById = userService.getUserById(id);
        return userById;
    }
    @RequestMapping("/delUserById")
    public String delUserById(Integer id){
        boolean b = userService.delUserById(id);
        if(b){
            return "更新成功";
        }
        else{
            return "更新失败";
        }
    }
}
