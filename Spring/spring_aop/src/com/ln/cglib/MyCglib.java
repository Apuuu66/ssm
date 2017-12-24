package com.ln.cglib;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 17:07
 */
public class MyCglib {
    public static BookDaoImpl getProxy() {
        Enhancer enhancer = new Enhancer();

        //设置父类
        enhancer.setSuperclass(BookDaoImpl.class);
//        Callback call =null;
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("回调函数");

                return methodProxy.invokeSuper(o,objects);
            }
        });
        BookDaoImpl proxy = (BookDaoImpl) enhancer.create();
        return proxy;
    }
}
