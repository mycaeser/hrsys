package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.Operation1ApplyDao;
import com.advancedc.hrsys.entity.Operation1Apply;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.Operation1ApplyService;

@Service
public class Operation1ApplyServiceImpl implements Operation1ApplyService{
	@Autowired
	private Operation1ApplyDao operation1ApplyDao;
	
	@Override
	public List<Operation1Apply> getOperation1ApplyAll(){
		List<Operation1Apply> operation1ApplyList=operation1ApplyDao.queryOperation1ApplyAll();
		return operation1ApplyList;
	}
	@Override
	public Operation1Apply getOperation1ApplyById(long id) {
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setId(id);
		List<Operation1Apply> operation1ApplyList=operation1ApplyDao.queryOperation1ApplyByTargetItem(targetItem);
		return operation1ApplyList.get(0);
	}
	@Override
	public List<Operation1Apply> getOperation1ApplyByUserId(long userId){
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setUserId(userId);
		List<Operation1Apply> operation1ApplyList=operation1ApplyDao.queryOperation1ApplyByTargetItem(targetItem);
		return operation1ApplyList;
	}
	@Override
	public boolean updateOperation1ApplyPass(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=operation1ApplyDao.insertIntoOperation1ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateOperation1ApplyFail(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=operation1ApplyDao.insertIntoOperation1ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean addOperation1Apply(Operation1Apply targetItem) {
		int effectedNum=operation1ApplyDao.insertIntoOperation1ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteOperation1Apply(long id) {
		Operation1Apply targetItem=new Operation1Apply();
		targetItem.setId(id);
		int effectedNum=operation1ApplyDao.deleteOperation1ApplyByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
