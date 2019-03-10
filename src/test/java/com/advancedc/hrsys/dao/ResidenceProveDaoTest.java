package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.ResidenceProve;

public class ResidenceProveDaoTest extends BaseTest{
	@Autowired
	private ResidenceProveDao residenceProveDao;
	
	@Test
	@Ignore
	public void testSelect() {
		List<ResidenceProve> residenceProves=residenceProveDao.queryResidenceProveAll();
		for (int i = 0; i < residenceProves.size(); i++) {
			System.out.println(residenceProves.get(i).getLivingAddress());
		}
	}
	@Test
	@Ignore
	public void testSelect1() {
		ResidenceProve targetItem=new ResidenceProve();
		targetItem.setId(1L);
		List<ResidenceProve> residenceProves=residenceProveDao.queryResidenceProveByTargetItem(targetItem);
		for (int i = 0; i < residenceProves.size(); i++) {
			System.out.println(residenceProves.get(i).getLivingAddress());
		}
	}
	@Test
	@Ignore
	public void testInsert() {
		Date aimTDate = (new Date());
		//java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		ResidenceProve targetItem=new ResidenceProve();
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setLivingAddress("山西XX市ML线程");
		targetItem.setPermanentAddress("做梦呢");
		targetItem.setProveAddressEvidence("/residence");
		targetItem.setUserId(1L);
		int effectedNum=residenceProveDao.insertIntoResidenceProveByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdate() {
		ResidenceProve targetItem=new ResidenceProve();
		targetItem.setId(2L);
		targetItem.setPermanentAddress("山西大同同福客栈");
		int effectedNum=residenceProveDao.updateResidenceProveByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	public void testDelete() {
		ResidenceProve targetItem=new ResidenceProve();
		targetItem.setId(2L);
		int effectedNum=residenceProveDao.deleteResidenceProveByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
