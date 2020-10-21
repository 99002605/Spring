package com.example.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	
	String name;
	Integer id;
	String dept;
	@Autowired
	Address address;
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	@Value("${employee.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	@Value("${employee.id}")
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDept() {
		return dept;
	}
	@Value("${employee.dept}")
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + ", address=" + address + "]";
	}
}
