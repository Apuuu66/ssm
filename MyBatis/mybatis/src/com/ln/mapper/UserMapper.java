package com.ln.mapper;

import com.ln.pojo.User;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2018/1/13 0:43
 */
public interface UserMapper {
    public User findUserById(Integer id);
}
