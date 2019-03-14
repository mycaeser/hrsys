package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.PromotedPositionRecordDao;
import com.advancedc.hrsys.entity.PromotedPositionRecord;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.PromotedPositionRecordService;

@Service
public class PromotedPositionRecordServiceImpl implements PromotedPositionRecordService{
	@Autowired
	private PromotedPositionRecordDao promotedPositionRecordDao;
	
	@Override
	public List<PromotedPositionRecord> getPromotedPositionRecordAll(){
		List<PromotedPositionRecord> promotedPositionRecordList=promotedPositionRecordDao.queryPromotedPositionRecordAll();
		return promotedPositionRecordList;
	}
	@Override
	public PromotedPositionRecord getPromotedPositionRecordById(long id) {
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setId(id);
		List<PromotedPositionRecord> promotedPositionRecordList=promotedPositionRecordDao.queryPromotedPositionRecordByTargetItem(targetItem);
		return promotedPositionRecordList.get(0);
	}
	@Override
	public List<PromotedPositionRecord> getPromotedPositionRecordByUserId(long userId){
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setUserId(userId);
		List<PromotedPositionRecord> promotedPositionRecordList=promotedPositionRecordDao.queryPromotedPositionRecordByTargetItem(targetItem);
		return promotedPositionRecordList;
	}
	@Override
	public boolean addPromotedPositionRecord(PromotedPositionRecord targetItem) {
		int effectedNum=promotedPositionRecordDao.insertIntoPromotedPositionRecordByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updatePromotedPositionRecordPass(long id,String reaString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setId(id);
		targetItem.setReason(reaString);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=promotedPositionRecordDao.updatePromotedPositionRecordByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updatePromotedPositionRecordFail(long id,String reaString) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setId(id);
		targetItem.setReason(reaString);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=promotedPositionRecordDao.updatePromotedPositionRecordByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deletePromotedPositionRecord(long id) {
		PromotedPositionRecord targetItem=new PromotedPositionRecord();
		targetItem.setId(id);
		int effectedNum=promotedPositionRecordDao.deletePromotedPositionRecordByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
