package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.Operation2Apply;

public interface Operation2ApplyDao {
	/*
	 * 查询 hr_operation2_apply 表全部记录，select * from hr_operation2_apply
	 */
	List<Operation2Apply> queryOperation2ApplyAll();
	/*
	 * 根据具体项 查询 hr_operation2_apply 表
	 */
	List<Operation2Apply> queryOperation2ApplyByTargetItem(@Param("targetItem")Operation2Apply targetItem);
	/*
	 * 插入 hr_operation2_apply 表一条记录
	 */
	int insertIntoOperation2ApplyByTargetItem(@Param("targetItem")Operation2Apply targetItem);
	/*
	 * 更新 hr_operation2_apply 表一条记录
	 */
	int updateOperation2ApplyByTargetItem(@Param("targetItem")Operation2Apply targetItem);
	/*
	 * 删除 hr_operation2_apply 表一条记录
	 */
	int deleteOperation2ApplyByTargetItem(@Param("targetItem")Operation2Apply targetItem);
}
