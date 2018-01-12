package com.ln.po;


import com.ln.pojo.User;
import com.ln.pojo.Uuid;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Fionar
 * Time: 2018/1/5 22:55
 */
public class UserTest {
    @Test
    public void findUserById() throws IOException {
        String resource = "SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);
    }

    @Test
    public void findUserByUserName() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        List<User> list = sqlSession.selectList("test.findUserByUserName", "%王%");
    }

    @Test
    public void findUserByName() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        List<User> list = sqlSession.selectList("test.findUserByName", "王");
        System.out.println(list);
    }

    @Test
    public void insertUser() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession openSession = factory.openSession();
        User user = new User();
        user.setSex("男");
        user.setUsername("wqqq");
        System.out.println(user.getId());
        openSession.insert("test.insertUser", user);
        openSession.commit();
        System.out.println(user.getId());
    }

    @Test
    public void setUUID() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession openSession = factory.openSession();
        Uuid uuid = new Uuid();
        openSession.insert("test.setUUID", uuid);
        openSession.commit();
        System.out.println(uuid.getId());
    }

    @Test
    public void deleteUser() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession openSession = factory.openSession();
        openSession.delete("test.deleteUser", 44);
        openSession.commit();
    }

    @Test
    public void updateUser() throws IOException {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
        SqlSession openSession = factory.openSession();
        User user = new User();
        user.setAddress("12313413");
        user.setId(29);
        openSession.update("test.updateUser",user);
        openSession.commit();
    }
}