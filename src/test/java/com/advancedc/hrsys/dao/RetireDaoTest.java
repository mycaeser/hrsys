package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.Retire;

public class RetireDaoTest extends BaseTest{
	@Autowired
	private RetireDao retireDao;
	
	@Test
	@Ignore
	public void testSelectDao() {
		List<Retire> retireList;
		Retire targetItem=new Retire();
		targetItem.setId(1L);
		retireList=retireDao.queryRetireByTargetItem(targetItem);
		for(int i=0;i<retireList.size();i++) {
			System.out.println(retireList.get(i).getCreatedTime());
		}
	}
	@Test
	@Ignore
	public void testInsertDao() {
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		Retire targetItem=new Retire();
		targetItem.setUserId(1L);
		targetItem.setAmount(99);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setStartTime(aimSQLdate);
		targetItem.setEndTime(aimSQLdate);
		targetItem.setIsChecked(1);
		int effectedNum=retireDao.inserIntoRetireByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdateDao() {
		//Date aimTDate = (new Date());
		//java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		//Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		Retire targetItem=new Retire();
		targetItem.setUserId(1L);
		targetItem.setAmount(101);
		
		int effectedNum=retireDao.updateRetireByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	public void testDeleteDao() {
		Retire targetItem=new Retire();
		targetItem.setId(2L);
		int effectedNum=retireDao.deleteRetireByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
