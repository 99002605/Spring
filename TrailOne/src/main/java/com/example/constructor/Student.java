package com.example.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	String name;
	Integer studentId;
	Course course;
	 @Autowired
		public Student(Course course) {
			super();
			this.course = course;
		}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentId=" + studentId + ", course=" + course + ", department="
				+ department + "]";
	}
	public String getName() {
		return name;
	}
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStudentId() {
		return studentId;
	}
	@Value("${student.studentId}")
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	@Value("${student.department}")
	public void setDepartment(String department) {
		this.department = department;
	}
	String department;

}
