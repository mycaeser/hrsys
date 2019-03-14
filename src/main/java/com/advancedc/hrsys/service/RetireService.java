package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.Retire;

public interface RetireService {
	/*
	 * 查询全部退休信息
	 */
	List<Retire> getRetireAll();
	/*
	 * 通过主键ID查询退休记录
	 */
	Retire getRetireById(long id);
	/*
	 * 通过用户ID查询退休记录
	 */
	List<Retire> getRetireByUserId(long userId);
	/*
	 * 添加一条记录
	 */
	boolean addRetire(Retire targetItem);
	/*
	 * 审核通过
	 */
	boolean updateRetirePass(long id);
	/*
	 * 审核不通过
	 */
	boolean updateRetireFail(long id);
	/*
	 * 删除一条记录
	 */
	boolean deleteRetireById(long id);
}
