package com.ln.annotation;

import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 19:51
 */

@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao 保存用户----");
    }
}
