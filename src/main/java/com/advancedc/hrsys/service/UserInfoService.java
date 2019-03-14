package com.advancedc.hrsys.service;

import java.sql.Date;
import java.util.List;

import com.advancedc.hrsys.dto.UserInfoExecution;
import com.advancedc.hrsys.entity.UserInfo;

public interface UserInfoService {
	/*
	 * 获取全部个人信息
	 */
	List<UserInfo> getUserInfoAll();
	/*
	 * 通过主键获取一个人的信息
	 */
	UserInfoExecution getUserInfoById(long id);
	/*
	 * 通过身份证获取信息
	 */
	UserInfo getUserInfoByIdCard(String idCard);
	/*
	 * 添加一个人的信息入数据库
	 */
	boolean addUserInfo(UserInfo someone);
	/*
	 * 转正，添加转正时间
	 */
	boolean updateUserInfoFullTime(long id,Date fullTime);
	/*
	 * 删除一条记录
	 */
	boolean deleteUserInfo(long id);
}
