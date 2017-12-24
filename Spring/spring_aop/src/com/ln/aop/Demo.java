package com.ln.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 17:54
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class Demo {
    @Resource(name = "customerDao")
    private CustomerDao cd;
    @Test
    public void t1() {

        cd.save();
//        cd.update();
    }
}
