package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.ResidenceProve;

public interface ResidenceProveDao {
	/*
	 * 查询 hr_residence_prove 表全部记录，select * from hr_residence_prove
	 */
	List<ResidenceProve> queryResidenceProveAll();
	/*
	 * 根据具体项 查询 hr_residence_prove 表
	 */
	List<ResidenceProve> queryResidenceProveByTargetItem(@Param("targetItem")ResidenceProve targetItem);
	/*
	 * 插入 hr_residence_prove 表一条记录
	 */
	int insertIntoResidenceProveByTargetItem(@Param("targetItem")ResidenceProve targetItem);
	/*
	 * 更新 hr_residence_prove 表一条记录
	 */
	int updateResidenceProveByTargetItem(@Param("targetItem")ResidenceProve targetItem);
	/*
	 * 删除 hr_residence_prove 表一条记录
	 */
	int deleteResidenceProveByTargetItem(@Param("targetItem")ResidenceProve targetItem);
}
