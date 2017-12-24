package com.ln.cglib;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 16:57
 */
public class Demo {
    @Test
    //预编译方式
    public void t1() {
        BookDaoImpl dao =new BookDaoImpl();
        dao.save();
        dao.update();
        System.out.println("===========");
        BookDaoImpl proxy = MyCglib.getProxy();
        proxy.save();
        proxy.update();
    }
}
