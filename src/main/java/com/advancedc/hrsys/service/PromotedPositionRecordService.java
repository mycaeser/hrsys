package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.PromotedPositionRecord;

public interface PromotedPositionRecordService {
	/*
	 * 查询全部职位晋升记录
	 */
	List<PromotedPositionRecord> getPromotedPositionRecordAll();
	/*
	 * 通过主键ID查询 晋升记录
	 */
	PromotedPositionRecord getPromotedPositionRecordById(long id);
	/*
	 * 通过用户编号ID查询晋升记录
	 */
	List<PromotedPositionRecord> getPromotedPositionRecordByUserId(long userId);
	/*
	 * 添加一条记录
	 */
	boolean addPromotedPositionRecord(PromotedPositionRecord targetItem);
	/*
	 * 审核记录通过
	 */
	boolean updatePromotedPositionRecordPass(long id,String reaString);
	/*
	 * 审核记录不通过
	 */
	boolean updatePromotedPositionRecordFail(long id,String reaString);
	/*
	 * 删除一条记录
	 */
	boolean deletePromotedPositionRecord(long id);
}
