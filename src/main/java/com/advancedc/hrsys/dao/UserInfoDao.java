package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.UserInfo;

public interface UserInfoDao {
	/*
	 * 查询 hr_user_info 表，select * from user_info
	 * 
	 */
	List<UserInfo> queryUserInfoAll();
	/*
	 * 根据范围查询 hr_user_info 表
	 * 例如：queryUserInfoByRange(0,500)表示查询0到500的数据
	 */
	List<UserInfo> queryUserInfoByRange(@Param("start")int start,@Param("end")int end);
	/*
	 * 根据someone的信息查询 hr_user_info 表
	 * 例如：someone.setUserId(1);queryUserInfoByUserId(someone);表示查询ID为1的信息 
	 * 只允许通过主键、姓名、性别、身份证，是否已婚、部门、职位、电话号、入职时间查询
	 */
	List<UserInfo> queryUserInfoBySomeone(@Param("someone")UserInfo someone);
	/*
	 * 根据someone的信息插入hr_user_info表
	 * 例如：
	 * UserInfo someone=new UserInfo();
	 * someone.setId(1);//必填
	 * someone.setName("张三");//必填
	 * someone.setGender(1);//必填
	 * someone.setIdCard("343242342432");//非必填
	 * someone.setIsMarried(1);//非必填
	 * someone.setDepartmentId(1);//非必填
	 * someone.setPositionId(1);//非必填
	 * someone.setPhone("13232323");//非必填
	 * someone.setPriority(1);//必填
	 * someone.setEntryTime("2019-3-6");//必填
	 * someone.setFullTime("2019-3-6");//非必填
	 * someone.setCreateTime("2019-3-6 00:00")//必填
	 * someone.setEditedTime("2019-3-6 00:00")//必填
	 * insertIntoUserInfoBySomeone(someone);
	 */
	int insertIntoUserInfoBySomeone(@Param("someone")UserInfo someone);
	/*
	 * 根据someone的信息删除一条hr_user_info记录
	 */
	int deleteUserInfoBySomeone(@Param("someone")UserInfo someone);
	/*
	 * 根据someone的信息更新一条hr_user_info记录
	 */
	int updateUserInfoBySomeone(@Param("someone")UserInfo someone);
}
