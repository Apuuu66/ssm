package com.ln.jdk;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 15:55
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("保存用户===");
    }

    @Override
    public void update() {
        System.out.println("修改用户====");
    }
}
