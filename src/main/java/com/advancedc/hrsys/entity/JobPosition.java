package com.advancedc.hrsys.entity;

import java.sql.Timestamp;

public class JobPosition {
	//职位编号
	private long id;
	//职位名称
	private String name;
	//职位简介
	private String content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
