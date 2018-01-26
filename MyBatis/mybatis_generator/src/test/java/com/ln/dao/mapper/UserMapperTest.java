package com.ln.dao.mapper;

import com.ln.pojo.User;
import com.ln.pojo.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/26 22:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
	@Resource(name = "userMapper")
	private UserMapper userMapper;

	@Test
	public void selectByPrimaryKey() {
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}

	@Test
	public void selectByExample(){
		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andUsernameLike("%王%");
		criteria.andSexEqualTo("2");
		List<User> users = userMapper.selectByExample(userExample);
		System.out.println(users);
	}


}
