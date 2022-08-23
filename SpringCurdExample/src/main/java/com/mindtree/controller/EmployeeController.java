package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.bean.EmployeeBean;
import com.mindtree.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired

	private EmployeeService service;

	@GetMapping(value = "/getemployee")
	public ResponseEntity<List<EmployeeBean>> getEmployeeDetails() {
		List<EmployeeBean> employeeDetails = service.getEmployeeDetails();
		return ResponseEntity.ok(employeeDetails);
	}

}
