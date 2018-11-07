package com.hk.dao;

import org.apache.ibatis.annotations.Param;

import com.hk.bean.User;

public interface UserDao {
	void addUser(User user);
	User findUserByNameAndPwd(@Param("name") String username,@Param("password") String password);
}
