package com.advancedc.hrsys.service.impl;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.HouseFundOutDao;
import com.advancedc.hrsys.entity.HouseFundOut;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.HouseFundOutService;

@Service
public class HouseFundOutServiceImpl implements HouseFundOutService{
	@Autowired
	private HouseFundOutDao houseFundOutDao;
	
	@Override
	public List<HouseFundOut> getHouseFundOutAll(){
		List<HouseFundOut> houseFundOutList=houseFundOutDao.queryHouseFundOutAll();
		return houseFundOutList;
	}
	
	@Override
	public HouseFundOut getHouseFundOutById(long id) {
		HouseFundOut targetItem=new HouseFundOut();
		targetItem.setId(id);
		List<HouseFundOut> houseFundOutList=houseFundOutDao.queryHouseFundOutByTargetItem(targetItem);
		return houseFundOutList.get(0);
	}
	@Override
	public List<HouseFundOut> getHouseFundOutByUserId(long userId){
		HouseFundOut targetItem=new HouseFundOut();
		targetItem.setUserId(userId);
		List<HouseFundOut> houseFundOutList=houseFundOutDao.queryHouseFundOutByTargetItem(targetItem);
		return houseFundOutList;
	}
	@Override
	public boolean updateHouseFundOutPass(long id) {
		HouseFundOut targetItem=new HouseFundOut();
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		targetItem.setId(id);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=houseFundOutDao.insertIntoHouseFundOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateHouseFundOutFail(long id) {
		HouseFundOut targetItem=new HouseFundOut();
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		targetItem.setId(id);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=houseFundOutDao.insertIntoHouseFundOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean addHouseFundOut(HouseFundOut targetItem) {
		int effectedNum=houseFundOutDao.insertIntoHouseFundOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteHouseFundOutById(long id) {
		HouseFundOut targetItem=new HouseFundOut();
		targetItem.setId(id);
		int effectedNum=houseFundOutDao.deleteHouseFundOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
