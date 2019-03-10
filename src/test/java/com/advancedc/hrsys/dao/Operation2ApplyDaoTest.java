package com.advancedc.hrsys.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.advancedc.hrsys.BaseTest;
import com.advancedc.hrsys.entity.Operation2Apply;

public class Operation2ApplyDaoTest extends BaseTest{
	@Autowired
	private Operation2ApplyDao operation2ApplyDao;
	
	@Test
	@Ignore
	public void testSelectDao() {
		List<Operation2Apply> Operation2ApplyList=operation2ApplyDao.queryOperation2ApplyAll();
		for(int i=0;i<Operation2ApplyList.size();i++) {
			System.out.println(Operation2ApplyList.get(i).getContent());
		}
	}
	@Test
	@Ignore
	public void testSelectDao1() {
		List<Operation2Apply> Operation2ApplyList;
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setId(1L);
		Operation2ApplyList=operation2ApplyDao.queryOperation2ApplyByTargetItem(targetItem);
		for(int i=0;i<Operation2ApplyList.size();i++) {
			System.out.println(Operation2ApplyList.get(i).getContent());
		}
	}
	@Test
	@Ignore
	public void tesInsertDao() {
		Date aimTDate = (new Date());
		Timestamp aimTimestamp = new Timestamp(aimTDate.getTime());
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setCategoryTypeId(1);
		targetItem.setCategoryWhich(1);
		targetItem.setContent("第二条测试");
		targetItem.setCreatedTime(aimTimestamp);
		targetItem.setEditedTime(aimTimestamp);
		targetItem.setIsChecked(1);
		targetItem.setReason("第二条测试原因");
		targetItem.setUserId(1L);
		int effecdNum=operation2ApplyDao.insertIntoOperation2ApplyByTargetItem(targetItem);
		System.out.println(effecdNum);
	}
	@Test
	@Ignore
	public void testUpdateDao() {
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setContent("222第三条测试");
		targetItem.setId(1L);
		int effecdNum=operation2ApplyDao.updateOperation2ApplyByTargetItem(targetItem);
		System.out.println(effecdNum);
	}
	@Test
	
	public void testDeleteDao() {
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setId(2L);
		int effecdNum=operation2ApplyDao.deleteOperation2ApplyByTargetItem(targetItem);
		System.out.println(effecdNum);
	}
}
