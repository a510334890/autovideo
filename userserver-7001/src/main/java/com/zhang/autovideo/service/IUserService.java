package com.zhang.autovideo.service;

import com.zhang.autovideo.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> getuser();
    User getUserById(Integer id);
}
