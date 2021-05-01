package com.zhang.autovideo.pojo;

import lombok.Data;

import java.io.Serializable;
//要用redis缓存玩数据必须实现序列化
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private String cid;
    private String phone;
    private String email;
    private String address;
}
