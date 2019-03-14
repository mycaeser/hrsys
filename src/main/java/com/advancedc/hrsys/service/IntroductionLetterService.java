package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.IntroductionLetter;

public interface IntroductionLetterService {
	/*
	 * 查询全部介绍信
	 */
	List<IntroductionLetter> getIntroductionLetterAll();
	/*
	 * 根据主键查询
	 */
	IntroductionLetter getIntroductionLetterById(long id);
	/*
	 * 根据用户编号查询
	 */
	List<IntroductionLetter> getIntroductionLetterByUserId(long userId);
	/*
	 * 根据主键更新审核状态为通过
	 */
	boolean updateIntroductionLetterPass(long id);
	/*
	 * 更新不通过
	 */
	boolean updateIntroductionLetterFail(long id);
	/*
	 * 添加一条记录
	 */
	boolean addIntroductionLetter(IntroductionLetter targetItem);
	/*
	 * 删除一条记录
	 */
	boolean deleteIntroductionLetterById(long id);
}
