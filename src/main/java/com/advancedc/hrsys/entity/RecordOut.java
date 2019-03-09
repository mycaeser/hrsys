package com.advancedc.hrsys.entity;

import java.sql.Timestamp;

public class RecordOut {
	//档案表主键
	private long id;
	//所属用户编号
	private long userId;
	//档案描述
	private String describe;
	//档案类型
	private String type;
	//档案操作原因
	private String reason;
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
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
