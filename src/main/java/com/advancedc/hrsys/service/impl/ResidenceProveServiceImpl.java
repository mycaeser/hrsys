package com.advancedc.hrsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.ResidenceProveDao;
import com.advancedc.hrsys.entity.ResidenceProve;
import com.advancedc.hrsys.service.ResidenceProveService;

@Service
public class ResidenceProveServiceImpl implements ResidenceProveService{
	@Autowired
	private ResidenceProveDao residenceProveDao;
	
	@Override
	public List<ResidenceProve> getResidenceProveAll(){
		List<ResidenceProve> residenceProveList=residenceProveDao.queryResidenceProveAll();
		return residenceProveList;
	}
	@Override
	public ResidenceProve getResidenceProveById(long id) {
		ResidenceProve targetItem=new ResidenceProve();
		targetItem.setId(id);
		List<ResidenceProve> residenceProveList=residenceProveDao.queryResidenceProveByTargetItem(targetItem);
		return residenceProveList.get(0);
	}
	@Override
	public List<ResidenceProve> getResidenceProveByUserId(long userId){
		ResidenceProve targetItem=new ResidenceProve();
		targetItem.setUserId(userId);
		List<ResidenceProve> residenceProveList=residenceProveDao.queryResidenceProveByTargetItem(targetItem);
		return residenceProveList;
	}
	@Override
	public boolean addResidenceProve(ResidenceProve targetItem) {
		int effectedNum=residenceProveDao.insertIntoResidenceProveByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteResidenceProveById(long id) {
		ResidenceProve targetItem=new ResidenceProve();
		targetItem.setId(id);
		int effectedNum=residenceProveDao.deleteResidenceProveByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
