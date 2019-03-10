package com.advancedc.hrsys.service;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.HouseFund;

public class HouseFundServiceTest extends BaseTest{
	@Autowired
	private HouseFundService houseFundService;
	
	@Test
	@Ignore
	public void testService() {
		List<HouseFund> houseFundList=houseFundService.getHouseFundListAll();
		for (int i = 0; i < houseFundList.size(); i++) {
			System.out.println(houseFundList.get(i).getAmount());
		}
		HouseFund houseFundItem=houseFundService.getHouseFundListById(1L);
		System.out.println(houseFundItem.getCreatedTime());
		houseFundList=houseFundService.getHouseFundListByUserId(1L);
		for (int i = 0; i < houseFundList.size(); i++) {
			System.out.println(houseFundList.get(i).getAmount());
		}
	}
	@Test
	public void testServiceModify() {
		boolean resultFlag=houseFundService.deleteHouseFundById(4L);
		System.out.println(resultFlag);
	}
}
