package com.ln.dao;

import com.ln.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/25 1:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {
    @Resource(name = "userDao")
    private UserDao userDao;
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void findUserById1() {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user = userDao.findUserById(1);
        System.out.println(user);
        User userById = userDao.findUserById(1);
        System.out.println(userById);
    }

    @Test
    public void findUserById2() {
        User userById = userDao.findUserById(1);
        System.out.println(userById);
    }
}