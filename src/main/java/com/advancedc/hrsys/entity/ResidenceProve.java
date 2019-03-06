package com.advancedc.hrsys.entity;

import java.sql.Timestamp;

public class ResidenceProve {
	//户口编号
	private long id;
	//所属用户编号
	private long userId;
	//现住址（包括临时租房）
	private String livingAddress;
	//户口所在地
	private String permanentAddress;
	//调函（word文件地址）
	private String proveAddressEvidence;
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
	public String getLivingAddress() {
		return livingAddress;
	}
	public void setLivingAddress(String livingAddress) {
		this.livingAddress = livingAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getProveAddressEvidence() {
		return proveAddressEvidence;
	}
	public void setProveAddressEvidence(String proveAddressEvidence) {
		this.proveAddressEvidence = proveAddressEvidence;
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
