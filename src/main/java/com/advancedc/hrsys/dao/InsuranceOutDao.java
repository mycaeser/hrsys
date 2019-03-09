package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.InsuranceOut;

public interface InsuranceOutDao {
	/*
	 * 查询 hr_insurance_out 表全部，select * from hr_insurance_out
	 */
	List<InsuranceOut> queryInsuranceOutAll();
	/*
	 * 查询 hr_insurance_out 表全部，select * from hr_insurance_out
	 * 只允许根据 主键、用户编号、保险类型编号查询
	 */
	List<InsuranceOut> queryInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
	/*
	 * 插入  hr_insurance_out 表一条记录
	 */
	int insertIntoInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
	/*
	 * 更新 hr_insurance_out 表一条记录
	 * 只允许通过 主键更新 原因描述、审核状态、修改时间
	 */
	int updateInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
	/*
	 * 删除  hr_insurance_out 表一条记录
	 */
	int deleteInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
}
