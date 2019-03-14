package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.HouseFundDao;
import com.advancedc.hrsys.entity.HouseFund;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.HouseFundService;

@Service
public class HouseFundServiceImpl implements HouseFundService{
	@Autowired
	private HouseFundDao houseFundDao;//自动装载
	
	/*
	 * 返回 查询内容
	 * @see com.advancedc.hrsys.service.HouseFundService#getHouseFundListAll()
	 */
	@Override
	public List<HouseFund>  getHouseFundListAll(){
		List<HouseFund> houseFundList=null;
		houseFundList=houseFundDao.queryHouseFundAll();
		return houseFundList;
	}
	/*
	 * 根据传入的信息查询指定内容
	 * 只能根据 主键ID 查询 只有一条结果
	 * @see com.advancedc.hrsys.service.HouseFundService#getHouseFundListByID(long)
	 */
	@Override
	public HouseFund  getHouseFundListById(long id){
		HouseFund targetItem=new HouseFund();
		targetItem.setId(id);
		List<HouseFund> houseFundList=null;
		houseFundList=houseFundDao.queryHouseFundByTargetItem(targetItem);
		return houseFundList.get(0);
	}
	/*
	 * 根据传入的信息查询指定内容
	 * 只能根据 用户ID 查询 可能有一条结果 也可能多条
	 * @see com.advancedc.hrsys.service.HouseFundService#getHouseFundListByUserID(long)
	 */
	@Override
	public List<HouseFund>  getHouseFundListByUserId(long userId){
		HouseFund targetItem=new HouseFund();
		targetItem.setUserId(userId);
		List<HouseFund> houseFundList=null;
		houseFundList=houseFundDao.queryHouseFundByTargetItem(targetItem);
		return houseFundList;
	}
	/*
	 * 插入一条记录
	 * @see com.advancedc.hrsys.service.HouseFundService#addHouseFund(com.advancedc.hrsys.entity.HouseFund)
	 */
	@Override
	public boolean addHouseFund(HouseFund targetItem){
		int effectedNum=houseFundDao.insertIntoHouseFundByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	/*
	 * 将对应主键 的记录 is_checked 修改为1
	 * @see com.advancedc.hrsys.service.HouseFundService#updateHouseFundPass(long)
	 */
	@Override
	public boolean updateHouseFundPass(long id) {
		HouseFund targetItem=new HouseFund();
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		targetItem.setId(id);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=houseFundDao.updateHouseFundByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	/*
	 * 将对应主键 的记录 is_checked 修改为0
	 * @see com.advancedc.hrsys.service.HouseFundService#updateHouseFundFail(long)
	 */
	@Override
	public boolean updateHouseFundFail(long id) {
		HouseFund targetItem=new HouseFund();
		targetItem.setId(id);
		targetItem.setIsChecked(0);
		int effectedNum=houseFundDao.updateHouseFundByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	/*
	 * 根据主键删除一条记录
	 * @see com.advancedc.hrsys.service.HouseFundService#deleteHouseFundById(long)
	 */
	@Override
	public boolean deleteHouseFundById(long id) {
		HouseFund targetItem=new HouseFund();
		targetItem.setId(id);
		int effectedNum=houseFundDao.deleteHouseFundByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
