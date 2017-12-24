package com.ln.aop_annotation;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2017/12/24 23:09
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户");
    }

    @Override
    public void update() {
        System.out.println("更新客户");

    }
}
