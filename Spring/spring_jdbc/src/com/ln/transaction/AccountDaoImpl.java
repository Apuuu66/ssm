package com.ln.transaction;

import com.ln.c3p0.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/25 20:40
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Resource(name = "qr")
    QueryRunner qr;
    @Override
    public void outMoney(String out, double money) {
        this.getJdbcTemplate().update("UPDATE account set money = money - ? where name = ?",money,out);
//        List<User> list = qr.query("select * from user", new BeanListHandler<>(User.class));
//        for (int i = 0; i < list.size(); i++) {
//            User user = list.get(i);
//            System.out.println(user.getName());
//        }
    }

    @Override
    public void inMoney(String in, double money) {
        this.getJdbcTemplate().update("UPDATE account set money = money + ? where name = ?",money,in);
    }

    public void select() throws SQLException {
        String s = "select * from account";
        List<Account> list = qr.query(s, new BeanListHandler<>(Account.class));
        System.out.println(list.toString());
    }
}
