package com.tlkj.shiro4.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface RoleDao {
    Set<String> getRoleNamesByUsername(String username);
}
