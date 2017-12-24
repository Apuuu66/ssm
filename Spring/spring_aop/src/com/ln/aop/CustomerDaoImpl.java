package com.ln.aop;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 17:52
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
//        int i=1/0;
        System.out.println("保存客户");
    }

    @Override
    public void update() {
        System.out.println("修改客户");
    }
}
