package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.ResidenceCancel;

public interface ResidenceCancelDao {
	/*
	 * 查询 hr_residence_cancel 表全部
	 */
	List<ResidenceCancel> queryResidenceCancelAll();
	/*
	 * 查询 hr_residence_cancel 表全部
	 */
	List<ResidenceCancel> queryResidenceCancelByTargetItem(@Param("targetItem")ResidenceCancel targetItem);
	/*
	 * 插入 hr_residence_cancel 一条记录
	 */
	int insertIntoResidenceCancelByTargetItem(@Param("targetItem")ResidenceCancel targetItem);
	/*
	 * 更新 hr_residence_cancel 一条记录
	 */
	int updateResidenceCancelByTargetItem(@Param("targetItem")ResidenceCancel targetItem);
	/*
	 * 删除 hr_residence_cancel 一条记录
	 */
	int deleteResidenceCancelByTargetItem(@Param("targetItem")ResidenceCancel targetItem);
}
