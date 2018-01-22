package com.ln.mapper;

import com.ln.pojo.CustomOrders;
import com.ln.pojo.Orders;
import com.ln.pojo.QueryVo;
import com.ln.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2018/1/13 0:49
 */
public class UserMapperTest {

    @Test
    public void findUserById() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
    }

    @Test

    public void findUserByVo() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("张");
        user.setSex("1");
        vo.setUser(user);
        List<User> userByVo = mapper.findUserByVo(vo);
        System.out.println(userByVo.toString());
    }

    @Test
    public void findUserByCondition() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张三");
        user.setSex("1");
        List<User> list = mapper.findUserByCondition(user);
        System.out.println(list);
    }

    @Test
    public void findUserByIds() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(10);
        list.add(26);
        QueryVo vo = new QueryVo();
        vo.setList(list);
        List<User> userByIds = mapper.findUserByIds(vo);
        System.out.println(userByIds);
    }

    @Test
    public void findOrdersAndUser() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<CustomOrders> ordersAndUser = mapper.findOrdersAndUser();
        System.out.println(ordersAndUser);
    }


    @Test
    public void findOrdersAndUser2() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Orders> ordersAndUser2 = mapper.findOrdersAndUser2();
        System.out.println(ordersAndUser2);
    }

    @Test
    public void findUserAndOrders() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userAndOrders = mapper.findUserAndOrders();
        System.out.println(userAndOrders);
    }

}