/**
 * 
 */
package com.pdd.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import pinduoduo.com.po.Goodinfo;

/**
 * @author sxm
 * @CreateDate:	2018年9月29日
 */
@MapperScan
public interface PddDao {


	/**
	 * @param goodinfo
	 */
	void add(Goodinfo goodinfo);

	

	/**
	 * @return
	 */
	List<Goodinfo> queryList();

}
