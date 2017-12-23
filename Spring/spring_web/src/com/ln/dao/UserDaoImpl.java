package com.ln.dao;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 18:05
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao 保存用户");
    }
}
