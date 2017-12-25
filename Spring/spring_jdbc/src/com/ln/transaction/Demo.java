package com.ln.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/25 20:52
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")
public class Demo {
    @Resource(name = "accountService")
    private AccountService ac;

    @Test
    public void t() throws SQLException {

        ac.pay("ww","qq",1);
        ac.select();
    }
}
