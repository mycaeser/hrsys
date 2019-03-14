package com.advancedc.hrsys.enums;


public enum IsCheckedStateEnum {
	CHECKING(1, "审核中"),FAIL(2, "审核不通过"),PASS(3, "审核通过");
	
	private int state;

	private String stateInfo;
	
	
	public int getState() {
		return state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	
	private IsCheckedStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	public static IsCheckedStateEnum stateOf(int index) {
		for (IsCheckedStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
