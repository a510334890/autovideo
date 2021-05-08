package com.zhang.app.controller;


import com.zhang.app.service.UserFeignapi;
import com.zhang.autovideo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController extends MappingJackson2HttpMessageConverter {
    /*public UserController(){
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.TEXT_PLAIN);
        mediaTypes.add(MediaType.TEXT_HTML);  //加入text/html类型的支持
        setSupportedMediaTypes(mediaTypes);// tag6
    }*/
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
    @RequestMapping("/getuserbyid")
    public String getUserById(Integer id,Model model){
        User userById = feignapi.getUserById(id);
        model.addAttribute("user",userById);
        return "usertables";
    }
    @RequestMapping("/delUserById")
    public String delUserById(@RequestBody Integer id) {
        boolean b = feignapi.delUserById(id);
        if(b){
            return "usertables";
        }
        return "usertables";
    }

}
