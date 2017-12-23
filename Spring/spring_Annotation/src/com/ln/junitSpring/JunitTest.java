package com.ln.junitSpring;

import com.ln.annotation.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/23 20:11
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JunitTest {
    @Resource(name = "userService")
    private UserService us;
    @Test
    public void t() {
        System.out.println(1);
        us.save();
    }
}
