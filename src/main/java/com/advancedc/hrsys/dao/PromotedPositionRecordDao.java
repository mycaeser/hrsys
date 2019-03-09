package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.PromotedPositionRecord;

public interface PromotedPositionRecordDao {
	/*
	 * 查询 hr_promoted_position_record 表全部记录，select * from hr_promoted_position_record
	 */
	List<PromotedPositionRecord> queryPromotedPositionRecordAll();
	/*
	 * 根据具体项 查询 hr_promoted_position_record 表
	 */
	List<PromotedPositionRecord> queryPromotedPositionRecordByTargetItem(@Param("targetItem")PromotedPositionRecord targetItem);
	/*
	 * 插入 hr_promoted_position_record 一条记录
	 */
	int insertIntoPromotedPositionRecordByTargetItem(@Param("targetItem")PromotedPositionRecord targetItem);
	/*
	 * 更新 hr_promoted_position_record 一条记录
	 */
	int updatePromotedPositionRecordByTargetItem(@Param("targetItem")PromotedPositionRecord targetItem);
	/*
	 * 删除 hr_promoted_position_record 一条记录
	 */
	int deletePromotedPositionRecordByTargetItem(@Param("targetItem")PromotedPositionRecord targetItem);
}
