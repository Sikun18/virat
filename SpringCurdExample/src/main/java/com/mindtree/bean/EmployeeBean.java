package com.mindtree.bean;

public class EmployeeBean {
	private int id;
	private String name;
	private String PhNo;
	private String address;

	public EmployeeBean(int id, String name, String phNo, String address) {
		super();
		this.id = id;
		this.name = name;
		PhNo = phNo;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhNo() {
		return PhNo;
	}

	public void setPhNo(String phNo) {
		PhNo = phNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
