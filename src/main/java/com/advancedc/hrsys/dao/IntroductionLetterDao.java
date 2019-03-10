package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.IntroductionLetter;

public interface IntroductionLetterDao {
	/*
	 * 查询 hr_introduction_letter 表，select * from hr_introduction_letter
	 */
	List<IntroductionLetter> queryIntroductionLetterAll();
	/*
	 * 根据具体项 查询 hr_introduction_letter 表
	 */
	List<IntroductionLetter> queryIntroductionLetterByTargetItem(@Param("targetItem") IntroductionLetter targetItem);
	/*
	 * 插入 hr_introduction_letter 表一条记录
	 */
	int insertIntoIntroductionLetterByTargetItem(@Param("targetItem") IntroductionLetter targetItem);
	/*
	 * 更新 hr_introduction_letter 表一条记录
	 */
	int updateIntroductionLetterByTargetItem(@Param("targetItem") IntroductionLetter targetItem);
	/*
	 * 删除 hr_introduction_letter 表一条记录
	 */
	int deleteIntroductionLetterByTargetItem(@Param("targetItem") IntroductionLetter targetItem);
}
