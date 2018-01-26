package com.ln.dao;


import com.ln.pojo.User;

import java.util.List;

public interface UserDao {

	public User findUserById(Integer id);
	
	public List<User> findUserByUserName(String userName);
}
