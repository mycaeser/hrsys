package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.Insurance;

public interface InsuranceService {
	/*
	 * 获得全部报销信息
	 */
	List<Insurance> getInsuranceAll();
	/*
	 * 通过主键获得一条保险信息
	 */
	Insurance getInsuranceById(long id);
	/*
	 * 通过用户编号获得保险信息
	 */
	List<Insurance> getInsuranceByUserId(long userId);
	/*
	 * 通过保险种类查询信息
	 */
	List<Insurance> getInsuranceByTypeId(Integer typeId);
	/*
	 * 添加一条保险信息
	 */
	boolean addInsurance(Insurance targetItem);
	/*
	 * 通过主键审核一条保险信息
	 */
	boolean updateInsurancePass(long id);
	/*
	 * 通过主键审核一条保险信息
	 */
	boolean updateInsuranceFail(long id);
	/*
	 * 通过主键删除一条
	 */
	boolean deleteInsuranceById(long id);
}
