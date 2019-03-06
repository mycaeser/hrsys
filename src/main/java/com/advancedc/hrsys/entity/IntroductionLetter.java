package com.advancedc.hrsys.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class IntroductionLetter {
	//介绍信编号
	private long id;
	//所属用户编号
	private long userId;
	//原公司原职位
	private String originalCompanyPosition;
	//新公司新职位
	private String newCompanyPosition;
	//申请时间
	private Date applyTime;
	//审核时间
	private Date confirmTime;
	//审核描述原因
	private String reason;
	//审核状态
	private Integer isChecked;
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
	public String getOriginalCompanyPosition() {
		return originalCompanyPosition;
	}
	public void setOriginalCompanyPosition(String originalCompanyPosition) {
		this.originalCompanyPosition = originalCompanyPosition;
	}
	public String getNewCompanyPosition() {
		return newCompanyPosition;
	}
	public void setNewCompanyPosition(String newCompanyPosition) {
		this.newCompanyPosition = newCompanyPosition;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Date getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getIsChecked() {
		return isChecked;
	}
	public void setIsChecked(Integer isChecked) {
		this.isChecked = isChecked;
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
