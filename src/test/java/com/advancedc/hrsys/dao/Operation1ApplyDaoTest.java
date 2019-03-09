package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.Operation1Apply;

public class Operation1ApplyDaoTest extends BaseTest{
	@Autowired
	private Operation1ApplyDao operation1ApplyDao;
	
	@Test
	@Ignore
	public void testSelectDao() {
		List<Operation1Apply> operation1ApplyList=operation1ApplyDao.queryOperation1ApplyAll();
		for(int i=0;i<operation1ApplyList.size();i++) {
			System.out.println(operation1ApplyList.get(i).getContent());
		}
	}
	@Test
	@Ignore
	public void testSelectDao1() {
		List<Operation1Apply> operation1ApplyList;
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setId(1L);
		operation1ApplyList=operation1ApplyDao.queryOperation1ApplyByTargetItem(targetItem);
		for(int i=0;i<operation1ApplyList.size();i++) {
			System.out.println(operation1ApplyList.get(i).getContent());
		}
	}
	@Test
	@Ignore
	public void tesInsertDao() {
		Date aimTDate = (new Date());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setCategoryTypeId(1);
		targetItem.setCategoryWhich(1);
		targetItem.setContent("第三条测试");
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setIsChecked(1);
		targetItem.setReason("第三条测试原因");
		targetItem.setUserId(1L);
		int effecdNum=operation1ApplyDao.insertIntoOperation1ApplyByTargetItem(targetItem);
		System.out.println(effecdNum);
	}
	@Test
	@Ignore
	public void testUpdateDao() {
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setContent("1111第三条测试");
		targetItem.setId(1L);
		int effecdNum=operation1ApplyDao.updateOperation1ApplyByTargetItem(targetItem);
		System.out.println(effecdNum);
	}
	@Test
	public void testDeleteDao() {
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setId(5L);
		int effecdNum=operation1ApplyDao.deleteOperation1ApplyByTargetItem(targetItem);
		System.out.println(effecdNum);
	}
}
