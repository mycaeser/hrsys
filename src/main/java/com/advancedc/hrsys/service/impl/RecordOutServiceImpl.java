package com.advancedc.hrsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.RecordOutDao;
import com.advancedc.hrsys.entity.RecordOut;
import com.advancedc.hrsys.service.RecordOutService;

@Service
public class RecordOutServiceImpl implements RecordOutService{
	@Autowired
	private RecordOutDao recordOutDao;
	
	@Override
	public List<RecordOut> getRecordOutAll(){
		List<RecordOut> recordOutList=recordOutDao.queryRecordOutDaoAll();
		return recordOutList;
	}
	@Override
	public RecordOut getRecordOutById(long id) {
		RecordOut targetItem=new RecordOut();
		targetItem.setId(id);
		List<RecordOut> recordOutList=recordOutDao.queryRecordOutDaoByTargetItem(targetItem);
		return recordOutList.get(0);
	}
	@Override
	public List<RecordOut> getRecordOutByUserId(long userId){
		RecordOut targetItem=new RecordOut();
		targetItem.setUserId(userId);
		List<RecordOut> recordOutList=recordOutDao.queryRecordOutDaoByTargetItem(targetItem);
		return recordOutList;
	}
	@Override
	public boolean addRecordOut(RecordOut targetItem) {
		int effectedNum=recordOutDao.insertIntoRecordOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteRecordOutById(long id) {
		RecordOut targetItem=new RecordOut();
		targetItem.setId(id);
		int effectedNum=recordOutDao.deleteRecordOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}

}
