package com.ln.transaction;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/25 20:36
 */
public interface AccountService {
    void pay(String out,String in,double money) throws SQLException;

    void select() throws SQLException;
}
