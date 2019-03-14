package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.Operation1Apply;

public interface Operation1ApplyService {
	/*
	 * 查询全部  申请表
	 */
	List<Operation1Apply> getOperation1ApplyAll();
	/*
	 * 根据主键ID查询申请表
	 */
	Operation1Apply getOperation1ApplyById(long id);
	/*
	 * 根据用户ID查询申请表
	 */
	List<Operation1Apply> getOperation1ApplyByUserId(long userId);
	/*
	 * 审核通过
	 */
	boolean updateOperation1ApplyPass(long id,String reasonString);
	/*
	 * 审核不通过
	 */
	boolean updateOperation1ApplyFail(long id,String reasonString);
	/*
	 * 添加一条申请表
	 */
	boolean addOperation1Apply(Operation1Apply targetItem);
	/*
	 * 删除一条申请表
	 */
	boolean deleteOperation1Apply(long id);
}
