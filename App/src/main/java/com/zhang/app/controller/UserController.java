package com.zhang.app.controller;


import com.zhang.app.service.UserFeignapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserFeignapi feignapi;

    @RequestMapping("/getlogin")
    public String getlogin(){
        return "login";
    }
    @RequestMapping("/getindex")
    public String getindex(HttpSession session,String username,String password){
        List getuser = feignapi.getuser();
        session.setAttribute("userList",getuser);
        return "index";
    }
    @RequestMapping("/gettable")
    public String gettable(Model model){
        List getuser = feignapi.getuser();
        model.addAttribute("userlist",getuser);
        return "usertables";
    }
}
