package com.advancedc.hrsys.dao;


import java.sql.Timestamp;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.HouseFund;

public class HouseFundDaoTest extends BaseTest {
	@Autowired
	private HouseFundDao houseFundDao;
	

	@Test
	@Ignore
	public void testHouseFundDao() {
		HouseFund targetItem = new HouseFund();
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		targetItem.setUserId(1L);
		targetItem.setStartTime(aimSQLdate);
		targetItem.setEndTime(aimSQLdate);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setAmount(123);
		targetItem.setIsChecked(1);
		int effectedNum = houseFundDao.insertIntoHouseFundByTargetItem(targetItem);

		System.out.println(effectedNum);
	}

	@Test
	@Ignore
	public void testUpdateHouseFundDao() {
		HouseFund targetItem = new HouseFund();
		//targetItem.setId(1L);
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		targetItem.setUserId(1L);
		targetItem.setStartTime(aimSQLdate);
		targetItem.setEndTime(aimSQLdate);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setAmount(125);
		targetItem.setIsChecked(1);
		int effectedNum = houseFundDao.updateHouseFundByTargetItem(targetItem);

		System.out.println(effectedNum);
	}
	@Test
	public void testDelete() {
		HouseFund targetItem = new HouseFund();
		targetItem.setId(5L);
		int effectedNum = houseFundDao.deleteHouseFundByTargetItem(targetItem);

		System.out.println(effectedNum);
	}

}
