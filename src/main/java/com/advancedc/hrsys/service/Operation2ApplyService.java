package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.Operation2Apply;

public interface Operation2ApplyService {
	/*
	 * 查询全部  申请表
	 */
	List<Operation2Apply> getOperation2ApplyAll();
	/*
	 * 根据主键ID查询申请表
	 */
	Operation2Apply getOperation2ApplyById(long id);
	/*
	 * 根据用户ID查询申请表
	 */
	List<Operation2Apply> getOperation2ApplyByUserId(long userId);
	/*
	 * 审核通过
	 */
	boolean updateOperation2ApplyPass(long id,String reasonString);
	/*
	 * 审核不通过
	 */
	boolean updateOperation2ApplyFail(long id,String reasonString);
	/*
	 * 添加一条申请表
	 */
	boolean addOperation2Apply(Operation2Apply targetItem);
	/*
	 * 删除一条申请表
	 */
	boolean deleteOperation2Apply(long id);
}
