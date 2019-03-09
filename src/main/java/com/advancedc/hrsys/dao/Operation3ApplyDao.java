package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.Operation3Apply;

public interface Operation3ApplyDao {
	/*
	 * 查询 hr_operation3_apply 表全部记录，select * from hr_operation3_apply
	 */
	List<Operation3Apply> queryOperation3ApplyAll();
	/*
	 * 根据具体项 查询 hr_operation3_apply 表
	 */
	List<Operation3Apply> queryOperation3ApplyByTargetItem(@Param("targetItem")Operation3Apply targetItem);
	/*
	 * 插入 hr_operation3_apply 表一条记录
	 */
	int insertIntoOperation3ApplyByTargetItem(@Param("targetItem")Operation3Apply targetItem);
	/*
	 * 更新 hr_operation3_apply 表一条记录
	 */
	int updateOperation3ApplyByTargetItem(@Param("targetItem")Operation3Apply targetItem);
	/*
	 * 删除 hr_operation3_apply 表一条记录
	 */
	int deleteOperation3ApplyByTargetItem(@Param("targetItem")Operation3Apply targetItem);
}
