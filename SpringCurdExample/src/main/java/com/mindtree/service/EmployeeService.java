package com.mindtree.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bean.EmployeeBean;
import com.mindtree.dao.EmployeeDao;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeeDao;
	
	public List<EmployeeBean>getEmployeeDetails(){
		List<EmployeeBean>employeeData=employeeDao.getEmployeeData();
		return employeeData;
	}

}
