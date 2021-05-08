package com.zhang.app.service;

import com.zhang.app.utils.RedisUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RedisTest {
  @Autowired
    RedisUtils redisUtils;
    @Test
    public void set() {
        redisUtils.set("redis_key", "redis_vale");
    }
}
