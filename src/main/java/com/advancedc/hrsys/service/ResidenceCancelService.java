package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.ResidenceCancel;

public interface ResidenceCancelService {
	/*
	 * 查询全部户口注销记录
	 */
	List<ResidenceCancel> getResidenceCancelAll();
	/*
	 * 通过主键ID查询记录
	 */
	ResidenceCancel getResidenceCancelById(long id);
	/*
	 * 通过用户ID查询记录
	 */
	List<ResidenceCancel> getResidenceCancelByUserId(long userId);
	/*
	 * 审核通过
	 */
	boolean updateResidenceCancelPass(long id,String reasonString);
	/*
	 * 审核不通过
	 */
	boolean updateResidenceCancelFail(long id,String reasonString);
	/*
	 * 添加一条
	 */
	boolean addResidenceCancel(ResidenceCancel targetItem);
	/*
	 * 删除一条
	 */
	boolean deleteResidenceCancel(long id);
}
