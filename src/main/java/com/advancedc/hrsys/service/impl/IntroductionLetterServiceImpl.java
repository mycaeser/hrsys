package com.advancedc.hrsys.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.IntroductionLetterDao;
import com.advancedc.hrsys.entity.IntroductionLetter;
import com.advancedc.hrsys.enums.IsCheckedStateEnum;
import com.advancedc.hrsys.service.IntroductionLetterService;

@Service
public class IntroductionLetterServiceImpl implements IntroductionLetterService{
	@Autowired
	private IntroductionLetterDao introductionLetterDao;
	
	@Override
	public List<IntroductionLetter> getIntroductionLetterAll(){
		List<IntroductionLetter> introductionLetterList=introductionLetterDao.queryIntroductionLetterAll();
		return introductionLetterList;
	}
	@Override
	public IntroductionLetter getIntroductionLetterById(long id) {
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setId(id);
		List<IntroductionLetter> introductionLetterList=introductionLetterDao.queryIntroductionLetterByTargetItem(targetItem);
		return introductionLetterList.get(0);
	}
	@Override
	public List<IntroductionLetter> getIntroductionLetterByUserId(long userId){
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setUserId(userId);
		List<IntroductionLetter> introductionLetterList=introductionLetterDao.queryIntroductionLetterByTargetItem(targetItem);
		return introductionLetterList;
	}
	@Override
	public boolean updateIntroductionLetterPass(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setId(id);
		targetItem.setIsChecked(IsCheckedStateEnum.PASS.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=introductionLetterDao.updateIntroductionLetterByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean updateIntroductionLetterFail(long id) {
		Date aimTDate = new Date();
		Timestamp editedTime = new Timestamp(aimTDate.getTime());
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setId(id);
		targetItem.setIsChecked(IsCheckedStateEnum.FAIL.getState());
		targetItem.setEditedTime(editedTime);
		int effectedNum=introductionLetterDao.updateIntroductionLetterByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean addIntroductionLetter(IntroductionLetter targetItem) {
		int effectedNum=introductionLetterDao.updateIntroductionLetterByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteIntroductionLetterById(long id) {
		IntroductionLetter targetItem=new IntroductionLetter();
		targetItem.setId(id);
		int effectedNum=introductionLetterDao.deleteIntroductionLetterByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
}
