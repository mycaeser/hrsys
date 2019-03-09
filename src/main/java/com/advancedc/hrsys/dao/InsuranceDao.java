package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.Insurance;

public interface InsuranceDao {
	/*
	 * 查询 hr_insurance 表，selec * from hr_insurance
	 */
	List<Insurance> queryInsuranceAll();
	/*
	 * 根据具体项 查询hr_insurance 表
	 */
	List<Insurance> queryInsuranceByTargetItem(@Param("targetItem")Insurance targetItem);
	/*
	 * 插入 hr_insurance 表一条记录
	 */
	int insertIntoInsuranceByTargetItem(@Param("targetItem")Insurance targetItem);
	/*
	 * 更新 hr_insurance 表一条记录
	 * 只允许通过该表ID、用户编号更新
	 */
	int updateInsuranceByTargetItem(@Param("targetItem")Insurance targetItem);
	/*
	 * 删除 hr_insurance 表一条记录
	 * 只允许通过过该表ID、用户编删除
	 */
	int deleteInsuranceByTargetItem(@Param("targetItem")Insurance targetItem);
}
