package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.Operation3ApplyDao;
import com.advancedc.hrsys.entity.Operation3Apply;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.Operation3ApplyService;

@Service
public class Operation3ApplyServiceImpl implements Operation3ApplyService{
	@Autowired
	private Operation3ApplyDao Operation3ApplyDao;
	
	@Override
	public List<Operation3Apply> getOperation3ApplyAll(){
		List<Operation3Apply> Operation3ApplyList=Operation3ApplyDao.queryOperation3ApplyAll();
		return Operation3ApplyList;
	}
	@Override
	public Operation3Apply getOperation3ApplyById(long id) {
		Operation3Apply targetItem=new Operation3Apply();
		targetItem.setId(id);
		List<Operation3Apply> Operation3ApplyList=Operation3ApplyDao.queryOperation3ApplyByTargetItem(targetItem);
		return Operation3ApplyList.get(0);
	}
	@Override
	public List<Operation3Apply> getOperation3ApplyByUserId(long userId){
		Operation3Apply targetItem=new Operation3Apply();
		targetItem.setUserId(userId);
		List<Operation3Apply> Operation3ApplyList=Operation3ApplyDao.queryOperation3ApplyByTargetItem(targetItem);
		return Operation3ApplyList;
	}
	@Override
	public boolean updateOperation3ApplyPass(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation3Apply targetItem=new Operation3Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=Operation3ApplyDao.insertIntoOperation3ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateOperation3ApplyFail(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation3Apply targetItem=new Operation3Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=Operation3ApplyDao.insertIntoOperation3ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean addOperation3Apply(Operation3Apply targetItem) {
		int effectedNum=Operation3ApplyDao.insertIntoOperation3ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteOperation3Apply(long id) {
		Operation3Apply targetItem=new Operation3Apply();
		targetItem.setId(id);
		int effectedNum=Operation3ApplyDao.deleteOperation3ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
