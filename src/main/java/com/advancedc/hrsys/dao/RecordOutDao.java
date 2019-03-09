package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.RecordOut;

public interface RecordOutDao {
	/*
	 * 查询 hr_record_out 表全部
	 */
	List<RecordOut> queryRecordOutDaoAll();
	/*
	 * 查询 hr_record_out 表全部
	 */
	List<RecordOut> queryRecordOutDaoByTargetItem(@Param("targetItem")RecordOut targetItem);
	/*
	 * 插入 hr_record_out 一条记录
	 */
	int insertIntoRecordOutByTargetItem(@Param("targetItem")RecordOut targetItem);
	/*
	 * 更新 hr_record_out 一条记录
	 */
	int updateRecordOutByTargetItem(@Param("targetItem")RecordOut targetItem);
	/*
	 * 删除 hr_record_out 一条记录
	 */
	int deleteRecordOutByTargetItem(@Param("targetItem")RecordOut targetItem);
}
