package com.zhang.autovideo.pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String cid;
    private String phone;
    private String email;
    private String address;
}
