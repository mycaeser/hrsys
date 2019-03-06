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
	 */
	List<Retire> queryRetireByAimedItem(@Param("aimedItem")Retire aimedItem);
}
