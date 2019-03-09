package com.advancedc.hrsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.HouseFundDao;
import com.advancedc.hrsys.entity.HouseFund;
import com.advancedc.hrsys.service.HouseFundService;

@Service
public class HouseFundServiceImpl implements HouseFundService{
	@Autowired
	private HouseFundDao houseFundDao;
	@Override
	public List<HouseFund>  getHouseFundListAll(){
		List<HouseFund> houseFundList=null;
		houseFundList=houseFundDao.queryHouseFundAll();
		return houseFundList;
	}
	@Override
	public List<HouseFund>  getHouseFundListByTargetItem(HouseFund targetItem){
		List<HouseFund> houseFundList=null;
		houseFundList=houseFundDao.queryHouseFundByTargetItem(targetItem);
		return houseFundList;
	}
}
