package com.zhang.autovideo.mapper;

import com.zhang.autovideo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> getuser();
    User getUserById(Integer id);
    Integer delUserById(Integer id);
}
