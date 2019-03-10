package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.InsuranceOut;

public class InsuranceOutDaoTest extends BaseTest{
	@Autowired
	private InsuranceOutDao insuranceOutDao;
	
	@Test
	@Ignore
	public void testSelect() {
		List<InsuranceOut> insuranceOutList=insuranceOutDao.queryInsuranceOutAll();
		for (int i = 0; i < insuranceOutList.size(); i++) {
			System.out.println(insuranceOutList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testSelect1() {
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setId(1L);
		List<InsuranceOut> insuranceOutList=insuranceOutDao.queryInsuranceOutByTargetItem(targetItem);
		for (int i = 0; i < insuranceOutList.size(); i++) {
			System.out.println(insuranceOutList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testInsert() {
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setApplyTime(aimSQLdate);
		targetItem.setConfirmTime(aimSQLdate);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setInsuranceId(1);
		targetItem.setIsChecked(1);
		targetItem.setReason("第二个审核通过");
		targetItem.setUserId(1L);
		int effectedNum=insuranceOutDao.insertIntoInsuranceOutByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdate() {
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setReason("111第二个审核通过");
		targetItem.setId(1L);
		int effectedNum=insuranceOutDao.updateInsuranceOutByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testDelete() {
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setId(2L);
		int effectedNum=insuranceOutDao.deleteInsuranceOutByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
