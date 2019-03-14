package com.advancedc.hrsys.service.impl;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.UserInfoDao;
import com.advancedc.hrsys.dto.UserInfoExecution;
import com.advancedc.hrsys.entity.UserInfo;
import com.advancedc.hrsys.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private UserInfoDao userInfoDao;
	
	@Override
	public List<UserInfo> getUserInfoAll(){
		List<UserInfo> userInfoList=userInfoDao.queryUserInfoAll();
		return userInfoList;
	}
	
	@Override
	public UserInfoExecution getUserInfoById(long id) {
		UserInfo someone=new UserInfo();
		someone.setId(id);
		List<UserInfo> userInfoList=userInfoDao.queryUserInfoBySomeone(someone);
		return new UserInfoExecution(userInfoList.get(0));
	}
	
	@Override
	public UserInfo getUserInfoByIdCard(String idCard) {
		UserInfo someone=new UserInfo();
		someone.setIdCard(idCard);
		List<UserInfo> userInfoList=userInfoDao.queryUserInfoBySomeone(someone);
		return userInfoList.get(0);
	}
	
	@Override
	public boolean addUserInfo(UserInfo someone) {
		int effectedNum=userInfoDao.insertIntoUserInfoBySomeone(someone);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateUserInfoFullTime(long id,java.sql.Date fullTime) {
		UserInfo someone=new UserInfo();
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		someone.setId(id);
		someone.setFullTime(fullTime);
		someone.setEditedTime(editedTime);
		int effectedNum=userInfoDao.updateUserInfoBySomeone(someone);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteUserInfo(long id) {
		UserInfo someone=new UserInfo();
		someone.setId(id);
		int effectedNum=userInfoDao.deleteUserInfoBySomeone(someone);
		return effectedNum > 0 ? true:false;
	}
}
