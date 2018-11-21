/**
 * 
 */
package com.pdd.service;

import java.util.List;

import pinduoduo.com.po.Goodinfo;

/**
 * @author sxm
 * @CreateDate:	2018年9月29日
 */
public interface PddService {

	/**
	 * @param list
	 * @return 
	 */
	List<Goodinfo> add(List<Goodinfo> list);

	/**
	 * @return
	 */
	List<Goodinfo> list();

}
