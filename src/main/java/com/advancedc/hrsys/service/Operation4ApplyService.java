package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.Operation4Apply;

public interface Operation4ApplyService {
	/*
	 * 查询全部  申请表
	 */
	List<Operation4Apply> getOperation4ApplyAll();
	/*
	 * 根据主键ID查询申请表
	 */
	Operation4Apply getOperation4ApplyById(long id);
	/*
	 * 根据用户ID查询申请表
	 */
	List<Operation4Apply> getOperation4ApplyByUserId(long userId);
	/*
	 * 审核通过
	 */
	boolean updateOperation4ApplyPass(long id,String reasonString);
	/*
	 * 审核不通过
	 */
	boolean updateOperation4ApplyFail(long id,String reasonString);
	/*
	 * 添加一条申请表
	 */
	boolean addOperation4Apply(Operation4Apply targetItem);
	/*
	 * 删除一条申请表
	 */
	boolean deleteOperation4Apply(long id);
}
