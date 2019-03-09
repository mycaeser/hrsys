package com.advancedc.hrsys.enums;

public enum PriorityStateEnum {
	YOUSERLF(1, "一级权限"),HR(2, "二级权限"),ADMINISTRATOR(3, "三级权限");
	
	private int state;

	private String stateInfo;
	
	
	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	
	private PriorityStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	public static PriorityStateEnum stateOf(int index) {
		for (PriorityStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
