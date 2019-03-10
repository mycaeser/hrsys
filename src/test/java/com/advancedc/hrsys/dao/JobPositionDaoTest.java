package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.JobPosition;

public class JobPositionDaoTest extends BaseTest{
	@Autowired
	private JobPositionDao jobPositionDao;
	
	@Test
	@Ignore
	public void testSelect() {
		List<JobPosition> jobPositionList=jobPositionDao.queryJobPositionAll();
		for (int i = 0; i < jobPositionList.size(); i++) {
			System.out.println(jobPositionList.get(i).getName());
		}
	}
	@Test
	@Ignore
	public void testSelect1() {
		JobPosition targetItem=new JobPosition();
		targetItem.setId(1L);
		List<JobPosition> jobPositionList=jobPositionDao.queryJobPositionByTargetItem(targetItem);
		for (int i = 0; i < jobPositionList.size(); i++) {
			System.out.println(jobPositionList.get(i).getName());
		}
	}
	@Test
	@Ignore
	public void testInsert() {
		Date aimTDate = (new Date());
		//java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		JobPosition targetItem=new JobPosition();
		targetItem.setContent("技术总监");
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setName("技术总监");
		int effectedNum=jobPositionDao.insertIntoJobPositionByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdate() {
		JobPosition targetItem=new JobPosition();
		targetItem.setContent("技术总监1");
		targetItem.setId(2L);
		int effectedNum=jobPositionDao.updateJobPositionByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testDelete() {
		JobPosition targetItem=new JobPosition();
		targetItem.setId(2L);
		int effectedNum=jobPositionDao.deleteJobPositionByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
