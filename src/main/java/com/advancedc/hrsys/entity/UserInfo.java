package com.advancedc.hrsys.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class UserInfo {
	//用户信息主键
	private long id;
	//姓名
	private String name;
	//性别
	private Integer gender;
	//身份证号码
	private String idCard;
	//是否结婚
	private Integer isMarried;
	//部门编号
	private Integer departmentId;
	//职位编号
	private Integer positionId;
	//电话号码
	private String phone;
	//权限编号
	private Integer priority;
	//入职时间
	private Date entryTime;
	//转正时间
	private Date fullTime;
	//创建时间
	private Timestamp createdTime;
	//修改时间
	private Timestamp editedTime;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Integer getIsMarried() {
		return isMarried;
	}
	public void setIsMarried(Integer isMarried) {
		this.isMarried = isMarried;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Date getEntryTime() {
		return entryTime;
	}
	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	public Date getFullTime() {
		return fullTime;
	}
	public void setFullTime(Date fullTime) {
		this.fullTime = fullTime;
	}
	public Timestamp getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}
	public Timestamp getEditedTime() {
		return editedTime;
	}
	public void setEditedTime(Timestamp editedTime) {
		this.editedTime = editedTime;
	}
}
