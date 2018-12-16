/**
 * 
 */
package com.pdd.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.pdd.service.PddService;

import pdd.test.PinDuoDuoTest;
import pdd.util.HttpUtil;
import pinduoduo.com.po.AuthCatsResp;
import pinduoduo.com.po.AuthorizationCats;
import pinduoduo.com.po.Goodinfo;
import pinduoduo.com.po.PddBaseParam;
import pinduoduo.com.po.PddTimeResp;

/**
 * @author sxm
 * @CreateDate: 2018年9月29日
 */
@RequestMapping("/pingdd")
@Controller
public class  PddController {

	@Resource
	PddService pddService;

	String url = "http://gw-api.pinduoduo.com/api/router";

	private String clientSecret = "76b40cc2655d1b862874e850b24c39d1b628c07d";

	private static final Logger LOGGER = LoggerFactory.getLogger(PinDuoDuoTest.class);

	/*
	 * @RequestMapping("/list") public String list(Model model) {
	 * 
	 * AuthorizationCats authorizationCats = new AuthorizationCats() ; Map<String,
	 * Object> params = authorizationCats.getParams();
	 * 
	 * LOGGER.debug("请求",authorizationCats); params.put("client_id",
	 * authorizationCats.getClient_id()); params.put("access_token",
	 * authorizationCats.getAccess_token()); String sign = getSign(params,
	 * clientSecret); params.put("sign", sign); String jsonString =
	 * JSONObject.toJSONString(params); // System.out.println(jsonString);
	 * 
	 * 
	 * 
	 * String json = HttpUtil.postJson(url, jsonString); //
	 * System.out.println(json);
	 * 
	 * AuthCatsResp resp = JSONObject.parseObject(json, AuthCatsResp.class);
	 * System.out.println(resp); List<Goodinfo> list =
	 * resp.getGoods_auth_cats_get_response().getGoods_cats_list();
	 * 
	 * 
	 * for (Goodinfo goodinfo : list) { System.out.println(goodinfo); }
	 * 
	 * model.addAttribute("list", list); return "pddList"; }
	 */

	@RequestMapping("/list")
	public String list(Model model) {
		List<Goodinfo> list = pddService.list();

		model.addAttribute("list", list);

		return "pddList";
	}

	@RequestMapping("/add")
	public String add(Model model) {
		AuthorizationCats authorizationCats = new AuthorizationCats();
		Map<String, Object> parmas = authorizationCats.getParams();
		parmas.put("client", authorizationCats.getClient_id());
		parmas.put("access_token", authorizationCats.getAccess_token());
		String sign = getSign(parmas, clientSecret);
		parmas.put("sign", sign);

		String jsonString = JSONObject.toJSONString(parmas);

		String json = HttpUtil.postJson(url, jsonString);

		AuthCatsResp resp = JSONObject.parseObject(json, AuthCatsResp.class);

		List<Goodinfo> listWeb = resp.getGoods_auth_cats_get_response().getGoods_cats_list();

		List<Goodinfo> list = pddService.add(listWeb);

		model.addAttribute("list", list);
		return "OK";
	}
	
	@RequestMapping("/getTime")
	public void getTime() {
		PddBaseParam baseParam = new PddBaseParam();
		Map<String,Object>params = baseParam.getParams();
		params.put("client", baseParam.getClient_id());
		params.put("access_token", baseParam.getAccess_token());
		String sign = getSign(params,clientSecret);
		params.put("sign", sign);
		String jsonString = JSONObject.toJSONString(params);
		String json = HttpUtil.postJson(url, jsonString);
		PddTimeResp timeResp = JSONObject.parseObject(json, PddTimeResp.class);
		System.out.println(timeResp);
	}

	private String getSign(Map<String, Object> params, String clientSecret) {
		Set<String> SortedParames = new TreeSet<>(params.keySet());
		StringBuilder result = new StringBuilder();
		for (String key : SortedParames) {
			String value = params.get(key).toString();
			result.append(key).append(value);
		}
		return DigestUtils.md5Hex(clientSecret + result + clientSecret).toUpperCase();
	}

	@Test
	public void shuangse() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		print(x);
	}

	private void print(int x) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		Random ra = new Random();
		System.out.println("机选的" + x + "号码是:");
		for (int i = 0; i < x; i++) {
			list.clear();
			set.clear();

			while (set.size() < 6) {
				int r = ra.nextInt(33) + 1;
				set.add(r);
			}
			for (Integer integer : set) {
				list.add(integer);
			}

			Collections.sort(list);
			for (Integer integer : list) {
				System.out.print(integer + "  ");
			}
			int b = ra.nextInt(16) + 1;
			System.out.println("--" + b);
		}

	}
	
	
	
	


}
