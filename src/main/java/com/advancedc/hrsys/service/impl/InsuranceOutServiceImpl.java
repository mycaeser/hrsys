package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.advancedc.hrsys.dao.InsuranceOutDao;
import com.advancedc.hrsys.entity.InsuranceOut;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.InsuranceOutService;

@Service
public class InsuranceOutServiceImpl implements InsuranceOutService{
	@Autowired
	private InsuranceOutDao insuranceOutDao;
	
	@Override
	public List<InsuranceOut> getInsuranceOutAll(){
		List<InsuranceOut> insuranceOutList=insuranceOutDao.queryInsuranceOutAll();
		return insuranceOutList;
	}
	
	@Override
	public InsuranceOut getInsuranceOutById(long id) {
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setId(id);
		List<InsuranceOut> insuranceOutList=insuranceOutDao.queryInsuranceOutByTargetItem(targetItem);
		return insuranceOutList.get(0);
	}
	@Override
	public List<InsuranceOut> getInsuranceOutByUserId(long userId){
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setUserId(userId);
		List<InsuranceOut> insuranceOutList=insuranceOutDao.queryInsuranceOutByTargetItem(targetItem);
		return insuranceOutList;
	}
	@Override
	public List<InsuranceOut> getInsuranceOutByTypeId(Integer insuranceId){
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setInsuranceId(insuranceId);
		List<InsuranceOut> insuranceOutList=insuranceOutDao.queryInsuranceOutByTargetItem(targetItem);
		return insuranceOutList;
	}
	@Override
	public boolean addInsurance(InsuranceOut targetItem) {
		int effectedNum=insuranceOutDao.insertIntoInsuranceOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateInsurancePass(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setId(id);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=insuranceOutDao.updateInsuranceOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateInsuranceFail(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setId(id);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=insuranceOutDao.updateInsuranceOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteInsuranceById(long id) {
		InsuranceOut targetItem=new InsuranceOut();
		targetItem.setId(id);
		int effectedNum=insuranceOutDao.deleteInsuranceOutByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
