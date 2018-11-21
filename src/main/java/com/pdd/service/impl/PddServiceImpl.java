/**
 * 
 */
package com.pdd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pdd.dao.PddDao;
import com.pdd.service.PddService;

import pinduoduo.com.po.Goodinfo;


/**
 * @author sxm
 * @CreateDate:	2018年9月29日
 */
@Service
public class PddServiceImpl implements PddService {

	@Resource
	 PddDao pddDao;


	@Override
	public List<Goodinfo> add(List<Goodinfo> list) {
		
		
			for (Goodinfo goodinfo : list) {
				
					pddDao.add(goodinfo);
			}
		
		for (Goodinfo goodinfo : list) {
			
			pddDao.add(goodinfo);
		}
		List<Goodinfo> list2 = pddDao.queryList();
		/*for (Goodinfo goodinfo : list2) {
			System.out.println("数据库查询结果为:");
			System.out.println(goodinfo);
		}
		*/
		
		System.out.println(list2.size()+"==================");
		return list2;
	}


	/* (non-Javadoc)
	 * @see com.pdd.service.PddService#list()
	 */
	@Override
	public List<Goodinfo> list() {
		List<Goodinfo> list = pddDao.queryList();
		System.out.println(list.size()+"-------------");
		return list;
	}
}
