package com.ln.ioc;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 15:30
 */
public class UserServiceImpl implements UserService {
    private UserDao ud;
    private String str;

    public void setUd(UserDao ud) {
        this.ud = ud;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public void say() {
        int i = UserService.i;
        System.out.println("hello Spring "+str);
    }

    @Override
    public void save() {
        ud.save();
    }

}
