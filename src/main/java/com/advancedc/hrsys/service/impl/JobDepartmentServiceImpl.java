package com.advancedc.hrsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advancedc.hrsys.dao.JobDepartmentDao;
import com.advancedc.hrsys.entity.JobDepartment;
import com.advancedc.hrsys.service.JobDepartmentService;

@Service
public class JobDepartmentServiceImpl implements JobDepartmentService{
	@Autowired
	private JobDepartmentDao jobDepartmentDao;
	
	@Override
	public List<JobDepartment> getJobDepartmentAll(){
		List<JobDepartment> jobDepartmentList=jobDepartmentDao.queryJobDepartmentAll();
		return jobDepartmentList;
	}
	@Override
	public JobDepartment getJobDepartmentById(long id) {
		JobDepartment targetItem=new JobDepartment();
		targetItem.setId(id);
		List<JobDepartment> jobDepartmentList=jobDepartmentDao.queryJobDeparTmentBytargetItem(targetItem);
		return jobDepartmentList.get(0);
	}
	@Override
	public boolean addJobDepartment(JobDepartment targetItem) {
		int effectedNum=jobDepartmentDao.insertIntoJobDepartmentByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	@Override
	public boolean deleteJobDepartmentById(long id) {
		JobDepartment targetItem=new JobDepartment();
		targetItem.setId(id);
		int effectedNum=jobDepartmentDao.deleteJobDepartmentByTargetItem(targetItem);
		return effectedNum > 0 ? true:false;
	}
	
}
