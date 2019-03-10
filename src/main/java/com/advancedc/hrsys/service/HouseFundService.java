package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.HouseFund;

public interface HouseFundService {
	/*
	 * 查询全部公积金
	 */
	List<HouseFund> getHouseFundListAll();
	/*
	 * 通过主键查询公积金
	 */
	HouseFund getHouseFundListById(long id);
	/*
	 * 通过用户编号查询公积金
	 */
	List<HouseFund> getHouseFundListByUserId(long userId);
	/*
	 * 添加一条记录
	 */
	boolean addHouseFund(HouseFund targetItem);
	/*
	 * 审核通过
	 */
	boolean updateHouseFundPass(long id);
	/*
	 * 审核不通过
	 */
	boolean updateHouseFundFail(long id);
	/*
	 * 删除一条记录
	 */
	boolean deleteHouseFundById(long id);
}
