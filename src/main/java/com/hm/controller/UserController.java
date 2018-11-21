/**
 * 
 */
package com.hm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hm.pojo.User;
import com.hm.service.UserService;

/**
 * @author sxm
 * @CreateDate:	2018年9月20日
 */
@Controller
@RequestMapping("/test")
public class UserController {
	


	@Resource
	private UserService userService;
	
	@RequestMapping("/user")
	public String index() {
		return "user";
	}
	@RequestMapping("/add")
	public String insert(User user,Model m) {
		
		System.out.println("con"+user+"=================");
		
		try {
			userService.insertUser(user);
		} catch (Exception e) {
			System.out.println("添加用户出错...");
			e.printStackTrace();
		}
		List<User> list = userService.queryList();
		if(list!=null&&!list.isEmpty()) {
			for (User user2 : list) {
				System.out.println(user2);
			}
		}
		m.addAttribute("list", list);
		return "list";		
	}
}
