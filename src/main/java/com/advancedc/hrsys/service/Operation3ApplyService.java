package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.Operation3Apply;

public interface Operation3ApplyService {
	/*
	 * 查询全部  申请表
	 */
	List<Operation3Apply> getOperation3ApplyAll();
	/*
	 * 根据主键ID查询申请表
	 */
	Operation3Apply getOperation3ApplyById(long id);
	/*
	 * 根据用户ID查询申请表
	 */
	List<Operation3Apply> getOperation3ApplyByUserId(long userId);
	/*
	 * 审核通过
	 */
	boolean updateOperation3ApplyPass(long id,String reasonString);
	/*
	 * 审核不通过
	 */
	boolean updateOperation3ApplyFail(long id,String reasonString);
	/*
	 * 添加一条申请表
	 */
	boolean addOperation3Apply(Operation3Apply targetItem);
	/*
	 * 删除一条申请表
	 */
	boolean deleteOperation3Apply(long id);
}
