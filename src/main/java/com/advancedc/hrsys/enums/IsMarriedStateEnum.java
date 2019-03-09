package com.advancedc.hrsys.enums;

public enum IsMarriedStateEnum {
	MARRIED(1, "已婚"),SINGLETON(0, "单身");
	
	private int state;

	private String stateInfo;
	
	
	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	
	private IsMarriedStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	public static IsMarriedStateEnum stateOf(int index) {
		for (IsMarriedStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
