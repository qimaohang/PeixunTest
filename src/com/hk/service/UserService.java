package com.hk.service;

import com.hk.bean.User;

public interface UserService {
	void regist(User user);
	User login(String name,String password);
}
