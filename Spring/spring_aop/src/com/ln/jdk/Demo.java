package com.ln.jdk;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 15:56
 */
public class Demo {
    @Test
    //运行期动态代理
    public void t1() {
        UserDao ud =new UserDaoImpl();
        ud.save();
        ud.update();
        System.out.println("===============");
        UserDao proxy = MyProxy.getProxy(ud);
        proxy.save();
        proxy.update();
    }
}
