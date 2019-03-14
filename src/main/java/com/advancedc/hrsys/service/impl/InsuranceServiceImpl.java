package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.InsuranceDao;
import com.advancedc.hrsys.entity.Insurance;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.InsuranceService;

@Service
public class InsuranceServiceImpl implements InsuranceService{
	@Autowired
	private InsuranceDao insuranceDao;
	
	@Override
	public List<Insurance> getInsuranceAll(){
		List<Insurance> insuranceList=insuranceDao.queryInsuranceAll();
		return insuranceList;
	}
	@Override
	public Insurance getInsuranceById(long id) {
		Insurance targetItem=new Insurance();
		targetItem.setId(id);
		List<Insurance> insuranceList=insuranceDao.queryInsuranceByTargetItem(targetItem);
		return insuranceList.get(0);
	}
	@Override
	public List<Insurance> getInsuranceByUserId(long userId){
		Insurance targetItem=new Insurance();
		targetItem.setUserId(userId);
		List<Insurance> insuranceList=insuranceDao.queryInsuranceByTargetItem(targetItem);
		return insuranceList;
	}
	@Override
	public List<Insurance> getInsuranceByTypeId(Integer typeId){
		Insurance targetItem=new Insurance();
		targetItem.setTypeId(typeId);
		List<Insurance> insuranceList=insuranceDao.queryInsuranceByTargetItem(targetItem);
		return insuranceList;
	}
	@Override
	public boolean addInsurance(Insurance targetItem) {
		int effectedNum=insuranceDao.insertIntoInsuranceByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateInsurancePass(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Insurance targetItem=new Insurance();
		targetItem.setId(id);
		targetItem.setEditedTime(editedTime);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		int effectedNum=insuranceDao.updateInsuranceByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateInsuranceFail(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		Insurance targetItem=new Insurance();
		targetItem.setId(id);
		targetItem.setEditedTime(editedTime);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		int effectedNum=insuranceDao.updateInsuranceByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteInsuranceById(long id) {
		Insurance targetItem=new Insurance();
		targetItem.setId(id);
		int effectedNum=insuranceDao.deleteInsuranceByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
