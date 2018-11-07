package com.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.User;
import com.hk.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void regist(User user) {
		
		userDao.addUser(user);

	}

	@Override
	public User login(String name, String password) {
		
		return userDao.findUserByNameAndPwd(name,password);

	}

}
