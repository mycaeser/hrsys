package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.RecordOut;

public interface RecordOutService {
	/*
	 * 查询全部档案
	 */
	List<RecordOut> getRecordOutAll();
	/*
	 * 通过主键ID查询
	 */
	RecordOut getRecordOutById(long id);
	/*
	 * 通过用户编ID号查询
	 */
	List<RecordOut> getRecordOutByUserId(long userId);
	/*
	 * 添加一条记录
	 */
	boolean addRecordOut(RecordOut targetItem);
	/*
	 * 删除一条记录
	 */
	boolean deleteRecordOutById(long id);
}
