package com.advancedc.hrsys.entity;

import java.sql.Timestamp;

public class RecordOut {
	//档案表主键
	private long id;
	//所属用户编号
	private long userId;
	//档案描述
	private String describeString;
	//档案类型
	private String typeString;
	//档案操作原因
	private String reasonString;
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
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getDescribeString() {
		return describeString;
	}
	public void setDescribeString(String describeString) {
		this.describeString = describeString;
	}
	public String getTypeString() {
		return typeString;
	}
	public void setTypeString(String typeString) {
		this.typeString = typeString;
	}
	public String getReasonString() {
		return reasonString;
	}
	public void setReasonString(String reasonString) {
		this.reasonString = reasonString;
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
