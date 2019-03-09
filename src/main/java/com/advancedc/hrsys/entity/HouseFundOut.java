package com.advancedc.hrsys.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class HouseFundOut {
	// 公积金转出表主键
	private long id;
	// 所属用户表编号
	private long userId;
	// 公积金金额
	private Integer amount;
	// 申请时间
	private Date applyTime;
	// 审核时间
	private Date confirmTime;
	// 审核描述原因
	private String reason;
	// 审核结果
	private Integer isChecked;
	// 创建时间
	private Timestamp createdTime;
	// 修改时间
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
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
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
