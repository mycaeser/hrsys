package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.Insurance;

public class InsuranceDaoTest extends BaseTest{
	@Autowired
	private InsuranceDao insuranceDao;
	
	@Test
	@Ignore
	public void testInsuranceSelectDao() {
		List<Insurance> targetItemList;
		Insurance targetItem=new Insurance();
		targetItem.setId(2L);
		targetItemList=insuranceDao.queryInsuranceByTargetItem(targetItem);
		for(int i=0;i<targetItemList.size();i++) {
			System.out.println(targetItemList.get(i).getAmount());
		}
	}
	@Test
	@Ignore
	public void testInsertDao() {
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		Insurance targetItem=new Insurance();
		targetItem.setAmount(231);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setEndTime(aimSQLdate);
		targetItem.setIsChecked(1);
		targetItem.setStartTime(aimSQLdate);
		targetItem.setTypeId(2);
		targetItem.setUserId(1L);
		int effectedNum=insuranceDao.insertIntoInsuranceByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdateDao() {
		Insurance targetItem=new Insurance();
		targetItem.setAmount(234);
		targetItem.setId(1);
		int effectedNum=insuranceDao.updateInsuranceByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	public void testDeleteDao() {
		Insurance targetItem=new Insurance();
		targetItem.setId(3);
		int effectedNum=insuranceDao.deleteInsuranceByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
