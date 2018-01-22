package com.ln.mapper;

import com.ln.pojo.CustomOrders;
import com.ln.pojo.Orders;
import com.ln.pojo.QueryVo;
import com.ln.pojo.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2018/1/13 0:43
 */
public interface UserMapper {
    public User findUserById(Integer id);

    public List<User> findUserByVo(QueryVo vo);

    public List<User> findUserByCondition(User user);

    public List<User> findUserByIds(QueryVo vo);

    public List<CustomOrders> findOrdersAndUser();

    public List<Orders> findOrdersAndUser2();

    public List<User> findUserAndOrders();
}
