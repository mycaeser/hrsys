package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.RecordOut;

public class RecordOutDaoTest extends BaseTest{
	@Autowired
	private RecordOutDao recordOutDao;
	
	@Test
	@Ignore
	public void testSelect() {
		List<RecordOut> recordOutList=recordOutDao.queryRecordOutDaoAll();
		for (int i = 0; i < recordOutList.size(); i++) {
			System.out.println(recordOutList.get(i).getDescribeString());
		}
	}
	@Test
	@Ignore
	public void testSelct1() {
		RecordOut targetItem=new RecordOut();
		targetItem.setId(1L);
		List<RecordOut> recordOutList=recordOutDao.queryRecordOutDaoByTargetItem(targetItem);
		for (int i = 0; i < recordOutList.size(); i++) {
			System.out.println(recordOutList.get(i).getDescribeString());
		}
	}
	@Test
	@Ignore
	public void testInsert() {
		Date aimTDate = (new Date());
		//java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		RecordOut targetItem=new RecordOut();
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setDescribeString("第二条测试");
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setReasonString("第二条测原因");
		targetItem.setTypeString("第二类");
		targetItem.setUserId(1L);
		int effectedNum=recordOutDao.insertIntoRecordOutByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdate() {
		RecordOut targetItem=new RecordOut();
		targetItem.setId(1L);
		targetItem.setReasonString("第二条测原因111");
		int effectedNum=recordOutDao.updateRecordOutByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	public void testDelete() {
		RecordOut targetItem=new RecordOut();
		targetItem.setId(2L);
		int effectedNum=recordOutDao.deleteRecordOutByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
