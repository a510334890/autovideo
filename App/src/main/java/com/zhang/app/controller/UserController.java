package com.zhang.app.controller;


import com.zhang.app.service.UserFeignapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserFeignapi feignapi;
    @ResponseBody
    @RequestMapping("/getuser")
    public List getuser(){
        return feignapi.getuser();
    }
    @RequestMapping("/getlogin")
    public String getlogin(){
        return "login";
    }
    @RequestMapping("/getindex")
    public String getindex(){
        return "index";
    }
}
