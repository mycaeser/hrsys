package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.RetireDao;
import com.advancedc.hrsys.entity.Retire;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.RetireService;



@Service
public class RetireServiceImpl implements RetireService{
	@Autowired
	private RetireDao retireDao;
	
	@Override
	public List<Retire> getRetireAll(){
		List<Retire> retireList=retireDao.queryRetireAll();
		return retireList;
	}
	@Override
	public Retire getRetireById(long id) {
		Retire targetItem=new Retire();
		targetItem.setId(id);
		List<Retire> retireList=retireDao.queryRetireByTargetItem(targetItem);
		return retireList.get(0);
	}
	@Override
	public List<Retire> getRetireByUserId(long userId){
		Retire targetItem=new Retire();
		targetItem.setUserId(userId);
		List<Retire> retireList=retireDao.queryRetireByTargetItem(targetItem);
		return retireList;
	}
	@Override
	public boolean addRetire(Retire targetItem) {
		int effectedNum=retireDao.inserIntoRetireByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateRetirePass(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Retire targetItem=new Retire();
		targetItem.setId(id);
		targetItem.setEditedTime(editedTime);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		int effectedNum=retireDao.inserIntoRetireByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateRetireFail(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Retire targetItem=new Retire();
		targetItem.setId(id);
		targetItem.setEditedTime(editedTime);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		int effectedNum=retireDao.inserIntoRetireByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteRetireById(long id) {
		Retire targetItem=new Retire();
		targetItem.setId(id);
		int effectedNum=retireDao.deleteRetireByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
