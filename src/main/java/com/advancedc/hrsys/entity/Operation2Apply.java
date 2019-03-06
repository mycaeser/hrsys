package com.advancedc.hrsys.entity;

import java.sql.Timestamp;

public class Operation2Apply {
	//用户审核表，转正
	private long id;
	//所属用户编号
	private long userId;
	//种类，1用户2退休表3保险4公积金
	private Integer categoryTypeId;
	//种类编号
	private long categoryWhich;
	//操作描述
	private String content;
	//审核状态
	private Integer isChecked;
	//审核描述原因
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
	public Integer getCategoryTypeId() {
		return categoryTypeId;
	}
	public void setCategoryTypeId(Integer categoryTypeId) {
		this.categoryTypeId = categoryTypeId;
	}
	public long getCategoryWhich() {
		return categoryWhich;
	}
	public void setCategoryWhich(long categoryWhich) {
		this.categoryWhich = categoryWhich;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}	
	public Integer getIsChecked() {
		return isChecked;
	}
	public void setIsChecked(Integer isChecked) {
		this.isChecked = isChecked;
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
