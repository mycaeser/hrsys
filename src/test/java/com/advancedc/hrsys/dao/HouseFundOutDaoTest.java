package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.bouncycastle.jcajce.provider.asymmetric.ec.SignatureSpi.ecCVCDSA;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.HouseFundOut;

public class HouseFundOutDaoTest extends BaseTest{
	@Autowired
	private HouseFundOutDao houseFundOutDao;
	
	@Test
	@Ignore
	public void testSelectDao() {
		List<HouseFundOut> houseFundOutList=houseFundOutDao.queryHouseFundOutAll();
		for(int i=0;i<houseFundOutList.size();i++) {
			System.out.println(houseFundOutList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testSelectDao1() {
		HouseFundOut targetItem=new HouseFundOut();
		targetItem.setId(1L);
		List<HouseFundOut> houseFundOutList=houseFundOutDao.queryHouseFundOutByTargetItem(targetItem);
		for(int i=0;i<houseFundOutList.size();i++) {
			System.out.println(houseFundOutList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testInsertDao() {
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		HouseFundOut targetItem=new HouseFundOut();
		targetItem.setAmount(98);
		targetItem.setApplyTime(aimSQLdate);
		targetItem.setConfirmTime(aimSQLdate);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setIsChecked(1);
		targetItem.setReason("第二条测试");
		targetItem.setUserId(1);
		int effecedNum=houseFundOutDao.insertIntoHouseFundOutByTargetItem(targetItem);
		System.out.println(effecedNum);
	}
	@Test
	@Ignore
	public void testUpdateDao() {
		HouseFundOut targetItem=new HouseFundOut();
		targetItem.setAmount(108);
		targetItem.setId(1);
		int effecedNum=houseFundOutDao.updateHouseFundOutByTargetItem(targetItem);
		System.out.println(effecedNum);
	}
	@Test
	public void testDeleteDao() {
		HouseFundOut targetItem=new HouseFundOut();
		targetItem.setId(2);
		int effecedNum=houseFundOutDao.deleteHouseFundOutByTargetItem(targetItem);
		System.out.println(effecedNum);
	}
}
