package com.ln.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 16:18
 */
public class MyProxy {
    public static UserDao getProxy(final UserDao dao) {
        UserDao o = (UserDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("save")) {
                    System.out.println("记录日志");
                }
                return method.invoke(dao,args);
            }
        });
        return o;
    }
}
