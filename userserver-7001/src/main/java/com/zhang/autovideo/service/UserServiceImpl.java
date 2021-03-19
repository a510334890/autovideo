package com.zhang.autovideo.service;

import com.zhang.autovideo.mapper.UserMapper;
import com.zhang.autovideo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("uServer")
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getuser() {
        List<User> getuser = userMapper.getuser();
        return getuser;
    }
}
