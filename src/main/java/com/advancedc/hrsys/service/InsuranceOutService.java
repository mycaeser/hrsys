package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.InsuranceOut;

public interface InsuranceOutService {
	/*
	 * 查询全部保险转出信息
	 */
	List<InsuranceOut> getInsuranceOutAll();
	/*
	 * 根据主键查询一条保险转出信息
	 */
	InsuranceOut getInsuranceOutById(long id);
	/*
	 * 根据用户编号查询
	 */
	List<InsuranceOut> getInsuranceOutByUserId(long userId);
	/*
	 * 根据保险种类查询
	 */
	List<InsuranceOut> getInsuranceOutByTypeId(Integer insuranceId);
	/*
	 * 添加一条信息
	 */
	boolean addInsurance(InsuranceOut targetItem);
	/*
	 * 更新审核状态为通过
	 */
	boolean updateInsurancePass(long id);
	/*
	 * 更新审核状态为失败
	 */
	boolean updateInsuranceFail(long id);
	/*
	 * 删除一条记录
	 */
	boolean deleteInsuranceById(long id);
}
