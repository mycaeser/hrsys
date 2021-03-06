package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.HouseFundOut;

public interface HouseFundOutDao {
	/*
	 * 查询 hr_house_fund_out 表全部，select * from hr_house_fund_out
	 */
	List<HouseFundOut> queryHouseFundOutAll();
	/*
	 * 根据具体项查询 hr_house_fund_out 
	 * 只能通过【主键】和【用户编号】查询
	 */
	List<HouseFundOut> queryHouseFundOutByTargetItem(@Param("targetItem")HouseFundOut targetItem);
	/*
	 * 插入 hr_house_fund_out 一条记录
	 */
	int insertIntoHouseFundOutByTargetItem(@Param("targetItem")HouseFundOut targetItem);
	/*
	 * 更新 hr_house_fund_out 一条记录
	 * 只能通过主键更新 金额、审核状态、修改时间
	 */
	int updateHouseFundOutByTargetItem(@Param("targetItem")HouseFundOut targetItem);
	/*
	 * 删除 hr_house_fund_out 一条记录
	 */
	int deleteHouseFundOutByTargetItem(@Param("targetItem")HouseFundOut targetItem);
}
