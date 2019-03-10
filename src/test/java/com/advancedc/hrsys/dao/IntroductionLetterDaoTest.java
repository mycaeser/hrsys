package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.IntroductionLetter;

public class IntroductionLetterDaoTest extends BaseTest{
	@Autowired
	private IntroductionLetterDao introductionLetterDao;
	
	@Test
	@Ignore
	public void testSelect() {
		List<IntroductionLetter> introductionLetterList=introductionLetterDao.queryIntroductionLetterAll();
		for (int i = 0; i < introductionLetterList.size(); i++) {
			System.out.println(introductionLetterList.get(i).getOriginalCompanyPosition());
		}
	}
	@Test
	@Ignore
	public void testSelect1() {
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setId(1L);
		List<IntroductionLetter> introductionLetterList=introductionLetterDao.queryIntroductionLetterByTargetItem(targetItem);
		for (int i = 0; i < introductionLetterList.size(); i++) {
			System.out.println(introductionLetterList.get(i).getOriginalCompanyPosition());
		}
	}
	@Test
	@Ignore
	public void testInsert() {
		Date aimTDate = (new Date());
		java.sql.Date aimSQLdate = new java.sql.Date(new java.util.Date().getTime());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setApplyTime(aimSQLdate);
		targetItem.setConfirmTime(aimSQLdate);
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setIsChecked(1);
		targetItem.setNewCompanyPosition("UBER中国国际总部上海国际");
		targetItem.setOriginalCompanyPosition("微软中国技术架构师");
		targetItem.setReason("寻求海外发行");
		targetItem.setUserId(1L);
		int effectedNum=introductionLetterDao.insertIntoIntroductionLetterByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	@Ignore
	public void testUpdate() {
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setId(2L);
		targetItem.setIsChecked(0);
		int effectedNum=introductionLetterDao.updateIntroductionLetterByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
	@Test
	public void testDelete() {
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setId(2L);
		int effectedNum=introductionLetterDao.deleteIntroductionLetterByTargetItem(targetItem);
		System.out.println(effectedNum);
	}
}
