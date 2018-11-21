/**
 * 
 */
package com.hm.service;

import java.util.List;

import org.springframework.ui.Model;

import com.hm.pojo.User;

/**
 * @author sxm
 * @CreateDate:	2018年9月20日
 */
public interface UserService {
	
	public List<User> queryList();
	public void insertUser(User user);
}
