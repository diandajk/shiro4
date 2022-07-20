package com.tlkj.shiro4.dao;

import com.tlkj.shiro4.beans.User;

public interface UserDao {
    User getUserByUsername(String username);
}
