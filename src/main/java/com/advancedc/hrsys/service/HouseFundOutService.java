package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.HouseFundOut;

public interface HouseFundOutService {
	/*
	 * 获取全部
	 */
	List<HouseFundOut> getHouseFundOutAll();
	/*
	 * 通过主键查询公积金转出
	 */
	HouseFundOut getHouseFundOutById(long id);
	/*
	 * 通过用户编号查询
	 */
	List<HouseFundOut> getHouseFundOutByUserId(long userId);
	/*
	 * 审核通过
	 */
	boolean updateHouseFundOutPass(long id);
	/*
	 * 审核不通过
	 */
	boolean updateHouseFundOutFail(long id);
	/*
	 * 添加一条记录
	 */
	boolean addHouseFundOut(HouseFundOut targetItem);
	/*
	 * 删除一条记录
	 */
	boolean deleteHouseFundOutById(long id);
}
