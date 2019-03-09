package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.HouseFund;

public interface HouseFundDao {
	/*
	 * 查询 hr_house_fund 表，select * from hr_house_fund
	 */
	List<HouseFund> queryHouseFundAll();
	/*
	 * 根据具体项查询 hr_house_fund 表
	 * 只能根据 【主键】 和 【用户编号】 查询
	 */
	List<HouseFund> queryHouseFundByTargetItem(@Param("targetItem")HouseFund targetItem);
	/*
	 * 插入 hr_house_fund 表一条记录
	 */
	int insertIntoHouseFundByTargetItem(@Param("targetItem")HouseFund targetItem);
	/*
	 * 更新 hr_house_fund 表一条记录
	 * 只能根据 【主键】 和 【用户编号】 更新 开始时间、结束时间、金额、审核状态、修改时间
	 */
	int updateHouseFundByTargetItem(@Param("targetItem")HouseFund targetItem);
	/*
	 * 删除 hr_house_fund 表一条记录
	 */
	int deleteHouseFundByTargetItem(@Param("targetItem")HouseFund targetItem);
}
