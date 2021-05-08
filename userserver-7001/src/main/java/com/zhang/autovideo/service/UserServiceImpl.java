package com.zhang.autovideo.service;

import com.zhang.autovideo.mapper.UserMapper;
import com.zhang.autovideo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("uServer")
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public List<User> getuser() {
        List<User> getuser = userMapper.getuser();
        return getuser;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    @Cacheable(value = "user",key = "#id")
    public User getUserById(Integer id) {
        User userById = userMapper.getUserById(id);
        return userById;
    }

    @Override
    public boolean delUserById(Integer id) {
        Integer b = userMapper.delUserById(id);
        if(b>0){
            return true;
        }
        else {
            return false;
        }
    }
}
