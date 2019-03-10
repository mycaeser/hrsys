package com.advancedc.hrsys.dto;

import com.advancedc.hrsys.entity.UserInfo;
import com.advancedc.hrsys.enums.IsMarriedStateEnum;
import com.advancedc.hrsys.enums.PriorityStateEnum;

public class UserInfoExecution {
	//性别 男 或女
	private String genderString;
	//婚育状况 已婚 或 未婚
	private String isMarriedString;
	//权限级别 一级权限 二级权限 三级权限
	private String priorityString;
	//用户信息 原版
	private UserInfo someoneUserInfo;
	//通过有参构造函数，将得到的标志数字改为描述性字符串
	public UserInfoExecution(UserInfo someonIn) {
		genderString=someonIn.getGender()>0?"男":"女";
		isMarriedString=IsMarriedStateEnum.stateOf(someonIn.getIsMarried()).getStateInfo();
		priorityString=PriorityStateEnum.stateOf(someonIn.getPriority()).getStateInfo();
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	}

	public String getIsMarriedString() {
		return isMarriedString;
	}

	public void setIsMarriedString(String isMarriedString) {
		this.isMarriedString = isMarriedString;
	}

	public String getPriorityString() {
		return priorityString;
	}

	public void setPriorityString(String priorityString) {
		this.priorityString = priorityString;
	}

	public UserInfo getSomeoneUserInfo() {
		return someoneUserInfo;
	}

	public void setSomeoneUserInfo(UserInfo someoneUserInfo) {
		this.someoneUserInfo = someoneUserInfo;
	}
	
}
