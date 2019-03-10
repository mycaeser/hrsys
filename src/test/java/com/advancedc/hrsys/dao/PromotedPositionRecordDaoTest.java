package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.PromotedPositionRecord;

public class PromotedPositionRecordDaoTest extends BaseTest{
	@Autowired
	private PromotedPositionRecordDao promotedPositionRecordDao;
	
	@Test
	@Ignore
	public void testSelect() {
		List<PromotedPositionRecord> promotedPositionRecordList=promotedPositionRecordDao.queryPromotedPositionRecordAll();
		for (int i = 0; i < promotedPositionRecordList.size(); i++) {
			System.out.println(promotedPositionRecordList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testSelect1() {
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setId(1L);
		List<PromotedPositionRecord> promotedPositionRecordList=promotedPositionRecordDao.queryPromotedPositionRecordByTargetItem(targetItem);
		for (int i = 0; i < promotedPositionRecordList.size(); i++) {
			System.out.println(promotedPositionRecordList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testInsert() {
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setApplyTime(aimSQLdate);
		//targetItem.setConfirmTime(aimSQLdate);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setIsChecked(0);
		targetItem.setNewPosition("项目经理");
		targetItem.setOriginalPosition("技术总监");
		targetItem.setReason("工作努力，态度积极");
		targetItem.setUserId(1L);
		int effectedNum=promotedPositionRecordDao.insertIntoPromotedPositionRecordByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdate() {
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setId(3L);
		targetItem.setIsChecked(1);
		int effectedNum=promotedPositionRecordDao.updatePromotedPositionRecordByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	public void testDelete() {
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setId(3L);
		int effectedNum=promotedPositionRecordDao.deletePromotedPositionRecordByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
