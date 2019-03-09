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
	 */
	List<InsuranceOut> queryInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
	/*
	 * 插入 hr_insurance_out 表一条记录
	 */
	int insertIntoInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
	/*
	 * 插入 hr_insurance_out 表一条记录
	 */
	int updateInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
	/*
	 * 插入 hr_insurance_out 表一条记录
	 */
	int deleteInsuranceOutByTargetItem(@Param("targetItem")InsuranceOut targetItem);
}
