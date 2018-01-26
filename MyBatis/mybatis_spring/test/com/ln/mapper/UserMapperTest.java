package com.ln.mapper;

import com.ln.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/26 1:53
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Test
    public void findUserById() {
        User userById = userMapper.findUserById(1);
        System.out.println(userById);
    }
}