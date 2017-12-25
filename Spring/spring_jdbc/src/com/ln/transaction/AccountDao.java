package com.ln.transaction;

import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/25 20:38
 */
public interface AccountDao {
    void outMoney(String out, double money);

    void inMoney(String in, double money);

    void select() throws SQLException;
}
