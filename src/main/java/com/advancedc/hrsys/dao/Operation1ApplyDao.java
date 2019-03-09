package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.Operation1Apply;

public interface Operation1ApplyDao {
	/*
	 * 查询 hr_operation1_apply 表全部记录，select * from hr_operation1_apply
	 */
	List<Operation1Apply> queryOperation1ApplyAll();
	/*
	 * 根据具体项 查询 hr_operation1_apply 表
	 */
	List<Operation1Apply> queryOperation1ApplyByTargetItem(@Param("targetItem")Operation1Apply targetItem);
	/*
	 * 插入 hr_operation1_apply 表一条记录
	 */
	int insertIntoOperation1ApplyByTargetItem(@Param("targetItem")Operation1Apply targetItem);
	/*
	 * 更新 hr_operation1_apply 表一条记录
	 */
	int updateOperation1ApplyByTargetItem(@Param("targetItem")Operation1Apply targetItem);
	/*
	 * 删除 hr_operation1_apply 表一条记录
	 */
	int deleteOperation1ApplyByTargetItem(@Param("targetItem")Operation1Apply targetItem);
}
