package com.advancedc.hrsys.service;

import java.util.List;

import com.advancedc.hrsys.entity.JobDepartment;

public interface JobDepartmentService {
	/*
	 * 查询全部部门
	 */
	List<JobDepartment> getJobDepartmentAll();
	/*
	 * 通过主键查询部门
	 */
	JobDepartment getJobDepartmentById(long id);
	/*
	 * 添加一个部门
	 */
	boolean addJobDepartment(JobDepartment targetItem);
	/*
	 * 删除一个部门
	 */
	boolean deleteJobDepartmentById(long id);
}
