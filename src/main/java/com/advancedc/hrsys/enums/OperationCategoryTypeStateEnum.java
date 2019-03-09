package com.advancedc.hrsys.enums;

public enum OperationCategoryTypeStateEnum {
	USERINFO(1, "用户表"),RETIRE(2, "退休表"),INSURANCE(3, "保险表"),HOUSEFUND(4, "公积金表");
	
	private int state;

	private String stateInfo;
	
	
	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	
	private OperationCategoryTypeStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	public static OperationCategoryTypeStateEnum stateOf(int index) {
		for (OperationCategoryTypeStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
