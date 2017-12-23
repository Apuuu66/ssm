package com.ln.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 15:48
 */
public class Demo {
    @Test
    public void t1() {
        UserService us =new UserServiceImpl();
        us.say();
    }
    @Test
    public void t2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = (UserService) ac.getBean("userService");
        us.say();
    }
}
