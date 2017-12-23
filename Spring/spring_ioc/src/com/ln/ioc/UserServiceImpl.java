package com.ln.ioc;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 15:30
 */
public class UserServiceImpl implements UserService {

    @Override
    public void say() {
        int i = UserService.i;
        System.out.println("hello Spring"+i);
    }
}
