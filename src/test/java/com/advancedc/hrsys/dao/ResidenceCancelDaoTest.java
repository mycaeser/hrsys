package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.ResidenceCancel;

public class ResidenceCancelDaoTest extends BaseTest{
	@Autowired
	private ResidenceCancelDao residenceCancelDao;
	
	@Test
	@Ignore
	public void testSelect() {
		List<ResidenceCancel> residenceCancelList=residenceCancelDao.queryResidenceCancelAll();
		for (int i = 0; i < residenceCancelList.size(); i++) {
			System.out.println(residenceCancelList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testSelect1() {
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setId(1L);
		List<ResidenceCancel> residenceCancelList=residenceCancelDao.queryResidenceCancelByTargetItem(targetItem);
		for (int i = 0; i < residenceCancelList.size(); i++) {
			System.out.println(residenceCancelList.get(i).getReason());
		}
	}
	@Test
	@Ignore
	public void testInsert() {
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setApplyTime(aimSQLdate);
		targetItem.setConfirmTime(aimSQLdate);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setIsChecked(1);
		targetItem.setReason("这需要原因吗");
		targetItem.setUserId(1L);
		int effectedNum=residenceCancelDao.insertIntoResidenceCancelByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdate() {
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setId(2L);
		targetItem.setReason("这不需要原因吗");
		int effectedNum=residenceCancelDao.updateResidenceCancelByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	public void testDelete() {
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setId(2L);
		int effectedNum=residenceCancelDao.deleteResidenceCancelByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
