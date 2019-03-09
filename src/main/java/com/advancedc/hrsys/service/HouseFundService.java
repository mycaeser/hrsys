package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.HouseFund;

public interface HouseFundService {
	/*
	 * 查询全部公积金
	 */
	List<HouseFund> getHouseFundListAll();
	/*
	 * 通过主键、用户编号查询公积金
	 */
	List<HouseFund> getHouseFundListByTargetItem(HouseFund targetItem);
}
