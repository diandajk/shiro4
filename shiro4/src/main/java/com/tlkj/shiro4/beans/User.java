package com.tlkj.shiro4.beans;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String passwordSalt;


    public String getPassword() {
        return password;
    }
}
