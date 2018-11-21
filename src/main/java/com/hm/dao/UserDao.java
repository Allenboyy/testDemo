/**
 * 
 */
package com.hm.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.ui.Model;

import com.hm.pojo.User;

/**
 * @author sxm
 * @CreateDate:	2018年9月20日
 */
//@MapperScan
public interface UserDao {
	
	public List<User> list(); 
	
	public void add(User user);
}
