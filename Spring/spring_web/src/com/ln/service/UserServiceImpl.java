package com.ln.service;

import com.ln.dao.UserDao;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 18:05
 */
public class UserServiceImpl implements UserService {
    private UserDao ud;

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    @Override
    public void save() {
        System.out.println("service 保存用户");
        ud.save();
    }
}
