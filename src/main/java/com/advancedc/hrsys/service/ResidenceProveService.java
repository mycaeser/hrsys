package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.ResidenceProve;

public interface ResidenceProveService {
	/*
	 * 查询全部户口信息
	 */
	List<ResidenceProve> getResidenceProveAll();
	/*
	 * 根据主键ID查询
	 */
	ResidenceProve getResidenceProveById(long id);
	/*
	 * 通过用户编号ID查询
	 */
	List<ResidenceProve> getResidenceProveByUserId(long userId);
	/*
	 * 添加一条记录
	 */
	boolean addResidenceProve(ResidenceProve targetItem);
	/*
	 * 删除一条
	 */
	boolean deleteResidenceProveById(long id);
}
