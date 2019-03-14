package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.Operation2ApplyDao;
import com.advancedc.hrsys.entity.Operation2Apply;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.Operation2ApplyService;

@Service
public class Operation2ApplyServiceImpl implements Operation2ApplyService{
	@Autowired
	private Operation2ApplyDao Operation2ApplyDao;
	
	@Override
	public List<Operation2Apply> getOperation2ApplyAll(){
		List<Operation2Apply> Operation2ApplyList=Operation2ApplyDao.queryOperation2ApplyAll();
		return Operation2ApplyList;
	}
	@Override
	public Operation2Apply getOperation2ApplyById(long id) {
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setId(id);
		List<Operation2Apply> Operation2ApplyList=Operation2ApplyDao.queryOperation2ApplyByTargetItem(targetItem);
		return Operation2ApplyList.get(0);
	}
	@Override
	public List<Operation2Apply> getOperation2ApplyByUserId(long userId){
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setUserId(userId);
		List<Operation2Apply> Operation2ApplyList=Operation2ApplyDao.queryOperation2ApplyByTargetItem(targetItem);
		return Operation2ApplyList;
	}
	@Override
	public boolean updateOperation2ApplyPass(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=Operation2ApplyDao.insertIntoOperation2ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateOperation2ApplyFail(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=Operation2ApplyDao.insertIntoOperation2ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean addOperation2Apply(Operation2Apply targetItem) {
		int effectedNum=Operation2ApplyDao.insertIntoOperation2ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteOperation2Apply(long id) {
		Operation2Apply targetItem=new Operation2Apply();
		targetItem.setId(id);
		int effectedNum=Operation2ApplyDao.deleteOperation2ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
