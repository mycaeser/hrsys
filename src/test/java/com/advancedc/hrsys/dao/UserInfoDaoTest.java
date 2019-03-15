package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.UserInfo;

public class UserInfoDaoTest extends BaseTest{
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Test
	
	public void testSelect() {
		List<UserInfo> userInfoList=userInfoDao.queryUserInfoAll();
		for(int i=0;i<userInfoList.size();i++) {
			//System.out.println(userInfoList.get(i).getName());
			
			System.out.println(userInfoList.get(i).getJobDepartment().getName());
		}
	}
	@Test
	@Ignore
	public void testSelect1() {
		UserInfo someone=new UserInfo();
		someone.setId(1L);
		List<UserInfo> userInfoList=userInfoDao.queryUserInfoBySomeone(someone);
		for(int i=0;i<userInfoList.size();i++) {
			System.out.println(userInfoList.get(i).getName());
		}
	}
	@Test
	@Ignore
	public void testSelect2() {
		/*
		 * 当 数据库里有 两条数据时 1尼古拉斯赵四2赵日天
		 * 0-1 尼古拉斯赵四 ，1-2赵日天 ，0-2 尼古拉斯赵四 赵日天
		 */
		List<UserInfo> userInfoList=userInfoDao.queryUserInfoByRange(0, 2);
		for(int i=0;i<userInfoList.size();i++) {
			System.out.println(userInfoList.get(i).getName());
		}
	}
	@Test
	@Ignore
	public void testInsertDao() {
//		Date aimTDate = (new Date());
//		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
//		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
//		UserInfo someone=new UserInfo();
//		someone.setName("张三");//必填
//		someone.setGender(1);//必填
//		someone.setIdCard("343242342432");//非必填
//		someone.setIsMarried(1);//非必填
//		someone.setDepartmentId(1);//非必填
//		someone.setPositionId(1);//非必填
//		someone.setPhone("13232323");//非必填
//		someone.setPriority(1);//必填
//		someone.setEntryTime(aimSQLdate);//必填
//		someone.setFullTime(aimSQLdate);//非必填
//		someone.setCreatedTime(aimTimestamp);//必填
//		someone.setEditedTime(aimTimestamp);//必填
//		int effecedNum=userInfoDao.insertIntoUserInfoBySomeone(someone);
//		System.out.println(effecedNum);
	}
	@Test
	@Ignore
	public void testUpdateDao() {
		//Date aimTDate = (new Date());
		//java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		//Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		UserInfo someone=new UserInfo();
		someone.setId(2L);
		someone.setName("张三1");//必填
		//someone.setGender(1);//必填
		//someone.setIdCard("343242342432");//非必填
//		someone.setIsMarried(1);//非必填
//		someone.setDepartmentId(1);//非必填
//		someone.setPositionId(1);//非必填
//		someone.setPhone("666666666");//非必填
//		someone.setPriority(1);//必填
//		someone.setEntryTime(aimSQLdate);//必填
//		someone.setFullTime(aimSQLdate);//非必填
//		someone.setCreatedTime(aimTimestamp);//必填
//		someone.setEditedTime(aimTimestamp);//必填
		int effecedNum=userInfoDao.updateUserInfoBySomeoneOnlyChangeNameOrIDcard(someone);
		System.out.println(effecedNum);
	}
	@Test
	@Ignore
	public void testDeleteDao() {
		UserInfo someone=new UserInfo();
		someone.setId(3L);
		int effecedNum=userInfoDao.deleteUserInfoBySomeone(someone);
		System.out.println(effecedNum);
	}
}
