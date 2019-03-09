package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.Operation4Apply;

public interface Operation4ApplyDao {
	/*
	 * 查询 hr_operation4_apply 表全部记录，select * from hr_operation4_apply
	 */
	List<Operation4Apply> queryOperation4ApplyAll();
	/*
	 * 根据具体项 查询 hr_operation4_apply 表
	 */
	List<Operation4Apply> queryOperation4ApplyByTargetItem(@Param("targetItem")Operation4Apply targetItem);
	/*
	 * 插入 hr_operation4_apply 表一条记录
	 */
	int insertIntoOperation4ApplyByTargetItem(@Param("targetItem")Operation4Apply targetItem);
	/*
	 * 更新 hr_operation4_apply 表一条记录
	 */
	int updateOperation4ApplyByTargetItem(@Param("targetItem")Operation4Apply targetItem);
	/*
	 * 删除 hr_operation4_apply 表一条记录
	 */
	int deleteOperation4ApplyByTargetItem(@Param("targetItem")Operation4Apply targetItem);
}
