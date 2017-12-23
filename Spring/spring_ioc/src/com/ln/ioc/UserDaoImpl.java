package com.ln.ioc;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 16:51
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("dao 执行保存方法");
    }
}
