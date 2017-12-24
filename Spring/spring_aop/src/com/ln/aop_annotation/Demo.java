package com.ln.aop_annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 23:27
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class Demo {
    @Resource(name = "customerDao")
    private CustomerDao cd;
    @Test
    public void t() {
        cd.save();
        cd.update();
    }
}
