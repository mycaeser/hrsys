package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.Operation4ApplyDao;
import com.advancedc.hrsys.entity.Operation4Apply;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.Operation4ApplyService;

@Service
public class Operation4ApplyServiceImpl implements Operation4ApplyService{
	@Autowired
	private Operation4ApplyDao Operation4ApplyDao;
	
	@Override
	public List<Operation4Apply> getOperation4ApplyAll(){
		List<Operation4Apply> Operation4ApplyList=Operation4ApplyDao.queryOperation4ApplyAll();
		return Operation4ApplyList;
	}
	@Override
	public Operation4Apply getOperation4ApplyById(long id) {
		Operation4Apply targetItem=new Operation4Apply();
		targetItem.setId(id);
		List<Operation4Apply> Operation4ApplyList=Operation4ApplyDao.queryOperation4ApplyByTargetItem(targetItem);
		return Operation4ApplyList.get(0);
	}
	@Override
	public List<Operation4Apply> getOperation4ApplyByUserId(long userId){
		Operation4Apply targetItem=new Operation4Apply();
		targetItem.setUserId(userId);
		List<Operation4Apply> Operation4ApplyList=Operation4ApplyDao.queryOperation4ApplyByTargetItem(targetItem);
		return Operation4ApplyList;
	}
	@Override
	public boolean updateOperation4ApplyPass(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation4Apply targetItem=new Operation4Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=Operation4ApplyDao.insertIntoOperation4ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateOperation4ApplyFail(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation4Apply targetItem=new Operation4Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=Operation4ApplyDao.insertIntoOperation4ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean addOperation4Apply(Operation4Apply targetItem) {
		int effectedNum=Operation4ApplyDao.insertIntoOperation4ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteOperation4Apply(long id) {
		Operation4Apply targetItem=new Operation4Apply();
		targetItem.setId(id);
		int effectedNum=Operation4ApplyDao.deleteOperation4ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
