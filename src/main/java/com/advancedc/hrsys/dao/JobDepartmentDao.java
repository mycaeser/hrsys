package com.advancedc.hrsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.advancedc.hrsys.entity.JobDepartment;

public interface JobDepartmentDao {
	/*
	 * 查询 hr_job_department 表，select * from hr_job_department
	 */
	List<JobDepartment> queryJobDepartmentAll();
	/*
	 * 根据具体项查询 hr_job_department 表
	 * 例如，根据部门编号、部门名称查询
	 */
	List<JobDepartment> queryJobDepartmentByAimedItem(@Param("aimedItem")JobDepartment aimedItem);
	/*
	 * 插入 hr_job_department 表具体项
	 * 
	 */
	int insertIntoJobDepartmentByAimedItem(@Param("aimedItem")JobDepartment aimedItem);
	/*
	 * 更新 hr_job_department 一条
	 * 只允许通过编号、部门名称更新
	 */
	int updateJobDepartmentByAimedItem(@Param("aimedItem")JobDepartment aimedItem);
	/*
	 * 删除 hr_job_department 一条
	 * 只允许通过编号、部门名称删除
	 */
	int deleteJobDepartmentByAimedItem(@Param("aimedItem")JobDepartment aimedItem);
	
}
