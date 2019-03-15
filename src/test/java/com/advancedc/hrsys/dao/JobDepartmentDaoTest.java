//package com.advancedc.hrsys.dao;
//
//import java.sql.Timestamp;
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Ignore;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.advancedc.hrsys.BaseTest;
//import com.advancedc.hrsys.entity.JobDepartment;
//
//public class JobDepartmentDaoTest extends BaseTest{
//	@Autowired
//	private JobDepartmentDao jobDepartmentDao;
//	
//	@Test
//	@Ignore
//	public void testSelect() {
//		List<JobDepartment> jobDepartmentList=jobDepartmentDao.queryJobDepartmentAll();
//		for (int i = 0; i < jobDepartmentList.size(); i++) {
//			System.out.println(jobDepartmentList.get(i).getName());
//		}
//	}
//	@Test
//	@Ignore
//	public void testSelect1() {
//		JobDepartment targetItem=new JobDepartment();
//		targetItem.setId(1L);
//		List<JobDepartment> jobDepartmentList=jobDepartmentDao.queryJobDeparTmentBytargetItem(targetItem);
//		for (int i = 0; i < jobDepartmentList.size(); i++) {
//			System.out.println(jobDepartmentList.get(i).getName());
//		}
//	}
//	@Test
//	
//	public void testInsert() {
//		Date aimTDate = (new Date());
//		//java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
//		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
//		JobDepartment targetItem=new JobDepartment();
//		targetItem.setContent("负责公司对政府各部门承接的项目");
//		targetItem.setCreatedTime(aimTimestamp);
//		targetItem.setEditedTime(aimTimestamp);
//		targetItem.setName("政府事业部");
//		int effectedNum=jobDepartmentDao.insertIntoJobDepartmentByTargetItem(targetItem);
//		System.out.println(effectedNum);
//	}
//	@Test
//	@Ignore
//	public void testUpdate() {
//		JobDepartment targetItem=new JobDepartment();
//		targetItem.setContent("负责公司对政府各部门承接的项目1");
//		targetItem.setId(2L);
//		int effectedNum=jobDepartmentDao.updateJobDepartmentByTargetItem(targetItem);
//		System.out.println(effectedNum);
//	}
//	@Test
//	@Ignore
//	public void testDelete() {
//		JobDepartment targetItem=new JobDepartment();
//		targetItem.setId(2L);
//		int effectedNum=jobDepartmentDao.deleteJobDepartmentByTargetItem(targetItem);
//		System.out.println(effectedNum);
//	}
//}
