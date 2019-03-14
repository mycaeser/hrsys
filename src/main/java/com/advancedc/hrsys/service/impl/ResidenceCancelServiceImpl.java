package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.ResidenceCancelDao;
import com.advancedc.hrsys.entity.ResidenceCancel;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.ResidenceCancelService;

@Service
public class ResidenceCancelServiceImpl implements ResidenceCancelService{
	@Autowired
	private ResidenceCancelDao residenceCancelDao;
	
	@Override
	public List<ResidenceCancel> getResidenceCancelAll(){
		List<ResidenceCancel> residenceCancelList=residenceCancelDao.queryResidenceCancelAll();
		return residenceCancelList;
	}
	@Override
	public ResidenceCancel getResidenceCancelById(long id) {
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setId(id);
		List<ResidenceCancel> residenceCancelList=residenceCancelDao.queryResidenceCancelByTargetItem(targetItem);
		return residenceCancelList.get(0);
	}
	@Override
	public List<ResidenceCancel> getResidenceCancelByUserId(long userId){
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setUserId(userId);
		List<ResidenceCancel> residenceCancelList=residenceCancelDao.queryResidenceCancelByTargetItem(targetItem);
		return residenceCancelList;
	}
	@Override
	public boolean updateResidenceCancelPass(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=residenceCancelDao.updateResidenceCancelByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateResidenceCancelFail(long id,String reasonString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setId(id);
		targetItem.setReason(reasonString);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=residenceCancelDao.updateResidenceCancelByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean addResidenceCancel(ResidenceCancel targetItem) {
		int effectedNum=residenceCancelDao.insertIntoResidenceCancelByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteResidenceCancel(long id) {
		ResidenceCancel targetItem=new ResidenceCancel();
		targetItem.setId(id);
		int effectedNum=residenceCancelDao.deleteResidenceCancelByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
