/**
 * 
 */
package com.hm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.hm.dao.UserDao;
import com.hm.pojo.User;
import com.hm.service.UserService;

/**
 * @author sxm
 * @CreateDate:	2018年9月20日
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userdao;

	/* 
	 * 查询所有用户
	 */
	@Override
	public List<User> queryList() {
		List<User> list = userdao.list();
		return list;
	}

	/*
	 * 添加用户
	 */
	@Override
	public void insertUser(User user) {
		userdao.add(user);
		
	}

}
