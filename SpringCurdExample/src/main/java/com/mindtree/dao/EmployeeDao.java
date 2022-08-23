package com.mindtree.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mindtree.bean.EmployeeBean;

@Repository
public class EmployeeDao {
	
	public static List<EmployeeBean>getEmployeeData(){
		List<EmployeeBean>empList=new ArrayList<EmployeeBean>();
		empList.add(new EmployeeBean(101,"sham","8057","hyd"));
		empList.add(new EmployeeBean(102,"ram","3456","bbsr"));
		empList.add(new EmployeeBean(103,"john","9875","pune"));
		empList.add(new EmployeeBean(104,"sima","3478","usa"));
		empList.add(new EmployeeBean(105,"sina","4673","pune"));
		empList.add(new EmployeeBean(106,"suresh","5732","chennai"));
		return null;
	}

}
