package com.ln.c3p0;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/25 16:56
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {
    @Resource(name = "qr")
    QueryRunner qr;
    @Test
    public void t() throws SQLException {
        String sql = "select * from user";
        List<User> list = qr.query(sql, new BeanListHandler<>(User.class));
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            System.out.println(user.getName());
        }
    }
}

