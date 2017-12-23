package com.ln.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 16:41
 */
public class DI {
    @Test
    public void t1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService us = (UserService) ac.getBean("userService");
        us.say();
    }

    @Test
    public void t2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = (UserService) ac.getBean("userService");
        us.save();
    }
}
