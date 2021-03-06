package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.Retire;

public interface RetireDao {
	/*
	 * 查询 hr_retire 表，select * form hr_retire
	 */
	List<Retire> queryRetireAll();
	/*
	 * 根据具体项 查询 hr_retire 表
	 * 只允许通过 主键 和用户编号 查询
	 */
	List<Retire> queryRetireByTargetItem(@Param("targetItem")Retire targetItem);
	/*
	 * 插入 hr_retire 表一条记录
	 */
	int inserIntoRetireByTargetItem(@Param("targetItem")Retire targetItem);
	/*
	 * 更新 hr_retire 表一条记录
	 * 只允许通过过该表ID、用户编号更新 开始时间，结束时间，金额、审核状态、修改时间
	 */
	int updateRetireByTargetItem(@Param("targetItem")Retire targetItem);
	/*
	 * 删除 hr_retire 表一条记录
	 * 只允许通过过该表ID、用户编号删除
	 */
	int deleteRetireByTargetItem(@Param("targetItem")Retire targetItem);
}
